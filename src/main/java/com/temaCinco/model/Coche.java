package com.temaCinco.model;

import java.util.Objects;

public class Coche {

    private Long id;
    private String name;
    private String description;
    private String type;

    public Coche(Long id, String name, String description, String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(id, coche.id) && Objects.equals(name, coche.name) && Objects.equals(description, coche.description) && Objects.equals(type, coche.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, type);
    }
}
