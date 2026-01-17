package com.calendlyo.api.domain.exception;

/**
 * Custom exception to indicate when a lang was not found in the system within the application
 * extends {@link RuntimeException} to provide unchecked exception handling
 */
public class RoleNotFoundException extends RuntimeException {

    /**
     * This exception should be considered as a generic error and should not be
     * caught by the application. Instead, it should be logged and handled by the
     * framework
     *
     * @param message the message to be passed to the exception
     */
    public RoleNotFoundException(String message) {
        super(message);
    }

}
