package guru.springframework.sfgpetclinic.model;
import java.time.LocalDate;

public class Pet {
    private petType petType;
    private Owner owner;
    private LocalDate birhtDate;

    public guru.springframework.sfgpetclinic.model.petType getPetType() {
        return petType;
    }

    public void setPetType(guru.springframework.sfgpetclinic.model.petType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirhtDate() {
        return birhtDate;
    }

    public void setBirhtDate(LocalDate birhtDate) {
        this.birhtDate = birhtDate;
    }
}
