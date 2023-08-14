package HomeWork.HW3.utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    Scanner scanner;

    public ArrayManipulation(Scanner scanner) {
        this.scanner = scanner;
    }


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
        if (hasNum) {
            System.out.println(" есть в массиве");
        } else System.out.println(" нет в массиве");
    }

    public int[] deletInt(int[] arr) {

        boolean hasNumberForRemove = false;
        int index = 0;
        int lengthNewArr = 0;
        System.out.print("Введите  число которое нужно удалить из массива: ");
        int[] newArr = new int[lengthNewArr];
        int numToRemove = 0;
        do {
            for (int element : arr) {
                numToRemove = scanner.nextInt();
                for (int num : arr) {
                    if (num == numToRemove) {
                        hasNumberForRemove = true;
                    }
                }
                 System.out.println("Число не входит в массив, введите другое число: ");
            }
        } while (hasNumberForRemove);

            for (int element : arr) {
                if (element != numToRemove) {
                    lengthNewArr += 1;
                }
            }

            if (hasNumberForRemove) {
                System.out.println("Число есть в массиве: ");
                for (int i = 0; i < arr.length; i++) {
                    if (numToRemove != arr[i]) {
                        newArr[index] = arr[i];
                        index++;
                    }
                }
            }
            /*for (int element : arr) {
                if (element != numToRemove) {
                    lengthNewArr += 1;
                }

          System.out.println("Число в массив не входит, введите другое число: ");
            }



        if (hasNumberForRemove) {
            System.out.println("Число есть в массиве: ");
            for (int i = 0; i < arr.length; i++) {
                if (numToRemove != arr[i]) {
                    newArr[index] = arr[i];
                    index++;
                }


            }

        } else System.out.println("Число в массив не входит");*/


                    return newArr;
                }


            public void getMaxNum ( int[] arr){
                int maxNum = arr[0];
                for (int num : arr
                ) {
                    if (maxNum < num) {
                        maxNum = num;

                    }

                }
                System.out.println("Максимальное число  в массиве:  " + maxNum);
            }

            public void getMinNum ( int[] arr){
                int minNum = arr[0];
                for (int num : arr
                ) {
                    if (minNum > num) {
                        minNum = num;

                    }

                }
                System.out.println("Максимальное число  в массиве:  " + minNum);
            }

            public double average ( int[] arr){
                double average;
                int sum = 0;
                for (int num : arr
                ) {
                    sum = sum + num;

                }
                average = (double) sum / arr.length;
                return average;
            }

            public void numberComparison ( double num1, double num2){
                if (num1 > num2) {
                    System.out.println("Среднеарифметическое первого массива больше");

                } else if (num1 < num2) {
                    System.out.println("Среднеарифметическое второго массива больше");

                } else System.out.println("Среднеарифметические массивов равны");
            }

            public int amountOfEvenNum ( int[] arr){
                int amountNum = 0;
                for (int num : arr
                ) {
                    if (num % 2 == 0) {
                        amountNum = amountNum + 1;
                    }
                }
                return amountNum;
            }

            public void replaceOddByZero ( int[] arr){
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 1)
                        arr[i] = 0;
                }

            }

            public void displayStringArray (String[]arr){
                for (String name : arr
                ) {
                    System.out.print(name + "  ");
                }
                System.out.println(" ");
            }

            public void arrStringFilling (String[]arr){
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Введите имя №" + (i + 1) + ": ");
                    arr[i] = scanner.nextLine();
                }
            }

            public void arrIntFilling ( int[] arr){
                System.out.print("Введите диапозон значений:  ");
                int temp = scanner.nextInt();
                for (int i = 0; i < arr.length; i++) {
                    int a = (int) (Math.random() * (temp + 1) - (temp / 2));
                    arr[i] = a;
                }

            }

            public int amountSearchNumber ( int[] arr){
                System.out.print("Введите число: ");
                int requiredNumber = scanner.nextInt();
                int amountNum = 0;
                for (int num : arr
                ) {
                    if (requiredNumber == 0) {
                        amountNum = amountNum + 1;
                    }
                }
                return amountNum;

            }


        }
