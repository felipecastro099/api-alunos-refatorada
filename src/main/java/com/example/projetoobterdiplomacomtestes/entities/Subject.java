package com.example.projetoobterdiplomacomtestes.entities;

public class Subject {
    private String name;
    private Double note;

    public Subject(String name, Double note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }
}
