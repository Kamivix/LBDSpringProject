package entity.employee;

public class Employee {
    int id;
    String name;
    String surname;
    String pesel;
    String evidenceNumber;
    String phoneNumber;

    public Employee(int id, String name, String surname, String pesel, String evidenceNumber, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.evidenceNumber = evidenceNumber;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name+" "+surname;
    }
}
