package com.calendlyo.api.infrastructure.converter;

import com.calendlyo.api.domain.entity.value.Lang;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import com.calendlyo.api.domain.exception.LangNotFoundException;

/**
 * The converter between {@link Lang} and its corresponding name for JPA mapping
 */
@Converter(autoApply = true)
public class LangConverter implements AttributeConverter<Lang, String> {

    /**
     * Convert the given {@link Lang} to its corresponding name
     *
     * @param lang the language to convert
     * @return the name of the language
     */
    @Override
    public final String convertToDatabaseColumn(Lang lang) {
        return lang.getName();
    }

    /**
     * Convert the given name to its corresponding {@link Lang}
     *
     * @param name the name of the language
     * @return the corresponding {@link Lang}
     * @throws LangNotFoundException if the given name does not correspond to any language
     */
    @Override
    public final Lang convertToEntityAttribute(String name) {
        return Lang.getByName(name);
    }

}
