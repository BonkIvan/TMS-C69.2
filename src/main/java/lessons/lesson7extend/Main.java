package lessons.lesson7extend;





public class Main {

    public static void main(String[] args) {
            Cat cat = new Cat(5,"Котя");

            SystemInfo info = new SystemInfo() {
                static int a;

                public void setA(int a) {
                    this.a = a;
                }

                @Override
                public void showInfo() {
                    System.out.println("Аааррр");

                }
                public  void showA(){
                    System.out.println(a+"asda");
                }

            };

            info.showInfo();
            info.setA(3);

        System.out.println(cat.toString());
        Season season = Season.SUMMER;
        System.out.println(season.name());
        season.toString();
        System.out.println(season.ordinal());





    }

}
