public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X5", "CZARNY", 2015, 20000, 35);
        System.out.println(car.toString());

        car.sell(5);

        System.out.println("MARKA: " + car.getMarka());
        System.out.println("MODEL: " + car.getModel());
        System.out.println("KOLOR: " + car.getKolor());
        System.out.println("ROK: " + car.getRok());
        System.out.println("ILOSC: " + car.getIlosc());
        System.out.println("CENA: " + car.getCena());
        System.out.println();

        car.setMarka("Audi");
        car.setModel("A7");
        car.setCena(70000);

        System.out.println(car.toString());
    }
}
