package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTest {

    @Test
    void mustCreateAnArrayWithNoElements() {
        Array array = new Array(2);

        long arraySize = array.getSize();

        assertEquals(0, arraySize);
    }

    @Test
    void mustAddAnElementInArray() {
        Array array = new Array(2);

        array.add("element 1");

        assertEquals(1, array.getSize());
    }

}