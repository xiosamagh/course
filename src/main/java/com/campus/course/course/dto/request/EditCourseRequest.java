package com.campus.course.course.dto.request;

import com.campus.course.course.entity.CourseEntity;
import lombok.Data;

@Data
public class EditCourseRequest {
    private Long id;
    private String title;
    private String description;


}

