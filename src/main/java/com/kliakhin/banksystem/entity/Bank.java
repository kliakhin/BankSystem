package com.kliakhin.banksystem.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by ������� on 03/17/16.
 */
@Entity
@Table(name = "bank")
public class Bank {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "incerement", strategy = "increment")
    @Column(name= "id", length = 6, nullable = false)
    private long id;
    @Column(name = "name")
    private String name;

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
