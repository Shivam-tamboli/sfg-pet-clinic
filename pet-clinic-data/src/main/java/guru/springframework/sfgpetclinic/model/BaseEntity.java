package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;


/**
 * Base entity class with an ID field.
 * <p>This class can be extended to create entities with an ID field. When extending,
 * ensure to override methods with caution to maintain the integrity of the ID field.</p>
 */


public class BaseEntity {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
