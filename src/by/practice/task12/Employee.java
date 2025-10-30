package by.practice.task12;

//3. Создать класс Сотрудник. Поля, зарплата
class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}