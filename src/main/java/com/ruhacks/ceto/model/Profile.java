package com.ruhacks.ceto.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Entity
@Table(name = "t_profiles")
public class Profile {
    @Id
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "displayName")
    private String displayName;

    public Profile() { }

    public Profile(String email, String password, String displayName) {
        this.email = email;
        this.password = password;
        this.displayName = displayName;
    }
}
