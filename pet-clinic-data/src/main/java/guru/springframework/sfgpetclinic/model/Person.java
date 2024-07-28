package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a person with a first name and a last name.
 * This class extends {@link BaseEntity} to include an ID field.
 */

@Getter
@Setter
public class Person extends BaseEntity {

    /**
     * The first name of the person.
     */
    private String firstName;

    /**
     * The last name of the person.
     */
    private String lastName;

    // Lombok will generate getters and setters for firstName and lastName
}
