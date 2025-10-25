package by.practice.task12;

public class Main {
    public static void main(String[] args) {
//7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
        Student student1 = new Student("Иван", "Иванов", "Иностранные языки");
        Student student2 = new Student("Маша", "Петрова", "Экономика");
        Employee employee1 = new Employee("Петр", "Сидоров", 55000);


        Table<Integer, Person> table1 = new Table<>(1, student1);
        Table<Integer, Person> table2 = new Table<>(2, employee1);
        Table<Integer, Person> table3 = new Table<>(3, student2);

//8. Вывести поочередно имена персонажей, которые сидят за столом.
        table1.showPersonName();
        table2.showPersonName();
        table3.showPersonName();
    }
}