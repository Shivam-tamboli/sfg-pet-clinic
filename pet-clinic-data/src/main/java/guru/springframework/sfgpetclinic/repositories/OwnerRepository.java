//This means a class or interface can use features (methods, properties) from
// another class or interface without having to define them again
package guru.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import guru.springframework.sfgpetclinic.model.Owner;

import java.util.List;
//owner repo will manage owner entities.
// allows one class/interface to "inherit" features from another class/interface.
public interface OwnerRepository extends CrudRepository<Owner, Long> {//type of id primary key(Long)
    //both method for database for finding and correspond for sql queries.
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}

//inherit - To receive properties and methods from another class (the parent class).
//Extend - create a subclass from a superclass. This allows the subclass to inherit features and add new ones.
//implement - To fulfill the contract defined by an interface by providing the specific behaviors.