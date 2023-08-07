package HomeWork.HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreatArrays arr = new CreatArrays();
        ArrayManipulation manipulation = new ArrayManipulation();
        int[] arrInt = arr.creatArr();
        arrInt = arr.arrFilling(arrInt);
        manipulation.displayArray(arrInt);
        manipulation.searchNumber(arrInt);
        arrInt = manipulation.deletInt(arrInt);
        manipulation.displayArray(arrInt);



    }
}
