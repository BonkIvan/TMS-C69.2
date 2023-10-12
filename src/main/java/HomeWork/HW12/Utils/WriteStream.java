package HomeWork.HW12.Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStream {

    public void writeValidDocNumbInFile(String[]... checkedNumbArr) {

        try (BufferedWriter validWriter = new BufferedWriter(new FileWriter("valid doc numb.txt"));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter("invalid doc numb.txt"))) {
            for (int i = 0; i < checkedNumbArr.length; i++) {

                String documentNumber = checkedNumbArr[i][0];
                String status = checkedNumbArr[i][1];

                String lineToWrite = documentNumber + " - " + status + "\n";

                if (status.endsWith("valid")) {
                    validWriter.write(lineToWrite);
                } else {
                    invalidWriter.write(lineToWrite);
                }

            }
            validWriter.flush();
            invalidWriter.flush();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }
}

