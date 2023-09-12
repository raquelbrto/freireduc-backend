package com.core.freireducbackend.domain;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {
    private long id;
    private String name;
    private LocalDate createDate;
    private LocalDate lastLogin;
}
