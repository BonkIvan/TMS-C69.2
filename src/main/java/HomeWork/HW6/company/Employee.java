package HomeWork.HW6.company;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee implements Serializable {
    transient private static AtomicInteger idCounter=new AtomicInteger(0);
    int id;
    String name;

    public Employee(String name) {
        this.id = idCounter.addAndGet(1);
        this.name = name;
    }


}
