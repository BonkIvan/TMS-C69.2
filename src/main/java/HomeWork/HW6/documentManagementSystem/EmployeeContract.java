package HomeWork.HW6.documentManagementSystem;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeContract extends Document{
    String name;
    GregorianCalendar dateOfEmployment;
    GregorianCalendar contractEndDate;

    int contractDuration;
    public EmployeeContract(String name, int contractDuration) {
        super();
        this.name = name;
        this.dateOfEmployment = new GregorianCalendar();
       // contractEndDat e= new GregorianCalendar().add( Calendar.YEAR,contractDuration);
    }

    @Override
    public void showDate() {

    }

    @Override
    public void showId() {

    }
}
