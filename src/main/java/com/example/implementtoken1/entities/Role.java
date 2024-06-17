package com.example.implementtoken1.entities;

import com.example.implementtoken1.Shared.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role {

    @Id
    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_description")
    private String roleDescription;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(roleName, role.roleName) && Objects.equals(roleDescription, role.roleDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleName, roleDescription);
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }
}
