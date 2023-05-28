package dto;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class ErrorDTO {
    int status;
    String error;
    String message;
}
