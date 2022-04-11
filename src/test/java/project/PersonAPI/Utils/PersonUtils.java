package project.PersonAPI.Utils;

import project.PersonAPI.DTO.Request.PersonDTO;
import project.PersonAPI.Entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Samuel";
    private static final String LAST_NAME = "Leal";
    private static final String CPF_NUMBER = "44015027876";
    private static final long PERSON_ID = 1L;
    private static final LocalDate BIRTH_DATE = LocalDate.of(2002,10,18);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .id(PERSON_ID)
                .birthDate("18-10-2002")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity(){
        return Person.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .id(PERSON_ID)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }


}
