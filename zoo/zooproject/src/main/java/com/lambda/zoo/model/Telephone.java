package com.lambda.zoo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "telephone")
public class Telephone
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    private String phonetype;
    private String phonenumber;

    @ManyToOne()
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties("telephone")
    private Zoo zooid = new Zoo();

    public Telephone(String phonetype, String phonenumber)
    {
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
    }

    public String getPhonetype()
    {
        return phonetype;
    }

    public void setPhonetype(String phonetype)
    {
        this.phonetype = phonetype;
    }

    public String getPhonenumber()
    {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phonenumber = phonenumber;
    }
}
