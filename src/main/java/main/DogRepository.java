package main;

import org.springframework.data.repository.CrudRepository;


public interface DogRepository extends CrudRepository<Dog, Integer> {

    Dog findFirstByName(String name);




}
