package project.PersonAPI.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import project.PersonAPI.DTO.Request.PersonDTO;
import project.PersonAPI.DTO.Response.MessageResponseDTO;
import project.PersonAPI.Entity.Person;
import project.PersonAPI.Exception.PersonNotFoundException;
import project.PersonAPI.Service.PersonService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/people")
public class PersonController {

   private PersonService personService;

   @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
    return personService.createPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll (){
       return personService.listAll();
    }

    @GetMapping ("/{id}")
    public PersonDTO findById (@PathVariable Long id) throws PersonNotFoundException {
       return personService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws PersonNotFoundException {
        personService.delete(id);
    }

}
