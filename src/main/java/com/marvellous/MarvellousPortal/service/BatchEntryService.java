package com.marvellous.MarvellousPortal.service;

import com.marvellous.MarvellousPortal.exception.BatchNotFoundException;
import com.marvellous.MarvellousPortal.entity.BatchEntry;
import com.marvellous.MarvellousPortal.repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;

    // C : Create
    // POST
    public void saveEntry(BatchEntry batchEntry)
    {
        batchEntryRepository.save(batchEntry);
    }

    // R : Read
    // GET
    public List<BatchEntry> getAll()
    {
        return batchEntryRepository.findAll();
    }

    // R : Read
    // GET
    public BatchEntry findById(String id) {
        return batchEntryRepository.findById(id)
                .orElseThrow(() -> new BatchNotFoundException("Batch not found with id: " + id));
    }

    // D : Delete
    // DELETE
    public void deleteById(String id) {
        BatchEntry batch = batchEntryRepository.findById(id)
                .orElseThrow(() -> new BatchNotFoundException("Batch not found with id: " + id));
        batchEntryRepository.delete(batch);

    }
}
