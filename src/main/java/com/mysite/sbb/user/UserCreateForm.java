package com.mysite.sbb.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @Size(min = 3, max = 25)
    @NotEmpty(message = "ID required.")
    private String username;

    @NotEmpty(message = "Password required.")
    private String password1;

    @NotEmpty(message = "Password check required.")
    private String password2;

    @NotEmpty(message = "email required.")
    @Email
    private String email;
}
