package HomeWork.HW2;

public class ControlStructures {
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

    /*  if (num == 12) {
            System.out.println("It's winter");
        } else if (num < 3) {
            System.out.println("It's winter");
        } else if (num < 6) {
            System.out.println("It's spring");
        } else if (num < 9) {
            System.out.println("It's summer");
        } else if (num < 12) {
            System.out.println("It's autum");
        }else {
            System.out.println("Invalid value");
        }*/

/** Четное и нечетное число*/
       /* if(num%2==0){
            System.out.println("Это число четное");
        }else {
            System.out.println("Это нечетное число");
        }*/
/** Температура */
        /*if(num>-5){
            System.out.println("Тепло");
        }else if(num>-20){
            System.out.println("Нормально");
        }else {System.out.println("Холодно");}*/
    }
}
