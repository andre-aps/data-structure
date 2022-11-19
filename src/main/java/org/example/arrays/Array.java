package org.example.arrays;

import lombok.Getter;

@Getter
public class Array {

    private String[] elements;
    private int size;

    public Array(int capacity) {
        elements = new String[capacity];
        size = 0;
    }

    public boolean add(String element) {
        if (size < elements.length) {
            elements[size] = element;
            size++;
            return true;
        }
        return false;
    }

}
