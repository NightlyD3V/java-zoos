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

    private String zooname;
    //OneToMany relationship between Telephone
    @OneToMany
    @JoinColumn(name = "telephoneid")
    @JsonIgnoreProperties("zoo")
    private List<Telephone> telephones = new ArrayList<>();
    @ManyToMany(mappedBy = "zoo")
    @JsonIgnoreProperties("zoo")
    private List<Animal> animals = new ArrayList<>();

    public Zoo(){ }

    public Zoo(String zooname)
    {
        this.zooname = zooname;
    }

    public String getZooname()
    {
        return zooname;
    }

    public void setZooname(String zooname)
    {
        this.zooname = zooname;
    }

    public List<Telephone> getTelephones()
    {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones)
    {
        this.telephones = telephones;
    }
}
