package com.lambda.zoo.service;

import com.lambda.zoo.model.Zoo;

import java.util.ArrayList;

public interface ZooService
{
    ArrayList<Zoo> findAll();

    //delete function
    void delete(long id);
}
