package by.practice.task11;
//3. Создать класс Кофемашина. Поля наименование. Список функционала. Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы. Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».
public class CoffeeMachine implements ElectroDevice {
    String name;
    String functions; // вместо списка — строка
    double price;
    boolean isOn;

    public CoffeeMachine(String name, String functions, double price, boolean isOn) {
        this.name = name;
        this.functions = functions;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println(name + " варит кофе");

    }
}
