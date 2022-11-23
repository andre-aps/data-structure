package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTest {

    @Test
    void mustCreateAnArrayWithNoElements() {
        Array array = new Array(10);

        long arraySize = array.size();

        assertEquals(0, arraySize);
    }

    @Test
    void mustAddAnElementInArray() {
        Array array = new Array(10);

        array.add("element 1");

        assertEquals(1, array.size());
    }

    @Test
    void mustPrintArrayElements() {
        Array array = new Array(10);

        array.add("element 1");
        array.add("element 2");
        array.add("element 3");

        String arrayExpected = "[element 1, element 2, element 3]";

        assertEquals(arrayExpected, array.toString());
    }

    @Test
    void mustFindAnElementInArray() {
        Array array = new Array(10);

        array.add("element 1");

        assertEquals("element 1", array.find(0));
    }

    @Test
    void mustFindElementPositionInArray() {
        Array array = new Array(10);

        array.add("element 1");

        assertEquals(0, array.find("element 1"));
    }

    @Test
    void mustAddAnElementAtPosition() {
        Array array = new Array(10);

        array.add("element 1");
        array.add("element 3");
        array.add("element 4");

        array.add(1, "element 2");

        assertEquals("element 2", array.find(1));
    }

}