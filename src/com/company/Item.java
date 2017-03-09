package com.company;

/**
 * Created by Dima on 23.02.2017.
 */
public abstract class Item {
    public String name, description;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
