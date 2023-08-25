package HomeWork.HW7;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(7775556,180,"Nokia");
        phone.receiveCall("Вася");
        System.out.println(phone.getNumber());

        phone.sendMessage(2553380,3378956,7748388);




    }
}
