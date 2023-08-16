package HomeWork.HW5.computer;

public class Hdd {
    String nameHdd;
    int capacity;
    String typHdd;

    public Hdd(String nameHdd, int capacity, String typHdd) {
        this.nameHdd = nameHdd;
        this.capacity = capacity;
        this.typHdd = typHdd;
    }

    public Hdd() {
        this.nameHdd = "Seagate";
        this.capacity = 256;
        this.typHdd = "internal" ;
    }

    void displayInfo(){
        System.out.printf("\nНакопитель:\n\tИмя HDD: %s \n\tОбьем HDD: %d GB\n\tТип HDD: %s",
                            nameHdd,
                            capacity,
                            typHdd);
    }
}
