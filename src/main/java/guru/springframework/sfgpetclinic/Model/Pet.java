package guru.springframework.sfgpetclinic.Model;
import java.time.LocalDate;

public class Pet {
    // Private attributes (fields)
    private petType PetType;
    private Owner owner;
    private LocalDate birthDate;

    // Public getter and setter methods to access and update the private fields
    public petType getPetType() {
        return PetType;
    }

    public void setPetType(petType petType) {
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
