
package guru.springframework;

import guru.springframework.sfgpetclinic.SfgPetClinicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


//@SpringBootTest(classes = SfgPetClinicApplication.class)
//@ActiveProfiles("springdatajpa")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SfgPetClinicApplication.class)
public class SfgPetClinicApplicationTests {

    @Test
    void contextLoads() {
    }
}
