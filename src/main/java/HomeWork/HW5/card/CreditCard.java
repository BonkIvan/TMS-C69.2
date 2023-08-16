package HomeWork.HW5.card;

public class CreditCard {
    int idAccountNumber;
    double currentSum;


    public CreditCard(int id) {

        this( id, 100) ;
    }

    public CreditCard(int id, double sum) {
        idAccountNumber = id;
        currentSum = sum;
    }

    public void replenish(double sum){
        currentSum += sum;

    }
    public void withdrawal(double sum){
        if(currentSum>=sum){
        currentSum -= sum;
        }else System.out.println("Недостаточно средств");

    }



    public void showInfo(){
        System.out.printf("Номер счета: %d \tСумма на счету: %.2f бел. руб. \n", idAccountNumber, currentSum);

    }





}
