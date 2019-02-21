package main;

import org.springframework.data.repository.CrudRepository;


public interface ManagerRepository extends CrudRepository<Manager, Integer> {

    Manager findFirstByFirstName(String name);
    Manager findFirstByLastName(String name);


}
