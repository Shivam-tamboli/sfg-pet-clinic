package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * Base entity class with an ID field.
 * <p>This class can be extended to create entities with an ID field. When extending,
 * ensure to override methods with caution to maintain the integrity of the ID field.</p>
 */

@Getter
@Setter
public class BaseEntity implements Serializable {

    private Long id;
}
