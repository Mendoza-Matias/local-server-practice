package com.mmendoza.localserver.domain;

import java.time.Instant;

public record Health(
        String status,
        Instant timestamp
) {
}
