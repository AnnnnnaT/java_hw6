public class Comp {
    int recordCapacity;
    int HDD;
    String OS;
    String color;
    int price;
    String brand;
    
    // public Comp (int recordCapacity, int HDD, String OS, String color, int price, String brand){
    //     this.recordCapacity = recordCapacity;
    //     this.HDD = HDD;
    //     this.OS = OS;
    //     this.color = color;
    //     this.price = price;
    //     this.brand = brand;
    // }

    @Override
    public String toString() {
        return String.format("Ноутбук с ОС %s бренда %s с ОЗУ %d и ЖД %d %s цвета стоимостю %d", OS, brand, recordCapacity, HDD, color, price);
    }

}

