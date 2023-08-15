package HomeWork.HW3;

import HomeWork.HW2.ControlStructures;
import HomeWork.HW3.utils.ArrayManipulation;
import HomeWork.HW3.utils.CreatArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int num;
    CreatArrays creatArrays = new CreatArrays(scanner);
    ArrayManipulation manipulation = new ArrayManipulation(scanner);


    public void getTasksMenu(){
        do {
            System.out.println("""
                        
                        ========Меню=======
                        1 - Проверка наличия элемента в массиве
                        2 - Удаление элемента из массива 
                        3 - Максимальное и минимальное число в массиве произвольного размера
                        4 - Сравнение среднеарифметического двух массивов
                        5 - Создание массив в диапозоне больше 5 и до 10 включительно, 
                            создание нового массива из нечетных элементов предыдущего массива
                        6 - Замена каждого элемента с нечетным индексом на 0
                        7 - Сортировка массива строк
                        8 - сортировка пузырьком 
                        9 - Выход \s""");
             num = scanner.nextInt();
            switch (num) {
                case 1 -> {
                    int[] arr = creatArrays.creatArr();
                    manipulation.arrIntFilling(arr);
                    manipulation.displayArray(arr);
                    if(manipulation.searchNumber(arr)){
                        System.out.println("Число входит в массив");
                    }else System.out.println("Число не входит в массив");
                    break;
                }
                case 2 -> {
                    int[] arr = creatArrays.creatArr();
                    manipulation.arrIntFilling(arr);
                    manipulation.displayArray(arr);
                    int[] arr2 = manipulation.deleteInt(arr);
                    manipulation.displayArray(arr2);
                    System.out.println(" + ");
                }
                case 3 -> {
                    int[] arr = creatArrays.creatArr();
                    manipulation.arrIntFilling(arr);
                    manipulation.displayArray(arr);
                    manipulation.getMaxNum(arr);
                    manipulation.getMinNum(arr);
                }
                case 4 -> {
                    int[] arr1 = creatArrays.creatArr();
                    int[] arr2 = creatArrays.creatArr();
                    manipulation.arrIntFilling(arr1);
                    manipulation.arrIntFilling(arr2);
                    manipulation.displayArray(arr1);
                    manipulation.displayArray(arr2);
                    manipulation.numberComparison(manipulation.average(arr1),manipulation.average(arr2));
                }
                case 5-> {
                    int[] arr = creatArrays.createArrRangFiveToTenElem();
                    manipulation.arrIntFilling(arr);
                    manipulation.displayArray(arr);
                    int[] arr2 = creatArrays.createArrOfEvenNumFromAnotherArr(arr, manipulation.amountOfEvenNum(arr));
                    manipulation.displayArray(arr2);
                }
                case 6-> {
                    int[] arr = creatArrays.creatArr();
                    manipulation.arrIntFilling(arr);
                    manipulation.displayArray(arr);
                    manipulation.replaceOddIndByZero(arr);
                    manipulation.displayArray(arr);
                }
                case 7-> {
                    String[] arrNames = new String[5];
                    manipulation.arrStringFilling(arrNames);
                    manipulation.displayStringArray(arrNames);
                    Arrays.sort(arrNames);
                    manipulation.displayStringArray(arrNames);
                }
                case 8-> {
                    int[] arr = creatArrays.creatArr();
                    manipulation.arrIntFilling(arr);
                    manipulation.displayArray(arr);
                    manipulation.bubbleSorted(arr);
                    manipulation.displayArray(arr);
                }
                default -> System.out.println("Выход");
            }

        }while (num<9);

    }



}
