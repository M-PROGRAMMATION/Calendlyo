package com.calendlyo.api.domain.entity;

import java.time.Instant;

/**
 * Entity record representing an exception
 *
 * @param exception the class of the exception
 * @param status    the HTTP status code of the exception
 * @param message   the human-readable error message of the exception
 * @param instant   the time and date of the exception
 */
public record ExceptionEntity(
        String exception,
        Integer status,
        String message,
        Instant instant
) {

}
