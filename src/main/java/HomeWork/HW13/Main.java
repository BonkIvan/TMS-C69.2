package HomeWork.HW13;

import HomeWork.HW13.UtilsClass.ReaderFiles;
import HomeWork.HW13.UtilsClass.WriteDocNumToFile;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath;
        ArrayList listPathFile = new ArrayList<>();
        ReaderFiles files = new ReaderFiles();
        Map<String, String> doc = new HashMap<String, String>();
        WriteDocNumToFile writeDocNumToFile = new WriteDocNumToFile();
    /**Ввода пути и именя файла с клавиатуры*/
        do {
            System.out.print("Ведите путь и имя файла: ");
            filePath = scanner.nextLine();
            System.out.println("Для выхода введите 0");
            //System.out.println(filePath);
            if (!filePath.equals("0"))
                listPathFile.add(filePath);
        } while (!filePath.equals("0"));


        /**Проверка отработки */
        listPathFile.forEach(System.out::println);
        System.out.println(listPathFile.get(0));


        /**Запись в HashSet номера*/
        try {
            files.getDocumNumb(listPathFile).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            doc = files.docketСheck(listPathFile);
            doc.entrySet().forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /**Запись в файл с валидностью */
        writeDocNumToFile.writeDocNumbInFile(doc);


    }
}
