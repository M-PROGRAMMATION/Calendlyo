package com.calendlyo.api.domain.entity.value;

import com.calendlyo.api.domain.exception.LangNotFoundException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Enum representing the different languages supported by the application
 */
@RequiredArgsConstructor
@Getter
public enum Lang {

    /**
     * French language
     */
    FR_FR("fr_FR"),

    /**
     * English language
     */
    EN_EN("en_EN");

    private final String name;

    /**
     * Retrieve the corresponding {@link Lang} enum for the given language name
     *
     * @param name the name of the language, expected to match one of the defined enum values
     * @return the corresponding {@link Lang} enum.
     * @throws LangNotFoundException if no matching language is found for the given name
     */
    public static Lang getByName(String name) {
        // Switch expression to retrieve the corresponding enum value
        return switch (name) {
            // Return French language
            case "fr_FR" -> Lang.FR_FR;

            // Return English language
            case "en_EN" -> Lang.EN_EN;

            // Throw exception if language is not found
            default -> throw new LangNotFoundException("The requested language " + name + " does not exist.");
        };
    }

}
