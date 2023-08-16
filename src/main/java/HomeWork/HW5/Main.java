package HomeWork.HW5;

import java.util.Scanner;
import HomeWork.HW5.card.CreditCard;
public class Main {

    public static void main(String[] args) {










        /** Задача №2*/
        /*Computer computer = new Computer(1000,"NV56M","Kingstone", 16,"Hitachy",500,"External");
        Computer computer1 = new Computer(500,"BV6A");
        computer.showInfo();
        System.out.println("*****NEXT*****");
        computer1.showInfo();*/







        /** Задача №1*/
        Scanner scanner = new Scanner(System.in);
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
        card[0].replenish(10.5);
        card[1].replenish(77.2);
        card[2].withdrawal(5.5);
        System.out.println("↓---↓---↓---↓---↓---↓");
        for (int i = 0; i < numberOfCards; i++) {
            card[i].showInfo();

        }

    }

}
