package com.calendlyo.api.domain.entity.user;

import com.calendlyo.api.domain.entity.basic.BasicEntity;
import com.calendlyo.api.domain.entity.value.Lang;
import com.calendlyo.api.domain.entity.value.Role;
import com.calendlyo.api.infrastructure.converter.LangConverter;
import com.calendlyo.api.infrastructure.converter.RoleConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity representing a user in the system
 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity extends BasicEntity {

    @Id
    @Column(name = "id",
            unique = true,
            nullable = false,
            length = 36
    )
    private String id;

    @Column(name = "last_name",
            nullable = false,
            length = 100
    )
    private String lastName;

    @Column(name = "first_name",
            nullable = false,
            length = 100
    )
    private String firstName;

    @Column(name = "email",
            nullable = false,
            unique = true,
            length = 150
    )
    private String email;

    @Column(name = "password_hash",
            nullable = false,
            length = 150
    )
    private String passwordHash;

    @Convert(converter = RoleConverter.class)
    @Column(name = "role",
            nullable = false
    )
    private Role role = Role.USER;

    @Convert(converter = LangConverter.class)
    @Column(name = "lang",
            nullable = false
    )
    private Lang lang = Lang.FR_FR;
}
