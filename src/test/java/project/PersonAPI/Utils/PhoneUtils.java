package project.PersonAPI.Utils;

import project.PersonAPI.DTO.Request.PhoneDTO;
import project.PersonAPI.Entity.Phone;
import project.PersonAPI.Enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "11999998888";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .id(PHONE_ID)
                .build();
    }

    public static Phone createFakeEntity(){
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
