package predicate;

import java.util.Objects;

public class Employee {

    public Employee(Integer id, Integer age, String gender, String fName, String lName) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.firstName = fName;
        this.lastName = lName;
    }

    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;



    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(age, employee.age) &&
                Objects.equals(gender, employee.gender) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, gender, firstName, lastName);
    }

    //Please generate Getter and Setters

    //To change body of generated methods, choose Tools | Templates.
    @Override
    public String toString() {
        return this.id.toString() + " - " + this.age.toString();
    }


}