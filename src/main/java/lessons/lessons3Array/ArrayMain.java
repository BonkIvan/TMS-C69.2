package lessons.lessons3Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//        System.out.println(random.nextInt(1,50));
//        int[] arr = {-3, 47, 34, 18, 99, 33, 28, 55, 87, 13};
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i])
//                max = arr[i];
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i])
//                min = arr[i];
//        }
//        System.out.println(max + " max\n" + min + " min");
//        scanner.remove();
        String[] names = new String [5];
//
        for(int i=0 ; i< names.length;i++){
            System.out.println("Введите имя №"+(i+1)+": ");
            names[i]= scanner.nextLine();
        }
        Arrays.sort(names);
        for (String name:names
             ) {
            System.out.println(name);

        }

    }


           /* int maxNum = arr[0];
            int minNum = arr[0];
            for (int num : arr
            ) {
                if (maxNum < num) {
                    maxNum = num;

                }

            }
            System.out.println("Максимальное число  в массиве:  " + maxNum);

        for (int num : arr
            ) {
            if (minNum > num) {
                minNum = num;

            }

        }
        System.out.println("Минимальное число  в массиве:  " + minNum);
        }*/


}
