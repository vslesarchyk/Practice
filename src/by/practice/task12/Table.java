package by.practice.task12;

//5. Создать класс стол. Этот класс будет состоять из двух дженериков. Первый дженерик будет отображать инвертарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
class Table<T extends Integer, P extends Person> {
    private T inventoryNumber;
    private P person;

    public Table(T inventoryNumber, P person) {
        this.inventoryNumber = inventoryNumber;
        this.person = person;
    }

  // 6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.
    public void showPersonName() {
        System.out.println("За столом" + inventoryNumber + " сидит "
                + person.getFirstName() + " " + person.getLastName());
    }
}
