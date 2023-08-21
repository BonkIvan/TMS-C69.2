package HomeWork.HW5;

import HomeWork.HW5.ATM.ATM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        ATM atm = new ATM();
         atm.showTotalMoney();
        atm.showNumberOfBills();
       // atm.addMoney(5,3,1);
        System.out.println();
        atm.withdrawMoney(scanner.nextInt());
        atm.showTotalMoney();
        atm.showNumberOfBills();

/*
        atm.checkAvailability(scanner.nextInt());
        atm.showNumberOfBills();
        atm.showTotalMoney();
*/



        /*atm.checkAvailability(scanner.nextInt());
        atm.showTotalMoney();
        atm.showNumberOfBills();
*/





        /** Задача №2*/
        /*Computer computer = new Computer(1000,"NV56M","Kingstone", 16,"Hitachy",500,"External");
        Computer computer1 = new Computer(500,"BV6A");
        computer.showInfo();
        System.out.println("*****NEXT*****");
        computer1.showInfo();*/


        /** Задача №1*/
        /*Scanner scanner = new Scanner(System.in);
        int lastIdCardAccount = 0;
        int numberOfCards = 3;
        CreditCard[] card;
        card = new CreditCard[numberOfCards];
        for (int i = 0; i < numberOfCards; i++) {
            card[i] = new CreditCard(lastIdCardAccount);
            lastIdCardAccount++;

        }
        for (int i = 0; i < numberOfCards; i++) {
            card[i].showInfo();

        }

        card[0].replenish(10.5);
        card[1].replenish(77.2);
        card[2].withdrawal(5.5);
        System.out.println("↓---↓---↓---↓---↓---↓");
        for (int i = 0; i < numberOfCards; i++) {
            card[i].showInfo();

        }*/

    }

}
