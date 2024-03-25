package lesson_14;

public class Person1 {
    String name;

    String lastName;

    MyDate1 birthday;

    public Person1(String name, String lastName, MyDate1 birthday) {
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
