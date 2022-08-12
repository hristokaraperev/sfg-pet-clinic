package guru.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

public interface Pet extends CrudRepository<Pet, Long> {
}
