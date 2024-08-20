package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    // Getter for petType
    public PetType getPetType() {
        return petType;
    }

    // Setter for petType
    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    // Getter for owner
    public Owner getOwner() {
        return owner;
    }

    // Setter for owner
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // Getter for birthDate
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Setter for birthDate
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}
