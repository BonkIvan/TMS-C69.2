package lessons.lesson10Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
         String str = null;
        File f = new File("D://exception.txt");
        FileReader reader = new FileReader(f);

         stringBuilder.indexOf(str);

        
    }
}
