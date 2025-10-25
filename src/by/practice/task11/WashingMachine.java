package by.practice.task11;

//5. Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn. Класс стиральная машина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».
public class WashingMachine implements ElectroDevice, KitchenAppliance {
    String name;
    String brand;
    double price;
    boolean isOn;

    public WashingMachine(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println(name + " стирает");
    }
}
