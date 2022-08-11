package guru.springframework.sfgpetclinic.model;

public class Speciality extends BaseEntity{

    // == fields ==
    private String description;

    // == public fields ==
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
