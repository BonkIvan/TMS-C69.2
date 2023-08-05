package HomeWork.HW2;

public class ControlStructures {
/** 1  Сезон года по месяцу через switch    */
        public void monthNumber(int monthNumber) {
        if (monthNumber > 0 && monthNumber < 13) {
            int x = monthNumber / 3;
            switch (x) {
                case 0:
                case 4:
                    System.out.println("Это зима");
                    break;
                case 1:
                    System.out.println("Это весна");
                    break;
                case 2:
                    System.out.println("Это лето");
                    break;
                case 3:
                    System.out.println("Это осень");
                    break;
            }
        } else {
            System.out.println("Неправильный месяц");
        }
    }

/** 2  Сезон года по месяцу через if    */
        public void season(int numberMonth) {
        if (numberMonth == 12) {
            System.out.println("It's winter");
        } else if (numberMonth < 3) {
            System.out.println("It's winter");
        } else if (numberMonth < 6) {
            System.out.println("It's spring");
        } else if (numberMonth < 9) {
            System.out.println("It's summer");
        } else if (numberMonth < 12) {
            System.out.println("It's autum");
        } else {
            System.out.println("Invalid value");
        }
    }

/** 3  Четное и нечетное число    */
         public void evennessNumb(int degrees) {
              if (degrees % 2 == 0) {
                  System.out.println("Это число четное");
                } else {
                System.out.println("Это нечетное число");
                }
         }

/** 4  Температура */
        public void temperature( int degrees){
            if (degrees > -5) {
                System.out.println("Тепло");
            } else if (degrees > -20) {
                System.out.println("Нормально");
            } else {
                System.out.println("Холодно");
            }
        }

/** 5  Цвет радуги    */
        public void rianbowColor ( int numColor){
            switch (numColor) {
                case 1:
                    System.out.println("Красный");
                    break;
                case 2:
                    System.out.println("Оранжевый");
                    break;
                case 3:
                    System.out.println("Желтый");
                    break;
                case 4:
                    System.out.println("Зеленый");
                    break;
                case 5:
                    System.out.println("Голубой");
                    break;
                case 6:
                    System.out.println("Синий");
                    break;
                case 7:
                    System.out.println("Фиалетовый ");
                    break;
                default:
                    System.out.println("неверное значение");
            }

        }

}