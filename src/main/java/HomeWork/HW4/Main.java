package HomeWork.HW4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scaner = new Scanner(System.in);
        int[][] mas1 = {{1,0,0,0},{0,1,0,0},{0,0,0,}};
        int[][] mas2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,1}};
       // int[][] mas3 = new int[][];












        /** Вторая задача*/
        /*String[][] chessboard = new String[8][8];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if ((i % 2 == 0) && (j % 2 == 0)) {
                    chessboard[i][j] = "W";
                } else if ((i % 2 == 1) && (j % 2 == 1)) {
                    chessboard[i][j] = "W";
                }else chessboard[i][j] = "X";


            }

        }

        for (int i = 0; i < chessboard.length; i++) {
            System.out.println();
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j] + "  ");

            }


        }*/


        /** Первая задача*/
/*
        int[][][] arr = new int[3][3][3];
        // Заполнение 3х мерного массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = random.nextInt(10);
                }
            }

        }
        *//*  Выведение блока массивов в консоль *//*
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println();
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]+"  ");
                }
            }


        }
        *//*  Прибавления числа к элементам массива *//*
        System.out.println("\nВведите число на которое необходимо увеличить элеменыт в массиве: ");
        int num = scaner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = arr[i][j][k] + num;
                }
            }

        }
        *//*  Выведение блока массивов в консоль *//*
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println();
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]+"  ");
                }
            }


        }*/

    }

}
