package by.practice.task11;

public class Main {
    public static void main(String[] args) {

 //7. В классе main cоздайте по паре объектов на основании вышесозданных классов. Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора

//String name, String functions, double price, boolean isOn
        CoffeeMachine coffee1 = new CoffeeMachine("Philips", "makecoffee", 550, false);
        CoffeeMachine coffee2 = new CoffeeMachine("Delonghi ","makecoffee" , 600, false);

//String name, String brand, double price, boolean isOn
        Fridge fridge1 = new Fridge("Samsung", "Samsung", 450, false);
        Fridge fridge2 = new Fridge("LG", "LG", 480, false);

//String name, String brand, double price, boolean isOn
       WashingMachine wash1 = new WashingMachine("Bosch", "Bosch", 520, false);
        WashingMachine wash2 = new WashingMachine("Indesit", "Indesit", 380, false);

//String name, String brand, double price, boolean isOn
        VacuumCleaner vacuum1 = new VacuumCleaner("Dyson", "Dyson", 700, false);
        VacuumCleaner vacuum2 = new VacuumCleaner("Xiaomi", "Xiaomi", 250, false);


   ElectroDevice[] allDevices = {coffee1, coffee2, fridge1, fridge2, wash1, wash2, vacuum1, vacuum2};

   for (ElectroDevice device : allDevices){
       device.work();
        }
 //9. В классе main сделать выставку только из Кухонной техники. Продемонстрировать спосбоности всех электроприборов в этой выставке.

 KitchenAppliance[] kitchenDevices = {fridge1, fridge2, wash1, wash2 };
   for (KitchenAppliance kitchenDevice : kitchenDevices ){
       kitchenDevice.work();
   }

// 10. В классе main сделать выставку кофемашин. Продемонстрировать способности всех кофе машин.

  CoffeeMachine[] coffee ={coffee1, coffee2};
   for (CoffeeMachine cof : coffee) {
       cof.work();
   }

// 11. На любой кофемашине вызовете метод start(). После этого переопределите метод start так, чтобы этот метод включал прибор (менял значение Boolean isOn на true.) Выведите результат в консоль
        coffee1.start();
        System.out.println(coffee1.name +  ":isOn");

    }
}