package HomeWork.HW2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MenuTasks menuTasks = new MenuTasks();
        short menuItem;

        do {
            System.out.println("""
                    \s
                    ==========Меню=========
                    1 - посмотреть задачи по логическим операторам.
                    2 - посмотреть задачи по циклам.
                    3 - дополнительные задачи.
                    4 - выход из меню""");
            menuItem = scanner.nextShort();
            switch(menuItem){
                case 1:
                    menuTasks.controlStructures();
                    break;
                case 2:
                    menuTasks.cycles();
                    break;
                case 3:
                    menuTasks.addTasks();
                    break;
                default:
                    System.out.println("Выход");
            }
        }while(menuItem<4);


    }

}
