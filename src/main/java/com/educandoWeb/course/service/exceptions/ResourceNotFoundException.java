package com.educandoWeb.course.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final  long serialVersionUID = 1l;

    public ResourceNotFoundException(Object id){
        super("Resource not found . id " + id);
    }
}
