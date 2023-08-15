package HomeWork.HW3.utils;

import java.util.Scanner;

public class CreatArrays {
    Scanner scanner;

    public CreatArrays(Scanner scanner) {
        this.scanner = scanner;
    }

    public int[] creatArr() {
        System.out.print("Введите размер массива:  ");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        return arr;
    }

    public int[] createArrFiveElem() {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 100 + 1);
            arr[i] = a;
        }
        return arr;

    }


    public int[] createArrRangFiveToTenElem (){
        int arraySize=0;
        boolean sizeRange = false;
        System.out.println("Введите размер массива: ");
        while (!sizeRange){
            arraySize= scanner.nextInt();
             if (arraySize<5 || 10<arraySize){
                 System.out.println("Неверный диапозон, введите значение от 5 и до 10: ");
                 sizeRange = false;
             }else sizeRange = true;
        }
        int arr[] = new int[arraySize];
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 100+1);
            arr[i] = a;
        }
        return arr;
    }


    public int[] createArrOfEvenNumFromAnotherArr(int[]arr, int index){
        int[] anotherArr = new int[index];
        int temp = 0;
        for (int num:arr
             ) {
            if (num%2==0){
                 anotherArr[temp]=num;
                 temp = temp +1;
        }

        }


        return anotherArr;
    }

    public String[] createStringArra(){
        System.out.print("Введите размер массива:  ");
        int length = scanner.nextInt();
        String[] arr = new String[length];
        scanner.close();
        return arr;

    }


}
