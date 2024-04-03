package com.campus.course.lesson.routes;

import com.campus.course.base.routes.BaseRoutes;

public class LessonRoutes {
    private final  static String ROOT = BaseRoutes.API + "/lesson";


    public final static String CREATE = ROOT;

    public final static String BY_ID = ROOT + "/{id}";

    public final static String SEARCH = ROOT;

    public final static String EDIT = BY_ID;
}
