package HomeWork.HW6.documentManagementSystem;

import java.util.Calendar;
import java.util.Date;

public class EmployeeContract extends Document implements ShowAllInformation{
    Calendar calendar =  Calendar.getInstance();
    String name;
    Date dateOfEmployment;
    Date contractEndDate;

    int contractDuration;
    public EmployeeContract(String name, int contractDuration) {
        super();
        this.name = name;
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH , 3);
        this.dateOfEmployment = calendar.getTime();
        calendar.add(Calendar.YEAR, contractDuration);
        this.contractEndDate = calendar.getTime();
    }

    @Override
    public void showDate() {
        System.out.println("Дата документа: "+dateOfDocument);

    }

    @Override
    public void showId() {
        System.out.printf(" идентификационный номер контрактак сотрудника %s - %d", name, idDocument);

    }
    public void showDateOfEmployment(){
        System.out.println(dateOfEmployment);

    }

    public  void showContractEndDate (){
        System.out.println("Дата окончания контракта сотрудника "+ name+ " : " + contractEndDate);
    }


    public void showAllInformation() {
        System.out.println("Номер документа: "+idDocument
                + "\nДата документа: " +dateOfDocument
                + "\nИмя сотрудника: " + name
                + "\nДата приема на работу: " +dateOfEmployment
                + "\nДата окончания контракта: "+contractEndDate);
    }

}
