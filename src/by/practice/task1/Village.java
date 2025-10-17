package by.practice.task1;

public class Village {
    private Building[] buildings;
    private int count;

    public Village(int maxBuildings) {
        buildings = new Building[maxBuildings];
        count = 0;
    }

    //метод по добавлению новой постройки
    public void addBuilding(Building building) {
        if (count < buildings.length) {
            buildings[count] = building;
            count++;
        } else {
            System.out.println("Деревня заполнена, нельзя добавить больше построек.");
        }
    }

    //метод вывода информации о всех добавленных строениях
        public void printAllBuildings() {
        System.out.println("Все постройки в деревне:");
        for (int i = 0; i < count; i++) {
            System.out.println(buildings[i].getInfo());
        }
    }
}

