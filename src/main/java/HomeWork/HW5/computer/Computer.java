package HomeWork.HW5.computer;

public class Computer {

    int cost;
    String model;
    RAM ram;
    Hdd hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new Hdd();
    }

    public Computer(int cost, String model, String ramName, int ramCapacity, String nameHdd, int hddCapacity, String modelHdd) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM(ramName,ramCapacity);
        this.hdd = new Hdd(nameHdd, hddCapacity, modelHdd);
    }
     void showInfo(){
         System.out.print("Информация компьютере:\n" + "Модель: " + model );
         ram.displayInfo();
         hdd.displayInfo();
         System.out.println("\nСтоимость: "+cost+"руб");

     }

}
