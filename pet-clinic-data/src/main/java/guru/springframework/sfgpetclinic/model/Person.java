package guru.springframework.sfgpetclinic.model;


public class Person {
    // Private attributes (fields)
    private String firstName;
    private String lastName;

    // Public getter and setter methods to access and update the private fields
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
