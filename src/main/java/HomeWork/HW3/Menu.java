package HomeWork.HW3;

import HomeWork.HW2.ControlStructures;
import HomeWork.HW3.utils.ArrayManipulation;
import HomeWork.HW3.utils.CreatArrays;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    CreatArrays creatArrays = new CreatArrays(scanner);
    ArrayManipulation manipulation = new ArrayManipulation(scanner);


    public void getTasksMenu(){
        do {
            System.out.println("""
                        
                        ========Меню=======
                        1 - 
                        2 - 
                        3 - 
                        4 - 
                        5 - 
                        6 - выход в предыдущее меню\s""");

            switch (scanner.nextInt()) {
                case 1 -> {
                    int[] arr = creatArrays.creatArr();
                    manipulation.arrIntFilling(arr);
                    manipulation.displayArray(arr);
                    if(manipulation.searchNumber(arr)){
                        System.out.println("Число входит в массив");
                    }else System.out.println("Число не входит в массив");

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                default -> System.out.println("Выход");
            }

        }while (scanner.nextInt()<6);

    }



}
