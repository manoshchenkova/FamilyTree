/* **
* Этот блок - для ввода людей
* */


import java.time.LocalDate;

public class Person {

    enum Sex {MALE, FEMALE, UNKNOWN}

    private String lastName = "Неизвестно";
    private String firstName = "Неизвестно";
    private LocalDate dateOfBirth;
    private Sex sex = Sex.UNKNOWN;
    private int id;

    public Person(String lastName, String firstName, LocalDate dateOfBirth, Sex sex, int id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.id = id;
    }

    public Person() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //TODO - генератор id

    public String getFullName() {
        String fullName = String.format("%s %s %s", firstName, lastName, dateOfBirth);
        return fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex=" + sex +
                ", id=" + id +
                '}';
    }
}
