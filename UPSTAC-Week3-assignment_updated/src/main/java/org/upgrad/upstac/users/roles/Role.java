package org.upgrad.upstac.users.roles;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

//I am using MySQL version 8.0.0. in which role is a reserved keyword hence can not be used to create the table with name
//role in the database. Therefore renamed it with 'upstac_role'
@Entity(name="upstac_role")
public class Role {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonIgnore
    private  Long id;

    @Column(unique = true)
    private String name;

    @Column
    @JsonIgnore
    private String description;



    public  Long getId() {
        return id;
    }

    public void setId( Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
