package com.lambda.zoo.service;

import com.lambda.zoo.model.Zoo;
import com.lambda.zoo.repo.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
@Service(value = "ZooService")
public class ZooServiceImpl implements ZooService
{
    @Autowired
    private ZooRepository zooRepository;

    @Override
    public ArrayList<Zoo> findAll()
    {
        ArrayList<Zoo> list = new ArrayList<>();
        zooRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Transactional
    @Override
    public void delete(long id) throws EntityNotFoundException
    {
        if (zooRepository.findById(id).isPresent()) {
            zooRepository.deleteZoo(id);
            zooRepository.deleteById(id);
        }
        else {

            throw new EntityNotFoundException("Zoo with id " + id + " does not exist");

        }
    }
}
