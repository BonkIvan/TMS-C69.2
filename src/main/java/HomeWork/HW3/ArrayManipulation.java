package HomeWork.HW3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    Scanner scanner = new Scanner(System.in);

    public void displayArray(int[] arr) {
        for (int num : arr
        ) {
            System.out.print(num + "  ");
        }
        System.out.println(" ");
    }

    public boolean searchNumber(int[] arr) {
        System.out.print("\nВведите искомое число: ");
        int searchNum = scanner.nextInt();
        boolean hasNum = false;
        for (int array : arr
        ) {
            if (searchNum == array) {
                hasNum = true;
                break;
            }

        }
        return hasNum;
    }

    public void numAnswer(boolean hasNum) {
        if (hasNum == true) {
            System.out.println(" есть в массиве");
        } else System.out.println(" нет в массиве");
    }

    public int[] deletInt(int[] arr) {
        System.out.print("Введите  число которое нужно удалить из массива: ");
        int numToRemove = scanner.nextInt();
        int[] newArr = new int[arr.length];
        int ind = 0;
        boolean hasNum = false;
        for (int array : arr
        ) {
            if (numToRemove == array) {
                hasNum = true;
                break;
            }

        }
        if (hasNum) {
            System.out.println(numToRemove + " есть в массиве");
            for (int number :
                    arr) {
                if (numToRemove != number) {
                    newArr[ind] = number;
                    ind++;
                }

            }
        } else {
            System.out.println(numToRemove + " нет в массиве");
            for (int number :
                    arr) {
                if (numToRemove != number) {
                    newArr[ind] = number;
                    ind++;
                }

            }

        }

        return newArr;
    }

    public void getMaxNum(int[] arr) {
        int maxNum = arr[0];
        for (int num : arr
        ) {
            if (maxNum < num) {
                maxNum = num;

            }

        }
        System.out.println("Максимальное число  в массиве:  " + maxNum);
    }

    public void getMinNum(int[] arr) {
        int minNum = arr[0];
        for (int num : arr
        ) {
            if (minNum > num) {
                minNum = num;

            }

        }
        System.out.println("Максимальное число  в массиве:  " + minNum);
    }

    public double average(int[] arr){
        double average;
        int sum = 0;
        for (int num:arr
             ) { sum = sum +num;

        }
       average = (double) sum / arr.length;
        return average;
    }

    public void numberComparison(double num1, double num2){
        if(num1>num2){
            System.out.println("Среднеарифметическое первого массива больше");

        } else if (num1<num2) {
            System.out.println("Среднеарифметическое второго массива больше");

        }else System.out.println("Среднеарифметические массивов равны");
    }

    public int amountOfEvenNum(int[]arr){
        int amountNum = 0;
        for (int num:arr
             ) { if (num%2==0){
            amountNum = amountNum+1;
        }
        }
        return amountNum;
    }

    public int[] replaceOddByZero(int[]arr){
        int[] arrayWithoutOdd = new int[arr.length];
        int index = 0;
        for (int num:arr
             ) {
            if (num%2!=1){
                arrayWithoutOdd[index] = num;
            } index++;

        }
        return arrayWithoutOdd;
    }

    public void displayStringArray(String[] arr) {
        for (String name : arr
        ) {
            System.out.print(name + "  ");
        }
        System.out.println(" ");
    }

}
