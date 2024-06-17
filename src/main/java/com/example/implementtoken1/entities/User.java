package com.example.implementtoken1.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_first_name")
    private String userFirstName;

    @Column(name = "user_last_name")
    private String userLastName;

    @Column(name = "user_password")
    private String userPassword;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns = {
                    @JoinColumn(name = "USER_ID")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID")
            }
    )
    private Set<Role> role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) && Objects.equals(userFirstName, user.userFirstName) && Objects.equals(userLastName, user.userLastName) && Objects.equals(userPassword, user.userPassword) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userFirstName, userLastName, userPassword, role);
    }
}
