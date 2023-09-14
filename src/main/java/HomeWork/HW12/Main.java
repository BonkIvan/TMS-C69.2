package HomeWork.HW12;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String path = "E:\\";
        try {
            File docFile = new File(path, "Document.txt");
            FileReader numberdDoc = new FileReader(docFile);
            BufferedReader bufferedReader = new BufferedReader(numberdDoc);

            numberdDoc.read();


          /*  String line;
            int i = 5;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                i++;
            }*/


            bufferedReader.close();
            numberdDoc.close();

        } catch (IOException e) {
            System.out.println("Что-то пошло не так ");
            e.printStackTrace();

        }


    }
}
