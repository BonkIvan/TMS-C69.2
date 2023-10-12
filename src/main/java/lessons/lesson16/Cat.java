package lessons.lesson16;

import javax.xml.bind.JAXBContext;

public class Cat extends Thread{
    boolean stop = false;
public Cat (String name){
    super(name);
}
    public void run (){

        System.out.println("second thread");

    }


}
