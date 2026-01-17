package com.calendlyo.api.infrastructure.converter;

import com.calendlyo.api.domain.entity.value.Role;
import com.calendlyo.api.domain.exception.RoleNotFoundException;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/**
 * The converter between {@link Role} and its corresponding name for JPA mapping
 */
@Converter(autoApply = true)
public class RoleConverter implements AttributeConverter<Role, String> {

    /**
     * Convert the given {@link Role} to its corresponding name
     *
     * @param role the role to convert
     * @return the name of the role
     */
    @Override
    public final String convertToDatabaseColumn(Role role) {
        return role.getName();
    }

    /**
     * Convert the given name to its corresponding {@link Role}
     *
     * @param name the name of the role
     * @return the corresponding {@link Role}
     * @throws RoleNotFoundException if the given name does not correspond to any role
     */
    @Override
    public final Role convertToEntityAttribute(String name) {
        return Role.getByName(name);
    }

}
