package project.PersonAPI.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import project.PersonAPI.DTO.Request.PersonDTO;
import project.PersonAPI.DTO.Response.MessageResponseDTO;
import project.PersonAPI.Entity.Person;
import project.PersonAPI.Entity.Phone;
import project.PersonAPI.Repository.PersonRepository;
import project.PersonAPI.Utils.PersonUtils;

import static org.mockito.Mockito.*;
import static project.PersonAPI.Utils.PhoneUtils.createFakeDTO;
import static project.PersonAPI.Utils.PhoneUtils.createFakeEntity;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSavedMessage() {
        PersonDTO personDTO = PersonUtils.createFakeDTO();
        Person expectedSavedPerson = PersonUtils.createFakeEntity();

        when(personRepository.save(expectedSavedPerson)).thenReturn(expectedSavedPerson);

        MessageResponseDTO expectedSucesMessage = createExpectedMessageResponse(expectedSavedPerson.getId());

        MessageResponseDTO sucessMessage = personService.createPerson(personDTO);

        Assertions.assertEquals(expectedSucesMessage, sucessMessage);
    }

    private MessageResponseDTO createExpectedMessageResponse(Long id) {
        return MessageResponseDTO
                .builder()
                .message("Created person with ID : " + id)
                .build();
    }
}
