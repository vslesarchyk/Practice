package by.practice.task1;

//1.2 Создать класс Гражданские здания (CivilBuilding). Гражданские здания должны наследоваться от класса Постройка. Поля у класса Гражданские здания: назначение (жилье или общественные здания), количество этажей.

public class CivilBuilding extends Building {
    private String purpose; // жилье или общественное
    private int floors;

    public CivilBuilding(String street, String wallMaterial, int yearBuilt, String purpose, int floors) {
        super(street, wallMaterial, yearBuilt);
        this.purpose = purpose;
        this.floors = floors;
    }

    public String getInfo() {
        return super.getInfo() + ", Назначение: " + purpose + ", Этажей: " + floors;
    }
}


