package domain.repository;

import java.util.List;

import domain.model.Person;


public interface PersonRepository {

    public void addPerson(Person person);
    public void removePerson(Person person);
    public List<Person> get();
    public Person get(int id);

}
