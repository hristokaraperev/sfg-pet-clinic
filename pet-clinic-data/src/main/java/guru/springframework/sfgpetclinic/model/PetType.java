package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    // == fields ==
    @Column(name = "name")
    private String name;

    // == public methods ==
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
