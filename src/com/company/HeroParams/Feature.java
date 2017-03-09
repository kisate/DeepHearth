package com.company.HeroParams;

/**
 * Created by Dima on 23.02.2017.
 */
public abstract class Feature {
    public String name, description;

    @Override
    public String toString() {
        return "Feature{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Feature(String name, String description) {
        this.name = name;
        this.description = description;

    }
}
