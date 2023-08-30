package HomeWork.HW6.documentManagementSystem;

public class FinanceInvoice extends Document implements  ShowAllInformation{

    double monthlyTotal;
    int departmentCode;

    public FinanceInvoice(double monthlyTotal, int departmentCode) {
        super();
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    @Override
    public void showDate() {

    }

    @Override
    public void showId() {

    }


    public void showAllInformation() {
        System.out.println("Номер документа: "+idDocument
                + "\nДата документа: " +dateOfDocument
                + "\nИтоговая сумма за месяц: " + monthlyTotal
                + "\nКод депортамента: " +departmentCode);
    }
}
