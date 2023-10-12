package HomeWork.HW12.Utils;

import java.io.BufferedReader;
import java.io.IOException;

public class ReaderStream {

    String line = "";
    StringBuilder stringBuilder = new StringBuilder(line);


    public String getLine() {
        return line;
    }

    public String streamToString(BufferedReader bufferedReader) throws IOException {
        bufferedReader.mark(100000);
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
            System.out.println(line);
        }
        bufferedReader.reset();
        return stringBuilder.toString();
    }

    public int sizeBufferReade(BufferedReader bufferedReader) throws IOException{
        int i=0;
        bufferedReader.mark(100000);
        int ch;
        while((ch=bufferedReader.read())!=-1){
            i++;
        }
        bufferedReader.reset();
        return i;
    }

    public int countLinesInBufferedReader(BufferedReader bufferedReader) throws IOException{
        int i=0;
        bufferedReader.mark(100000);
        while ((line = bufferedReader.readLine()) != null) {
            i++;
        }
        bufferedReader.reset();
        return i;

    }

    public String [] bufferedReaderToStringArray (BufferedReader bufferedReader) throws IOException{
        String [] stringArray = new String[countLinesInBufferedReader(bufferedReader)];
        bufferedReader.mark(100000);
        int i=0;
        while ((line = bufferedReader.readLine()) != null) {
            stringArray[i] = line;
            i++;
        }bufferedReader.reset();
        return stringArray;


    }



}
