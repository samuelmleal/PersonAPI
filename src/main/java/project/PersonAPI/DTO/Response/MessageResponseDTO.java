package project.PersonAPI.DTO.Response;


import lombok.Builder;
import lombok.Data;
import org.aspectj.bridge.Message;

@Data
@Builder
public class MessageResponseDTO {

    private String message;
}
