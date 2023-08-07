package HomeWork.HW3;

import java.util.Scanner;

public class CreatArrays {
    Scanner scanner = new Scanner(System.in);

    public int[] creatArr() {
        System.out.print("Введите размер массива:  ");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        return arr;
    }

    public int[] arrFilling(int arr[]) {
        System.out.print("Введите диапозон значений:  ");
        int temp = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * (temp + 1) - (temp / 2));
            arr[i] = a;
        }
        return arr;
    }


}
