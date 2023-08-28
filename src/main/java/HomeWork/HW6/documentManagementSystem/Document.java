package HomeWork.HW6.documentManagementSystem;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Document  implements Serializable {
    private static AtomicInteger idCounter=new AtomicInteger(0);
    Date date = new Date();
    int idDocument;
    String dateOfDocument;

    public String getDateOfDocument() {
        return dateOfDocument;
    }

    public Document() {
        this.idDocument = idCounter.addAndGet(1);;
        this.dateOfDocument = date.toString();
    }
    public abstract void showDate();
    public abstract void showId();

}
