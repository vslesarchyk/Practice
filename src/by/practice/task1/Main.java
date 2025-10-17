package by.practice.task1;

public class Main {
    public static void main(String[] args) {
        Village village = new Village(10); // максимум 10 построек

        // 2.1. 2.1 Создать спортсооружение, исполком, 2 жилых дома, 2 фабрики Значения придумать самим. Добавить эти объекты в деревню (реализовать метод по добавлению постройки в деревню) (должны придумать,как это сделать)

//имя класса, имя переменной, вызов конструктора класса
        Building sportComplex = new AdministrativeBuilding(
                "Спортивная", "Кирпич", 2012,
                "общественное", 2, "спортсооружение", 250);

        Building cityHall = new AdministrativeBuilding(
                "Центральная ул.", "Бетон", 2008,
                "общественное", 3, "исполнительный орган", 100);

        Building house1 = new ApartmentBuilding(
                "Ленина", "Панель", 2015,
                "жилье", 5, 40);

        Building house2 = new ApartmentBuilding(
                "Гагарина", "Кирпич", 2019,
                "жилье", 9, 80);

        Building factory1 = new Factory(
                "Заводская", "Металл", 2000,
                "машиностроительная", 120, "запчасти");

        Building factory2 = new Factory(
                "Фабричная", "Бетон", 2014,
                "легкая промышленность", 90, "текстиль");


        // Добавление зданий в деревню
        village.addBuilding(sportComplex);
        village.addBuilding(cityHall);
        village.addBuilding(house1);
        village.addBuilding(house2);
        village.addBuilding(factory1);
        village.addBuilding(factory2);

        // Вывод всеч построек
        village. printAllBuildings();
    }
}



