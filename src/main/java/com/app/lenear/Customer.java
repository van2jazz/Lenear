package com.app.lenear;

import java.time.Instant;
import java.util.regex.Pattern;

public record Customer(

        String id,
        String firstName,
        String lastName,
        String email,
        Instant createdAt
) {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");


    public Customer {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Customer ID must not be blank");
        }
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name must not be blank");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name must not be blank");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email must not be blank");
        }
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Email must have a valid format");
        }
        if (createdAt == null) {
            throw new IllegalArgumentException("CreatedAt must not be blank");
        }

    }

}


