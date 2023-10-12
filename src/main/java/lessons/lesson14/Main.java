package lessons.lesson14;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Date date;
        date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        String pattern = "yyyy/MM/dd MMM HH:mm:ss:mks";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("eng", "ENG"));
        String dateString = simpleDateFormat.format(date);
        System.out.println(dateString);
        GregorianCalendar gregorianCalendar;
        Thread thread = new Thread();
        ArrayList arrayList;

    }
}
