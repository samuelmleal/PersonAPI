package project.PersonAPI.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.PersonAPI.DTO.MessageResponseDTO;
import project.PersonAPI.Entity.Person;
import project.PersonAPI.Repository.PersonRepository;
import project.PersonAPI.Service.PersonService;

@RestController
@RequestMapping("api/v1/people")
public class PersonController {

   private PersonService personService;

   @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person) {
    return personService.createPerson(person);
    }
}
