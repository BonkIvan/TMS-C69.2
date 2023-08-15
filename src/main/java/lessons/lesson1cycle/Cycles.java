package lessons.lesson1cycle;

public class Cycles {
    public static void main(String[] args) {

        /*for (int i = 1; i<=10; i++) {
            if (i == 1) {
                System.out.println("Один");
            } else if (i == 2) {
                System.out.println("Два");
            } else if (i == 3) {
                System.out.println("Три");
            } else if (i == 4) {
                System.out.println("Четыри");
            } else if (i == 5) {
                System.out.println("Пять");
            }else if (i == 6) {
                System.out.println("Шесть");
            }else if (i == 7) {
                System.out.println("Семь");
            }else if (i == 8) {
                System.out.println("Восемь");
            }else if (i == 9) {
                System.out.println("Девять");
            }else  {  System.out.println("Десять");}
        }*/
        int count = 0;
        int i = 10;
        while (i<55){
            if (i%2==0){
                count = i + count;
            }
           i++;
        }
        System.out.println(count);
    }
}
