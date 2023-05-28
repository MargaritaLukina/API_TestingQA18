package dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class AuthRequestDTO {
    String username;
    String password;
}
