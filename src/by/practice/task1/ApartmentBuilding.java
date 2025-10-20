package by.practice.task1;

//1.5 Создать класс Многоквартирный жилой дом. Вопрос: От какого класса должен наследоваться Многоквартирный жилой дом. Поля, которые можно определить в Многоквартирном жилье: количество квартир.

public class ApartmentBuilding extends CivilBuilding {
    private int apartmentCount;

    public ApartmentBuilding(String street, String wallMaterial, int yearBuilt, String purpose,
                             int floors, int apartmentCount) {
        super(street, wallMaterial, yearBuilt, purpose, floors);
        this.apartmentCount = apartmentCount;
    }


    public String getInfo() {
        return super.getInfo() + ", Количество квартир: " + apartmentCount;
    }
}
