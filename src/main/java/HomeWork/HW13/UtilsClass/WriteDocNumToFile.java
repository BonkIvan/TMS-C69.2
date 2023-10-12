package HomeWork.HW13.UtilsClass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteDocNumToFile {
    public void writeDocNumbInFile(Map<String, String> checkedNumbArr) {

        try (BufferedWriter validWriter = new BufferedWriter(new FileWriter("chekedDocNumb.txt"))) {

           for (Map.Entry<String, String> entry: checkedNumbArr.entrySet()) {
                String documentNumber = entry.getKey();
                String status = entry.getValue();

                String lineToWrite = documentNumber + " - " + status + "\n";
                validWriter.write(lineToWrite);
            }
            validWriter.flush();
            validWriter.close();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }


}
