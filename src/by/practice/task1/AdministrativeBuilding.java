package by.practice.task1;

// 1.4 Создать класс Административном здание. Административное здание должно наследоваться от Гражданского здания. Поля, которые можно определить в Административном здании: назначение административного здания (офисное, кинотеатр, спортсооружение),число людей, на которое рассчитано здание.

public class AdministrativeBuilding extends CivilBuilding {
    private String adminPurpose; // офисное, спортсооружение и т.п.
    private int capacity;

    public AdministrativeBuilding(String street, String wallMaterial, int yearBuilt, String purpose, int floors,String adminPurpose, int capacity) {
        super(street, wallMaterial, yearBuilt, purpose, floors);
        this.adminPurpose = adminPurpose;
        this.capacity = capacity;
    }


    public String getInfo() {
        return super.getInfo() + ", Тип админ. здания: " + adminPurpose + ", Вместимость: " + capacity;
    }
}

