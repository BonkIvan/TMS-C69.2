package HomeWork.HW2;

import java.util.Scanner;

public class AddTasks {
    Scanner scanner = new Scanner(System.in);
/** 1 Первый 11 чисел Фибоначчи  */
    public void numOfFib() {
      int num1 = 1;
      int num2 = 0;
      int x;
       for(int i = 0; i<=10; i++){
           x = num1 + num2;
           System.out.print(num2 + " ");
           num1=num2;
           num2=x;
       }
    }

/** 2 Расчет ставки депозита    */
    public void deposit() {
        System.out.println("Введите сумму депозита: ");
    float deposit = scanner.nextFloat();
        System.out.println("Период в меcяцах: ");
    int num2 = scanner.nextInt();
    float percents =0.07F;
    float sum =deposit;
        for(int i=0;i<num2;i++){
        sum = sum*percents + sum;
    }
        System.out.println("Сумма вклада в конце периода: " + sum);
    }

/** 3 Таблица умнажения  */
    public void multiplicationTable() {
        for (int i=1; i<=10; i++){
            for(int j=1; j<=10; j++ ){
                int x = i*j;
                System.out.println(i+"*"+j+"="+x);
            }
            System.out.println("-----------");
        }
    }
}