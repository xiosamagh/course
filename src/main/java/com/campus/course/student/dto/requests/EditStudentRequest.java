package com.campus.course.student.dto.requests;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EditStudentRequest {
    private String lastName;
    private String firstName;

}
