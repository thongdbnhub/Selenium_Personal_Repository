package company;

import person.Person;

public class Company {
    Person person;

    public Company(Person person) {
        this.person = person;
    }

    public void display() {
        System.out.println("Name: " + person.getName());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Age: " + person.getAge());
    }
}