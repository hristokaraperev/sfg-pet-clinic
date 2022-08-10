package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Optional;
import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


    // == public methods ==
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    public Owner findByLastName(String lastName) {
        Optional<Owner> searchResult = super.map.values().stream().filter(owner -> owner.getLastName().equals(lastName)).findFirst();
        return searchResult.orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId() ,object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
