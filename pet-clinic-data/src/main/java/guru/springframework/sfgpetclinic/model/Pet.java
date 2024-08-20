package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    // Private attributes (fields)
    private guru.springframework.sfgpetclinic.model.PetType PetType;
    private Owner owner;
    private LocalDate birthDate;

    // Public getter and setter methods to access and update the private fields
    public guru.springframework.sfgpetclinic.model.PetType getPetType() {
        return PetType;
    }

    public void setPetType(guru.springframework.sfgpetclinic.model.PetType petType) {
        PetType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
