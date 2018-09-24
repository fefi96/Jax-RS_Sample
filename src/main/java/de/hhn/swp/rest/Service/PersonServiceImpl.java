package de.hhn.swp.rest.Service;

import de.hhn.swp.rest.model.Person;

import javax.ejb.Stateless;
import javax.inject.Named;
import java.time.LocalDate;
import java.util.List;

import static java.util.Arrays.asList;

@Stateless
@Named
public class PersonServiceImpl implements PersonService {

    private final List<Person> list =
            asList(new Person("Max", "Mustermann", LocalDate.of(2001, 1, 1)), new Person("Monika", "Musterfrau", LocalDate.of(1970, 1, 1)));

    @Override
    public List<Person> getAll() {
        return list;
    }

    @Override
    public Person get(int id) {
        return list.get(id);
    }

    @Override
    public void add(Person person) {
        list.add(person);
    }

    @Override
    public void update(int id, Person person) {
        list.set(id, person);
    }
}
