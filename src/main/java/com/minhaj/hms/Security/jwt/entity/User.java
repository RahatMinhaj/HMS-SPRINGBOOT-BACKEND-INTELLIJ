package com.minhaj.hms.Security.jwt.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User implements UserDetails {

    @Id
    private String userName;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    private String userFirstName;
    private String userLastName;
    private String password;
    private LocalDate userDOB;
    private String userLoc;


    private String userMobile;
    private String userGender;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime userRegistrationDate;

    private String registrationIP;

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


    @PrePersist
    public void prePersist() {
        this.userRegistrationDate = LocalDateTime.now();
    }



    private boolean credentialsNonExpired;


    private boolean enabled = true;
    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return userName != null && Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
