package com.campus.course.student.dto.requests;


import com.campus.course.student.exception.BadRequestException;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegistrationRequest {
    private String lastName;
    private String firstName;
    private String email;
    private String password;

    public void validate() throws BadRequestException {
        if (email == null || email.isBlank()) throw new BadRequestException();
        if (password == null || password.isBlank()) throw new BadRequestException();
     }

}
