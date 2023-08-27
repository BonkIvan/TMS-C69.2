package HomeWork.HW7;

import java.util.Arrays;

public class Phone {

    int number;
    int weight;
    String model;

    public Phone(int number, int weight, String model) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this(5550001, 180, "Nokia");
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);

    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String name, int receiveNumber) {
        System.out.println("Звонит " + name + " по номеру - " + receiveNumber);
    }

    public void sendMessage(int... number) {
        System.out.println("сообщение отправлено на номера: " + Arrays.toString(number));
    }

}
