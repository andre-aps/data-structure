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

}
