package lessons.lessons4ListArras;

import java.util.Random;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int n = 0;
        int m = 0;
        System.out.print("Введите количество строк: \n");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            System.out.print("Введите количество столбцов: \n");
            m = scanner.nextInt();
        }
        int[][] mas = new int[n][m];
        System.out.print("диапозон значений: \n");
        int size = scanner.nextInt();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = r.nextInt(size);
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        int temp = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (temp < mas[i][j]) {
                    temp = mas[i][j];
                }

            }
        }
        System.out.println(temp + " max");
        int sumMainD = 0;
        int sumSecondD = 0;

        for (int i = 0; i < mas.length; i++) {
                    sumMainD = sumMainD + mas[i][i];
                }
            System.out.println(sumMainD);

        for (int i = 0; i < mas.length; i++) {
            sumSecondD = sumSecondD + mas[mas.length-1-i][i];
        }
        System.out.println(sumSecondD);

//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                if (temp < mas[i][j]) {
//                    temp = mas[i][j];
//                }
//
//            }


        }

        /*int[][] nums1 = {{0,1,2},{3,4,5,6,8}};
        int[][] nums2 = new int[2][3];
        int[][][] nums3 = new int[2][3][4];
        for(int i = 0; i<nums1.length; i++){
            for(int j =0; j<nums1[i].length; j++){
                System.out.print(nums1[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println(nums1[1][1]);*/
    }






