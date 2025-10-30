package by.practice.task11;

//4. Создать класс Холодильник. Поля: наименование, марка, стоимость, Boolean isOn (включен). Класс холодильник имплементирует интерфейс Электроприборы. Переопределите метод work так, чтобы методы выводил «Холодильник морозит».
public class Fridge implements ElectroDevice, KitchenAppliance {
    String name;
    String brand;
    double price;
    boolean isOn;

    public Fridge(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println(name + " морозит");

    }
}
