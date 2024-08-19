package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Represents an owner who is a type of person.
 * This class extends {@link Person} to inherit first name, last name, and ID fields.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
