import person.Information;
import company.Company;
import person.Person;

public class Main {
    public static void main(String args[]) {
        Person person = new Person();
        Company company = new Company(person);
        Information information = new Information(person);

        person.setName("Thong");
        person.setGender("Male");
        person.setAddress("HCM");
        person.setPhone("0919009999");
        person.setAge(25);

        information.display();
        System.out.println("\n");
        company.display();
    }
}
