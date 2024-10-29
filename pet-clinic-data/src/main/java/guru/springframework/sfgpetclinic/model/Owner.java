package guru.springframework.sfgpetclinic.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor

@Entity // marks class as a JPA entity,it will be mapped to a database table.
@Table(name = "owners")//name of the table into the database, owner data will be stored.
public class Owner extends Person {

    @Builder
    public Owner(Long id,String  firstname,String lastname,String address, String city, String telephone, Set<Pet> pets) {
        super(id,firstname,lastname);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }

    //Fields, store for owners
    @Column(name = "address")//column in owners table.
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    //pet entity has a field name owner that manages the relationship from pet side.
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();
}