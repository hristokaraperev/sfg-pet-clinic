package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person{

    // == fields ==
    private Set<Speciality> specialities;

    // == public fields ==
    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
