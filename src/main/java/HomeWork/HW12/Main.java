package HomeWork.HW12;

import HomeWork.HW12.Utils.CheckDocNumb;
import HomeWork.HW12.Utils.ReaderStream;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\";
        StringBuilder stringBuilder;
        CheckDocNumb checkDocNumb = new CheckDocNumb();
        String[][] checkNumbArr;

        try {
            File docFile = new File("E:\\Document.txt");
            System.out.println(docFile.isFile());
            FileReader fileReader = new FileReader(docFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            ReaderStream readerStream = new ReaderStream();
            System.out.println(readerStream.streamToString(bufferedReader));
            System.out.println(readerStream.sizeBufferReade(bufferedReader));
            System.out.println(readerStream.countLinesInBufferedReader(bufferedReader));

            checkDocNumb.validationNumbDocCheck(readerStream.bufferedReaderToStringArray(bufferedReader));

            checkNumbArr =  checkDocNumb.arrayToValidationsDocNumbArray(readerStream.bufferedReaderToStringArray(bufferedReader));
            for (int i = 0; i<checkNumbArr.length; i++){
                System.out.print(checkNumbArr[i][0] + " - ");
                System.out.println(checkNumbArr[i][1]);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Что-то пошло не так ");
            e.printStackTrace();
            return ;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("valid doc numb.txt"))) {
            for (int i = 0; i<checkNumbArr.length; i++ ){
                if (checkNumbArr[i][1].endsWith("valid")){
                writer.write(checkNumbArr[i][0]+"\n");
                    writer.flush();

                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("invalid doc numb.txt"))) {
            for (int i = 0; i<checkNumbArr.length; i++ ){
                if (!checkNumbArr[i][1].endsWith("valid")){
                    writer.write(checkNumbArr[i][0]+" - " + checkNumbArr[i][1] + "\n");
                    writer.flush();

                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
