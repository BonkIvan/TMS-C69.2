package HomeWork.HW5.computer;

public class RAM {
    String nameRAM;
    int capacity;

    public RAM(String nameRAM, int memoryCapacity) {
        this.nameRAM = nameRAM;
        this.capacity = memoryCapacity;
    }
    public RAM() {
        this.nameRAM = "Kingston";
        this.capacity = 4;
    }

    void displayInfo(){
        System.out.printf("\nОперативная память:\n\tИмя RAM: %s \n\tОбьем RAM %d GB",
                            nameRAM,
                            capacity);
    }

}
