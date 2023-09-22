package HomeWork.HW12;

import HomeWork.HW12.Utils.CheckDocNumb;
import HomeWork.HW12.Utils.ReaderStream;
import HomeWork.HW12.Utils.WriteStream;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\";
        StringBuilder stringBuilder;
        CheckDocNumb checkedDocNumb = new CheckDocNumb();
        String[][] checkedNumbArr;
        WriteStream writeStream = new WriteStream();

        try {
            File docFile = new File("E:\\Document.txt");
            System.out.println(docFile.isFile());
            FileReader fileReader = new FileReader(docFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            ReaderStream readerStream = new ReaderStream();
            System.out.println(readerStream.streamToString(bufferedReader));
            System.out.println(readerStream.sizeBufferReade(bufferedReader));
            System.out.println(readerStream.countLinesInBufferedReader(bufferedReader));

            checkedDocNumb.validationNumbDocCheck(readerStream.bufferedReaderToStringArray(bufferedReader));

            checkedNumbArr =  checkedDocNumb.arrayToValidationsDocNumbArray(readerStream.bufferedReaderToStringArray(bufferedReader));
         /*   for (int i = 0; i<checkedNumbArr.length; i++){
                System.out.print(checkedNumbArr[i][0] + " - ");
                System.out.println(checkedNumbArr[i][1]);
            }*/
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Что-то пошло не так ");
            e.printStackTrace();
            return ;
        }

        writeStream.writeValidDocNumbInFile(checkedNumbArr);

    }
}
