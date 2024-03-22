package lesson_13;

public class Person {
    String name;

    String lastName;

    MyDate birthday;

    public Person(String name, String lastName, MyDate birthday) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
