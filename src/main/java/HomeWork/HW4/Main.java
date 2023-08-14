package HomeWork.HW4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);





        /** Шестая задача */
        /*int[][] mas = new int[5][5];
        System.out.print("диапозон значений: \n");
        int size = scanner.nextInt();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(size);
            }
        }
        //вывести  массив в консоль
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("↓ ↓ ↓ ↓ ↓");
        //сортировка номер раз по возрастанию в массиве
        int temp;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < mas.length-1; k++) {
                    if (mas[i][k] > mas[i][k + 1]) {
                        temp = mas[i][k];
                        mas[i][k] = mas[i][k + 1];
                        mas[i][k + 1] = temp;
                    }
                }

            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("↓ ↓ ↓ ↓ ↓");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < mas.length; k++) {
                    for (int l = 0; l < mas[k].length; l++) {
                        if (mas[i][j] < mas[k][l]) {
                            temp = mas[i][j];
                            mas[i][j] = mas[k][l];
                            mas[k][l] = temp;
                        }
                    }
                }
            }
        }

        //вывести  массив в консоль
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }*/


        /** Пятая задача */
        /*int n = 0;
        int m = 0;
        System.out.print("Введите количество строк: \n");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            System.out.print("Введите количество столбцов: \n");
            m = scanner.nextInt();
        }
        int[][] mas = new int[n][m];
        System.out.print("диапозон значений: \n");
        int size = scanner.nextInt();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(size);
            }
        }
        //вывести  массив в консоль
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        //Первая диагональ
        System.out.println("Главная диагональ");
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i][i]+ " ");
        }
        //Вторая диагональ
        System.out.println("\nВторичная диагональ");
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i][(mas.length-1)-i]+ " ");
        }*/


        /** Четвертая задача*/
       /* int n = 0;
        int m = 0;
        System.out.print("Введите количество строк: \n");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            System.out.print("Введите количество столбцов: \n");
            m = scanner.nextInt();
        }
        int[][] mas = new int[n][m];
        System.out.print("диапозон значений: \n");
        int size = scanner.nextInt();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(size);
            }
        }
        //вывести  массив в консоль
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        int temp = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                    temp += mas[i][j];


            }
        }
        System.out.println("Сумма эелементов массива: "+temp);*/


        /** Третья задача */
       /* int[][] mas1 = {{1, 0, 0, 0},
                        {0, 1, 0, 0},
                        {0, 0, 0,0}};

        int[][] mas2 = {{1, 2, 3},
                        {1, 1, 1},
                        {0, 0, 0},
                        {2, 1, 1}};
        int id = mas1.length;
        int il = mas2[0].length;
        int it = mas2.length;
        int[][] mas3 = new int[id][il];
        for (int i = 0; i < id; i++) {
            for (int j = 0; j < il; j++) {
                for (int k = 0; k < it; k++) {
                    mas3[i][j] = mas3[i][j]+ (mas1[i][k] * mas2[k][j]);
                }
            }
        }
        for (int i = 0; i < mas3.length; i++) {
            System.out.println();
            for (int j = 0; j < mas3[i].length; j++) {
                System.out.print(mas3[i][j] + "  ");

            }*/


        /** Вторая задача*/
        /*String[][] chessboard = new String[8][8];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                if ((i % 2 == 0) && (j % 2 == 0)) {
                    chessboard[i][j] = "W";
                } else if ((i % 2 == 1) && (j % 2 == 1)) {
                    chessboard[i][j] = "W";
                }else chessboard[i][j] = "X";


            }

        }

        for (int i = 0; i < chessboard.length; i++) {
            System.out.println();
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j] + "  ");

            }


        }*/


        /** Первая задача*/
/*
        int[][][] arr = new int[3][3][3];
        // Заполнение 3х мерного массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = random.nextInt(10);
                }
            }

        }
        *//*  Выведение блока массивов в консоль *//*
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println();
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]+"  ");
                }
            }


        }
        *//*  Прибавления числа к элементам массива *//*
        System.out.println("\nВведите число на которое необходимо увеличить элеменыт в массиве: ");
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = arr[i][j][k] + num;
                }
            }

        }
        *//*  Выведение блока массивов в консоль *//*
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println();
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]+"  ");
                }
            }


        }*/

    }

}
