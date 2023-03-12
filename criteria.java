import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class criteria {
    public static void main(String[] args) {

        Comp comp1 = new Comp();
        comp1.HDD = 512;
        comp1.OS = "Windows";
        comp1.brand = "Huawei";
        comp1.color = "grey";
        comp1.price = 80000;
        comp1.recordCapacity = 16;

        Comp comp2 = new Comp();
        comp2.HDD = 512;
        comp2.OS = "Windows";
        comp2.brand = "VAIO";
        comp2.color = "green";
        comp2.price = 45000;
        comp2.recordCapacity = 8;

        Comp comp3 = new Comp();
        comp3.HDD = 256;
        comp3.OS = "macOS";
        comp3.brand = "Apple";
        comp3.color = "pink";
        comp3.price = 120000;
        comp3.recordCapacity = 8;

        Comp comp4 = new Comp();
        comp4.HDD = 256;
        comp4.OS = "Linux";
        comp4.brand = "Acer";
        comp4.color = "black";
        comp4.price = 40000;
        comp4.recordCapacity = 8;

        Comp comp5 = new Comp();
        comp5.HDD = 256;
        comp5.OS = "Windows";
        comp5.brand = "Samsung";
        comp5.color = "black";
        comp5.price = 90000;
        comp5.recordCapacity = 8;

        method();
        // System.out.println(comp5.toString());

    }

    public static void method() {
        HashMap<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "ОЗУ");
        criteria.put(2, "Объем ЖД");
        criteria.put(3, "Операционная система");
        criteria.put(4, "Цвет");
        criteria.put(5, "Бренд");
        criteria.put(6, "Цена");

        HashMap<String, String> color = new HashMap<>();
        color.put("Huawei", "grey");
        color.put("VAIO", "green");
        color.put("Apple", "pink");
        color.put("Acer", "black");
        color.put("Samsung", "black");

        HashMap<String, Integer> recordCapacity = new HashMap<>();
        recordCapacity.put("Huawei", 16);
        recordCapacity.put("VAIO", 8);
        recordCapacity.put("Apple", 8);
        recordCapacity.put("Acer", 8);
        recordCapacity.put("Samsung", 8);

        HashMap<String, Integer> hdd = new HashMap<>();
        hdd.put("Huawei", 512);
        hdd.put("VAIO", 512);
        hdd.put("Apple", 256);
        hdd.put("Acer", 256);
        hdd.put("Samsung", 256);

        HashMap<String, String> os = new HashMap<>();
        os.put("Huawei", "Windows");
        os.put("VAIO", "Windows");
        os.put("Apple", "macOS");
        os.put("Acer", "Linux");
        os.put("Samsung", "Windows");

        HashMap<String, Integer> price = new HashMap<>();
        price.put("Huawei", 80000);
        price.put("VAIO", 45000);
        price.put("Apple", 120000);
        price.put("Acer", 40000);
        price.put("Samsung", 90000);

        HashMap<String, String> allmodels = new HashMap<>();
        allmodels.put("Huawei", "HDD: 512, OS: Windows, color: grey, price: 80000, recordCapacity = 16");
        allmodels.put("VAIO", "HDD: 512, OS: Windows, color: green, price: 45000, recordCapacity = 8");
        allmodels.put("Apple", "HDD: 256, OS: macOS, color: pink, price: 120000, recordCapacity = 8");
        allmodels.put("Acer", "HDD: 256, OS: Linux, color: black, price: 40000, recordCapacity = 8");
        allmodels.put("Samsung", "HDD: 256, OS: Windows, color:black, price: 90000, recordCapacity = 8");

        System.out.println("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ\n 2 - Объем ЖД\n" +
                " 3 - Операционная система\n 4 - Цвет\n 5 - Бренд\n 6 - Цена");
        Scanner scan1 = new Scanner(System.in);
        int crit = scan1.nextInt();

        switch (crit) {
            case 1:
                System.out.println("Введите желаемый объем записывающего устройства: ");
                Scanner scan2 = new Scanner(System.in);
                int rec = scan2.nextInt();
                for (Map.Entry entry : recordCapacity.entrySet()) {
                    if (entry.getValue().equals(rec)) {
                        System.out.println(entry.getKey() + "| " + allmodels.get(entry.getKey()));
                    }
                }
                break;
            case 2:
                System.out.println("Введите желаемый объем жесткого диска: ");
                Scanner scan3 = new Scanner(System.in);
                int hdd_ = scan3.nextInt();
                for (Map.Entry entry : hdd.entrySet()) {
                    if (entry.getValue().equals(hdd_)) {
                        System.out.println(entry.getKey() + "| " + allmodels.get(entry.getKey()));
                    }
                }
                break;
            case 3:
                System.out.println("Введите желаемую операционную систему: ");
                Scanner scan4 = new Scanner(System.in);
                String os_ = scan4.nextLine();
                for (Map.Entry entry : os.entrySet()) {
                    if (entry.getValue().equals(os_)) {
                        System.out.println(entry.getKey() + "| " + allmodels.get(entry.getKey()));
                    }
                }
                break;
            case 4:
                System.out.println("Введите желаемый цвет: ");
                Scanner scan5 = new Scanner(System.in);
                String color_ = scan5.nextLine();
                for (Map.Entry entry : color.entrySet()) {
                    if (entry.getValue().equals(color_)) {
                        System.out.println(entry.getKey() + "| " + allmodels.get(entry.getKey()));
                    }
                }
                break;
            case 5:
                System.out.println("Введите желаемый бренд: ");
                Scanner scan6 = new Scanner(System.in);
                String brand = scan6.nextLine();
                for (Map.Entry entry : allmodels.entrySet()) {
                    if (entry.getKey().equals(brand)) {
                        System.out.println(entry.getKey() + "| " + allmodels.get(entry.getKey()));
                    }
                }
                // найти по ключу сопоставлние в мапе из компьютеров и вывести нужные
                break;
            case 6:
                System.out.println("Введите желаемую цену: ");
                Scanner scan7 = new Scanner(System.in);
                int price_ = scan7.nextInt();

                for (Map.Entry entry : price.entrySet()) {
                    if (entry.getValue().equals(price_)) {
                        System.out.println(entry.getKey() + "| " + allmodels.get(entry.getKey()));
                    }
                }

                break;
            default:
                // System.out.println("Введите номер критерия:");
                break;
        }
        scan1.close();
    }

  
}
