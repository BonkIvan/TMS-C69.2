package HomeWork.HW3;

import java.util.Scanner;

public class ArrayManipulation {
    Scanner scanner = new Scanner(System.in);

    public void displayArray(int[] arr) {
        for (int num : arr
        ) {
            System.out.print(num + "  ");
        }
    }

    public void searchNumber(int[] arr) {
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
        if (hasNum == true) {
            System.out.println(searchNum + " есть в массиве");
        } else System.out.println(searchNum + " нет в массиве");
    }

    public int[] deletInt(int[] arr) {
        System.out.print("Введите  число которое нужно удалить из массива: ");
        int numToRemove = scanner.nextInt();
        int[] newArr = new int[arr.length];
        int ind = 0;
        for (int number :
                arr) {
            if (numToRemove != number) {
                newArr[ind] = number;
                ind++;
            }

        }
        return newArr;
    }
}
