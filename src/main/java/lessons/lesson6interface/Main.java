package lessons.lesson6interface;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean a;
        String b;
        Scanner scanner = new Scanner(System.in);
       // a = scanner.hasNextShort();
        b = "afasds";

        System.out.println(b.getBytes(StandardCharsets.UTF_8));
        System.out.println(b.getBytes());
        System.out.println(System.Logger.Level.ALL.toString());
        System.console();
       var x = Math.E;
        System.out.println(x);

        // https://metanit.com/java/tutorial/3.6.php


    }
}
