package com.example.azuredemoproj;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks") // Nome da coleção no MongoDB
public class Task {

    @Id
    private String id;
    private String description;
    private boolean completed;

    // Construtores
    public Task() {
    }

    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
               "id='" + id + '\'' +
               ", description='" + description + '\'' +
               ", completed=" + completed +
               '}';
    }
}