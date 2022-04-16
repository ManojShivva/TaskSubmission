package com.kaiburr.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kaiburr.entities.Framework;

public interface FrameworkRepo extends MongoRepository<Framework, Integer> {

}
