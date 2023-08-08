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
        boolean numInTheRange = false;
        System.out.println("Введите размер массива: ");
        while (!numInTheRange){
            arraySize= scanner.nextInt();
             if (arraySize<5 || 10<arraySize){
                 System.out.println("Неверный диапозон, введите значение от 5 и до 10: ");
                 numInTheRange = false;
             }else numInTheRange = true;
        }
        int arr[] = new int[arraySize];
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 100+1);
            arr[i] = a;
        }
        return arr;
    }

    public int[] arrOfEvenNumFromAnotherArr(int[]arr, int index){
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

    public String[] createStrngArra(){
        System.out.print("Введите размер массива:  ");
        int length = scanner.nextInt();
        String arr[] = new String[length];
        return arr;
    }
    public String[] arrStringFilling(String arr[]) {
//        int temp = scanner.nextInt();
        String a;
        int index =0;
        int size = arr.length;
        for (int i = 0; i < size; ){
            if(arr[i]==null)
           System.out.println("Введите имя №:"+ i);
            arr[i] = scanner.nextLine();
            i++;
        }
        return arr;
    }

}
