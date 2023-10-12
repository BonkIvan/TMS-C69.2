package lessons.lesson16;

public class Dog implements Runnable{
    @Override
    public void run() {
        System.out.println("dog say - waw-waw");
    }
}
