package lesson_14.HomeWork;



public class Person {
    String firstName;
    String lastName;

    MyDate birthday;

    public Person(String firstName, String lastName, MyDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String toSmallString(){
        char letterFirstName = firstName.charAt(0);
        return lastName + " " + letterFirstName + ". " + birthday;
    }

    @Override
    public String toString() {
        return  toSmallString();
    }
}
