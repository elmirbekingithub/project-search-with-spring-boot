package peaksoft.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Builder
@Getter
@Setter
public class Response {

    private String message;
    private HttpStatus httpStatus;
}
