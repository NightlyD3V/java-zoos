package com.lambda.zoo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoo")
public class Zoo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    private String name;
    //OneToMany relationship between Telephone
    @OneToMany
    @JoinColumn(name = "phoneid")
    @JsonIgnoreProperties("zoo")
    private List<Telephone> telephones = new ArrayList<>();
    @ManyToMany(mappedBy = "zooList")
    @JsonIgnoreProperties("zoo")
    private List<Animal> animals = new ArrayList<>();

    public Zoo(){ }

    public Zoo(String zooname)
    {
        this.name = zooname;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getZooid()
    {
        return zooid;
    }

    public void setZooid(long zooid)
    {
        this.zooid = zooid;
    }

    public List<Telephone> getTelephones()
    {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones)
    {
        this.telephones = telephones;
    }

    public List<Animal> getAnimals()
    {
        return animals;
    }

    public void setAnimals(List<Animal> animals)
    {
        this.animals = animals;
    }
}
