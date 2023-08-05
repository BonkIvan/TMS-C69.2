package HomeWork.HW2;

public class Cycles {
    String answer = "Ответ: ";
/** 1 Цикл, вывести все нечетные от 1 до 99  */
        public void evennessNumb(){
            System.out.println(answer);
        for(int i=1;i<100;i++){

            if(i%2==1){
                System.out.print(i+" ");
            }
    }

}

/** 2 Цикл, числа от 5 до 1  */
        public void fiveToOne() {
            System.out.println(answer);
            for (int i = 5; i > 0; i--) {
                System.out.print(i + " ");

            }
        }

/** 3 Сумма чисел   */
        public void sumOfNum(int num) {
            int sum = 0;
            System.out.println(answer);
            for (int i = 0; i <= num; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }

/** 4 Вывести числа   */
        public void numSequence(){
           int i=1;
           System.out.println(answer);
       /*while( i <= num){
            int x = 7;
          int  multiple = x*i;
            System.out.print(multiple + "  ");
          i++;
        }

        System.out.println("---------------");*/

          while( i <= 100){
            if(i%7==0){
            System.out.print(i + " ");
            }i++;
          }
        }

/** 5 Первые 10 чисел последовательнсти 0, -5, -10...   */
        public void firstNumSequence() {
           int num = 0;
           System.out.println(answer);
            for(int i =0;i<10;i++){
            System.out.print(num + "  ");
            num = num-5;

            }
        }

/** 6 Программа, выводящая квадраты чисел от 10 до 20 включительно   */
        public void square() {
            int i = 10;
            System.out.println(answer);
             do {
                int pow = i*i;
                 System.out.print(pow + "  ");
                 i++;
             }while (i<=20);
        }

}