package lessons.lesson7extend;


<<<<<<< HEAD



public class Main {

=======
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class Main {
    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger catLogger = LogManager.getLogger(Cat.class);
>>>>>>> github/master
    public static void main(String[] args) {
            Cat cat = new Cat(5,"Котя");

            SystemInfo info = new SystemInfo() {
                static int a;

                public void setA(int a) {
                    this.a = a;
                }

                @Override
                public void showInfo() {
                    System.out.println("Аааррр");

                }
                public  void showA(){
                    System.out.println(a+"asda");
                }

            };

            info.showInfo();
            info.setA(3);

        System.out.println(cat.toString());
        Season season = Season.SUMMER;
        System.out.println(season.name());
        season.toString();
        System.out.println(season.ordinal());
<<<<<<< HEAD

=======
        System.out.println(Arrays.toString(Season.values()));
>>>>>>> github/master




    }

}
