package by.practice.task11;

//6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn. Класс Пылесос имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».
public class VacuumCleaner implements ElectroDevice{
    String name;
    String brand;
    double price;
    boolean isOn;

    public VacuumCleaner(String name, String brand, double price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println(name + " убирает");
    }
}
