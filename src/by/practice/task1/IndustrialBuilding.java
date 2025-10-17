package by.practice.task1;
//1.3 Создать класс Промышленном здание (IndustrialBuilding). Промышленные здания наследуются от Постройки. Поля которые можно определить в Промышленном здании: отрасль (Отрасль в которой здание задействовано (машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)

public class IndustrialBuilding extends Building {
    private String industry;

    public IndustrialBuilding(String street, String wallMaterial, int yearBuilt, String industry) {
        super(street, wallMaterial, yearBuilt);
        this.industry = industry;
    }


    public String getInfo() {
        return super.getInfo() + ", Отрасль: " + industry;
    }
}


