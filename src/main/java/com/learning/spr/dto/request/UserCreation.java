package com.learning.spr.dto.request;


import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreation {

    @Size(min = 5, message = "USERNAME_INVALID")
    String username;

    @Size(min = 8, max = 20, message = "INVALID_PASSWORD")
    String password;
    String firstName;
    String lastName;
    LocalDate birthDate;
}
