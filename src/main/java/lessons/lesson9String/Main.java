package lessons.lesson9String;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder  strBuild = new StringBuilder("result is");
        Scanner sc = new Scanner(System.in);
        String [] str = new String[3];

        for(int i = 0; i< str.length; i++){
            str[i] = sc.nextLine();
        }

        strBuild.append(" без изменения - ").append(str[2]).append("\n")
                .append("Верхний регистр ").append(str[1].toUpperCase()).append("\n")
                .append("Нижний регистр - ").append(str[0].toLowerCase());



        /*String min = str[0];
        String max = str[0];

        for (String element:str
             ) {
            if(element.length() < min.length())
                min = element;
            if(element.length() > min.length())
                max = element;
        }
        System.out.println(
        strBuild.append(" min str - ").append(min).append("\n")
                .append("max str - ").append(max).append("\n"));*/




      /*  System.out.println(sd.length());
        sd.length();
 StringBuilder str1 = new StringBuilder(sd);
        String st = str1.substring(3,5);
        System.out.println(st);*/



    }


}
