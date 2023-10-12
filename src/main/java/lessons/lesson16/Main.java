package lessons.lesson16;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("cat2");
        System.out.println(cat.getName());
        cat.start();
        cat.interrupt();
        System.out.println(cat.isInterrupted());
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        System.out.println(thread.getName());
        thread.start();
        thread.setPriority(10);


    }
}
