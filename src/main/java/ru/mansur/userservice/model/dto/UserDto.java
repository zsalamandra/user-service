package ru.mansur.userservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String roleName;
}
