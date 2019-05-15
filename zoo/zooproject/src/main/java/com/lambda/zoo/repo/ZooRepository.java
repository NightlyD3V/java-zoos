package com.lambda.zoo.repo;

import com.lambda.zoo.model.Zoo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{
    ArrayList<Zoo> findZooByName(String name);
    @Modifying
    @Query(value = "DELETE FROM zoo WHERE zooid = :zooid", nativeQuery = true)
    void deleteZoo(long zooid);
}
