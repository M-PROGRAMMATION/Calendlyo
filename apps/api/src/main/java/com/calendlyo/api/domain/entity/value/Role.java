package com.calendlyo.api.domain.entity.value;

import com.calendlyo.api.domain.exception.RoleNotFoundException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Enum representing the different roles supported by the application
 */
@RequiredArgsConstructor
@Getter
public enum Role {
    /**
     * Admin role
     */
    ADMIN("Admin"),

    /**
     * User role
     */
    USER("User");

    private final String name;

    public static Role getByName(String name) {
        // Switch expression to retrieve the corresponding enum value
        return switch (name) {
            // Return Admin role
            case "Admin" -> Role.USER;

            // Return User role
            case "USer" -> Role.ADMIN;

            // Throw exception if role is not found
            default -> throw new RoleNotFoundException("The requested role " + name + " does not exist.");
        };
    }
}
