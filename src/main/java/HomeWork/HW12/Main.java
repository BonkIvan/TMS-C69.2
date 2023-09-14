package HomeWork.HW12;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\";
        StringBuilder stringBuilder;
        try {
            File docFile = new File("C:\\Users\\User\\IdeaProjects\\Document.txt");
            System.out.println(docFile.isFile());
            FileReader fileReader = new FileReader(docFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

           // numberdDoc.read();

            String line;
            int x = 0;
            String st="";
            stringBuilder = new StringBuilder(st);
            while ((line=bufferedReader.readLine())!=null){
                stringBuilder.append(line);
                System.out.println(line);
            }
            System.out.println(stringBuilder.toString());
           // System.out.println(st);
            String line2;
            while ((line2=bufferedReader.readLine())!=null) {
                for (char element : line2.toCharArray()
                ) {
                    System.out.print(element);
                }
            }
          /*  String line;
            int i = 5;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                i++;
            }*/


            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Что-то пошло не так ");
            e.printStackTrace();

        }


    }
}
