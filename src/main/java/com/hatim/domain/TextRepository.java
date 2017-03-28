package com.hatim.domain;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Hatim on 2017/3/27.
 */
public interface TextRepository extends MongoRepository<Text, ObjectId> {
    Text findById(String id);
}
