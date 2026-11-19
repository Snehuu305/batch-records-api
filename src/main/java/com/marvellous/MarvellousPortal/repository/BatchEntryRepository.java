package com.marvellous.MarvellousPortal.repository;

import com.marvellous.MarvellousPortal.entity.BatchEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, String>
{

}
