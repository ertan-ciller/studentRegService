package com.example.studentRegService.api.constants;

import org.springframework.http.MediaType;

public final class ApiEndpoints {

    public static final String RESPONSE_CONTENT_TYPE = MediaType.APPLICATION_JSON_VALUE+";charset=UTF-8";

    public static final String API_BASE_URL="/api";

    public static final String HEALTHCHECK_API = API_BASE_URL+"/healthcheck";

    public static final String STUDENTS = "/students";

}
