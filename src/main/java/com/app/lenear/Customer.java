package com.app.lenear;

import java.time.Instant;

public record Customer(
        String id,
        String firstName,
        String lastName,
        String email,
        Instant createdAt
)
{ }