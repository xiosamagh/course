package com.campus.course.lesson.dto.response;

import com.campus.course.course.dto.response.CourseResponse;
import com.campus.course.course.entity.CourseEntity;
import com.campus.course.lesson.entity.LessonEntity;
import com.campus.course.lesson.repository.LessonRepository;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@Builder

public class LessonResponse {
    protected  Long id;
    protected String title;
    protected String description;
    protected Long courseId;

    public static LessonResponse of(LessonEntity lesson) {
        return LessonResponse.builder()
                .id(lesson.getId())
                .title(lesson.getTitle())
                .description(lesson.getDescription())
                .courseId(lesson.getCourseId())
                .build();
    }

}
