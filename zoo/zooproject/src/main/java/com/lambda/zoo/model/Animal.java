package com.lambda.zoo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animal")
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;
    @ManyToMany()
    @JoinTable(name = "zooanimals", joinColumns = @JoinColumn(name = "animalid"), inverseJoinColumns = @JoinColumn(name = "zooid"))
    @JsonIgnoreProperties("animal")
    private List<Zoo> zooList = new ArrayList<>();
    private String animaltype;

    public Animal(){ }

    public Animal(String animaltype)
    {
        this.animaltype = animaltype;
    }

    public String getAnimaltype()
    {
        return animaltype;
    }

    public void setAnimaltype(String animaltype)
    {
        this.animaltype = animaltype;
    }
}
