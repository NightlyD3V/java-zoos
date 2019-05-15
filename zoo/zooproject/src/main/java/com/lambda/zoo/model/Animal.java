package com.lambda.zoo.model;

import javax.persistence.*;

@Entity
@Table(name = "animal")
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
