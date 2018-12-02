package com.example.demo.domain.modal;

import javax.persistence.Entity;

import lombok.Getter;

@Getter
@Entity
public class Test {

    private int id;

    private String name;

    private String description;

}
