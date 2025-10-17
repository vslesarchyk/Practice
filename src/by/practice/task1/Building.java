package by.practice.task1;

//1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.
public class Building {
    private String street;
    private String wallMaterial;
    private int yearBuilt;

// конструктор класса Building
        public Building(String street, String wallMaterial, int yearBuilt) {
            //присвоение значений параметров
        this.street = street;
        this.wallMaterial = wallMaterial;
        this.yearBuilt = yearBuilt;
    }

//метод, собирает и возвращает строку с инф-ой
    public String getInfo() {
        return "Улица: " + street + ", Материал стен: " + wallMaterial + ", Год постройки: " + yearBuilt;
    }
}

