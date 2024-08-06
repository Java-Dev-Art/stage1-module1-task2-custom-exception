package com.epam.mjc;

public class StudentException extends IllegalArgumentException{
    public StudentException(String idStud) {
        super( "Could not find student with ID " + idStud);
    }
}
