package com.fatecbs.ToDo.model;

import java.time.LocalDate;

public class ToDo {
	
	private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDate dueDate;
    private Priority priority;
    
	public enum Status {
	    TODO, IN_PROGRESS, DONE
	}

	public enum Priority {
	    LOW, MEDIUM, HIGH
	}
	
	public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
