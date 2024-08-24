package person;

public class Information {
    private Person person;

    public Information(Person person) {
        this.person = person;
    }

    public void display() {
        System.out.println("Name: " + person.getName());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone: " + person.getPhone());
        System.out.println("Age: " + person.getAge());
    }
}
