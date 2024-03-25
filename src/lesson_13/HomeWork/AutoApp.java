package lesson_13.HomeWork;

public class AutoApp {
    public static void main(String[] args) {

        MyDate1 data1 = new MyDate1(20, 2, 2016);
        MyDate1 data2 = new MyDate1(12, 6, 2020);
        MyDate1 data3 = new MyDate1(10, 8, 2022);
        MyDate1 data4 = new MyDate1(5, 3, 2024);

        Auto[] auto = new Auto[4];
        auto[0] = new Auto("Toyota", "Corolla", "BER123", "white", 15_000, data1);
        auto[1] = new Auto("Volvo", "XC90", "CLP123", "Black", 25_000, data2);
        auto[2] = new Auto("BMW", "X6", "OLD123", "Yellow", 23_000, data3);
        auto[3] = new Auto("Ferrari", "812 GTS", "KRK123", "Red", 1_000_000, data4);

        displayAutoInfo(auto[1]);
        System.out.println("=================================");
        getListOfAutos(auto);
        System.out.println("=================================");
        System.out.println(getMaxPriceAuto(auto));
    }

    public static void getListOfAutos(Auto[] auto) {
        for (Auto value : auto) {
            System.out.println(value.toString());
        }
    }

    public static void displayAutoInfo(Auto auto) {
        System.out.print("Auto info -> ");
        System.out.println(auto.toString());
    }

    public static Auto getMaxPriceAuto(Auto[] auto) {
        if (auto.length == 0) {
            return null;
        }
        Auto maxPrice = auto[0];

        for (int i = 1; i < auto.length; i++) {
            if (maxPrice.getPrice() < auto[i].getPrice()) {
                maxPrice = auto[i];
            }
        }
        return maxPrice;
    }


}
