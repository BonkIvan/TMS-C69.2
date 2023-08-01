package HomeWork.HW1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner scaner = new Scanner(System.in);
        ScannerUser user = new ScannerUser();
        System.out.println("Введите имя: " );
        user.setName(scaner.nextLine());
        String userName = user.getName();
        System.out.println("Имя пользователя: "+userName);
        System.out.println("Введите возраст: " );
        int userAge = user.setAge(scaner.nextInt());
        System.out.println("Возраст пользователя: "+userAge);





    }
}
