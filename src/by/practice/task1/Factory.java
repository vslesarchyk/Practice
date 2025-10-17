package by.practice.task1;

//1.6 Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика. Поля, которые можно определить в Фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)

public class Factory extends IndustrialBuilding {
    private int workers;
    private String product;

    public Factory(String street, String wallMaterial, int yearBuilt, String industry,
                   int workers, String product) {
        super(street, wallMaterial, yearBuilt, industry);
        this.workers = workers;
        this.product = product;
    }


    public String getInfo() {
        return super.getInfo() + ", Работников: " + workers + ", Продукция: " + product;
    }
}


