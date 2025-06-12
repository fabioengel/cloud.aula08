package com.example.azuredemoproj;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {
    // Métodos CRUD básicos já vêm do MongoRepository
}