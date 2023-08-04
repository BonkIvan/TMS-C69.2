package HomeWork.HW2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int num2 = scanner.nextInt();
        ControlStructures season = new ControlStructures();
        season.season(num2);

       /* for (int i=1; i<=10; i++){
            for(int j=1; j<=10; j++ ){
                int x = i*j;
                System.out.println(i+"*"+j+"="+x);
            }
            System.out.println("-----------");
        }*/

    }

}
