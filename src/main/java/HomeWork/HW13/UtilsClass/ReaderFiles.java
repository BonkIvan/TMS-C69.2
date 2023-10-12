package HomeWork.HW13.UtilsClass;

import java.io.*;
import java.util.*;

public class ReaderFiles {
    HashSet documNumb = new HashSet<>();
    String pathToFile;
    String stringLine = "";
    int index;
    StringBuilder stringBuilder;
    BufferedReader documentNumbers;
    String startString1 = "docnum";
    String startString2 = "contract";
    String valid = "valid";
    String invalid = "invalid beginning of the number";
    String invalidLength = "invalid length";
    // File files = new File(pathToFile);
    // FileReader fileReader = new FileReader(files);


    /**
     * Получение пути по индексу
     */
    public String getPathToFile(ArrayList listPathFile, int index) {
        pathToFile = listPathFile.get(index).toString();
        return pathToFile;
    }

   /* public int getSizeArray(ArrayList listPathFile){
        int index;
        index = listPathFile.size();

        return index;

    }*/


    public HashSet getDocumNumb(ArrayList listPathFile) throws IOException {
        for (int i = 0; i < listPathFile.size(); i++) {
            documentNumbers = new BufferedReader(new FileReader(new File(getPathToFile(listPathFile, i))));
            String line;
            while ((line = documentNumbers.readLine()) != null) {
                documNumb.add(line);
            }
        }
        documentNumbers.close();
        return documNumb;
    }

    public HashMap docketСheck(ArrayList listPathFile) throws IOException {
        HashSet documNumb = getDocumNumb(listPathFile);
        Map<String, String> verifiedNumbers = new HashMap<String, String>();
        Iterator<String> iterator = this.documNumb.iterator();
        while (iterator.hasNext()) {
            String docNum = iterator.next();
            if (docNum.length() == 15) {
                if (docNum.startsWith(startString1) || docNum.startsWith(startString2)) {
                    verifiedNumbers.put(docNum, valid);
                } else verifiedNumbers.put(docNum, invalid);
            } else verifiedNumbers.put(docNum, invalidLength);
        }
        return (HashMap) verifiedNumbers;
    }


}
