package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication implements CommandLineRunner {


    @Autowired
    PersonRepository personRepository;

    @Autowired
    DogRepository dogRepository;

    @Autowired
    ManagerRepository managerRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setName("John");
        personRepository.save(person);

        Person personFromDb = personRepository.findFirstByName("John");
        System.out.println(personFromDb);

        Dog dog = new Dog();
        dog.setName("Maxx");
        dogRepository.save(dog);

        Dog dogFromDb = dogRepository.findFirstByName("Maxx");
        System.out.println(dogFromDb);

        Manager manager = new Manager();
        manager.setFirstName("Jose") ;
        manager.setLastName("Martinez") ;
        manager.setDepartment("CIS"); ;
        managerRepository.save(manager);

        Manager managerFromDb1 = managerRepository.findFirstByFirstName("Jose");
        //System.out.println(managerFromDb);
        System.out.println(managerFromDb1);

        Manager managerFromDb2 = managerRepository.findFirstByLastName("Martinez");
        //System.out.println(managerFromDb);
        System.out.println(managerFromDb2);
    }
}
