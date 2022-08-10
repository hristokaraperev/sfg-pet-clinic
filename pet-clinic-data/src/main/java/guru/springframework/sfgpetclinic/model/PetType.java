package guru.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity{

    // == fields ==
    private String name;

    // == public methods ==
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
