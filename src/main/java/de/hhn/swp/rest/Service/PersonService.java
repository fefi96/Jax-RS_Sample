package de.hhn.swp.rest.Service;

import de.hhn.swp.rest.model.Person;

import java.io.Serializable;
import java.util.List;

public interface PersonService extends Serializable {

    List<Person> getAll();

    Person get(int id);

    void add(Person person);

    void update(int id, Person person);

    void delete(int id);

}
