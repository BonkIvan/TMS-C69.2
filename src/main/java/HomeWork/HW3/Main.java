package HomeWork.HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreatArrays arr = new CreatArrays();
        ArrayManipulation manipulation = new ArrayManipulation();
        String[] arrString = arr.arrStringFilling(arr.createStrngArra());
        manipulation.displayStringArray(arrString);




       /* int[] arrInt = arr.createArrRangFiveToTenElem();
        manipulation.displayArray(arrInt);
        System.out.println("Массив с замененными нечетными элементами на 0");
        manipulation.displayArray(manipulation.replaceOddByZero(arrInt));*/





        /*int[] arrInt = arr.createArrRangFiveToTenElem();
        manipulation.displayArray(arrInt);
        int amountEvenNumb = manipulation.amountOfEvenNum(arrInt);
        int[] arrInt2 = arr.arrOfEvenNumFromAnotherArr(arrInt,amountEvenNumb);
        System.out.println("Массив из первого массива с четными элементами");
        manipulation.displayArray(arrInt2);*/









       /* int[] arrInt = arr.createArrFiveElem();
        int[] arrInt2 = arr.createArrFiveElem();
        manipulation.displayArray(arrInt);
        manipulation.displayArray(arrInt2);
        double averageArr1 = manipulation.average(arrInt);
        double averageArr2 = manipulation.average(arrInt2);
        System.out.println("Среднее первого массива: " + averageArr1 +"\nСреднее второго массива: "+averageArr2);
        manipulation.numberComparison(averageArr1,averageArr2);*/



//        int[] arrInt = arr.creatArr();
//        arrInt = arr.arrFilling(arrInt);
//        manipulation.displayArray(arrInt);
//         arrInt = manipulation.deletInt(arrInt);
//         manipulation.displayArray(arrInt);
//         manipulation.getMaxNum(arrInt);
//         manipulation.getMinNum(arrInt);


//        manipulation.numAnswer(manipulation.searchNumber(arrInt));



//        manipulation.searchNumber(arrInt);
//        arrInt = manipulation.deletInt(arrInt);
//        manipulation.displayArray(arrInt);






    }
}
