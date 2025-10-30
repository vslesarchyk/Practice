package by.practice.task12;

//2. Создать класс Студент. Поля факультет
public class Student extends Person {
    private String faculty;

    public Student(String firstName, String lastName, String faculty) {
        super(firstName, lastName);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }
}