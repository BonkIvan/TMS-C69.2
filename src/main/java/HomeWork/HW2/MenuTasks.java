package HomeWork.HW2;
import java.util.Scanner;

public class MenuTasks {
    short num;
    Scanner scanner;

    public MenuTasks(Scanner scanner) {
        this.scanner = scanner;
    }

    public void controlStructures(){
        ControlStructures controlStructures = new ControlStructures();
        do {
                System.out.println("""
                        
                        ========Меню=======
                        1 - Сезон года по месяцу через switch
                        2 - Сезон года по месяцу через if
                        3 - Определение четности числа
                        4 - Температура на улице
                        5 - Цвет радуги
                        6 - выход в предыдущее меню\s""");
                num  = scanner.nextShort();
            switch (num) {
                case 1 -> {
                    System.out.println("Введите номер месяца: ");
                    controlStructures.monthNumber(
                            scanner.nextInt()
                    );
                }
                case 2 -> {
                    System.out.println("Введите номер месяца: ");
                    controlStructures.season(
                            scanner.nextInt()
                    );
                }
                case 3 -> {
                    System.out.println("Введите целое число: ");
                    controlStructures.evennessNumb(
                            scanner.nextInt()
                    );
                }
                case 4 -> {
                    System.out.println("Введите целое число: ");
                    controlStructures.temperature(
                            scanner.nextInt()
                    );
                }
                case 5 -> {
                    System.out.println("Введите целое число: ");
                    controlStructures.rianbowColor(
                            scanner.nextInt()
                    );
                }
                default -> System.out.println("Выход");
            }

        }while (num<6);

    }
    public void cycles(){
        Cycles cycles = new Cycles();
        do{
                System.out.println("""

                        ========Меню=======
                        1 - Цикл, вывести все нечетные от 1 до 99
                        2 - Цикл, числа от 5 до 1
                        3 - Сумма чисел
                        4 - Вывести числа 7/14/21...98
                        5 - Первые 10 чисел последовательнсти 0/-5/-10...
                        6 - Программа, выводящая квадраты чисел от 10 до 20 включительно
                        7 - выход в предыдущее меню\s""");
                num = scanner.nextShort();

            switch (num) {
                case 1 -> cycles.evennessNumb();
                case 2 -> cycles.fiveToOne();
                case 3 -> {
                    System.out.println("Введите число: ");
                    cycles.sumOfNum(
                            scanner.nextInt()
                    );
                }
                case 4 -> cycles.numSequence();
                case 5 -> cycles.firstNumSequence();
                case 6 -> cycles.square();
                default -> System.out.println("Нет такого пункта в меню");
            }

        }while (num<7);

    }
    public void addTasks(){
        AddTasks addTasks = new AddTasks();
        do {
            System.out.println("""

                    ========Меню=======
                    1 - Первый 11 чисел Фибоначчи
                    2 - Расчет ставки депозита
                    3 - Таблица умнажения (от 1 до 10)
                    4 - выход в предыдущее меню\s""");
            num = scanner.nextShort();

            switch (num) {
                case 1 -> addTasks.numOfFib();
                case 2 -> addTasks.deposit();
                case 3 -> addTasks.multiplicationTable();
            }
        }while (num<4);

    }


}
