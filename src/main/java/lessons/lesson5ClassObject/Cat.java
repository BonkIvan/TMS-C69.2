package lessons.lesson5ClassObject;

public class Cat {
    int age;
    String name;
    boolean chiped;

    public Cat(int age) {
        this(age,
        "Бродячий кот");
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat() {
        this(2);
    }
}
