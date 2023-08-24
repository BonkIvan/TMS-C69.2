package lessons.lesson7extend;

import org.apache.logging.log4j.Marker;

public class Cat {
    int age;
    String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void sayMyow(){
        System.out.println("meow");

    }
}
