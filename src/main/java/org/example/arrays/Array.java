package org.example.arrays;

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

    public boolean add(int position, String element) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("invalid position");
        }

        for (int i = size - 1; i >= position; i--) {
            elements[i + 1] = elements[i];
        }
        elements[position] = element;
        size++;

        return true;
    }

    public int size() {
        return size;
    }

    public String find(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("invalid position");
        }
        return elements[position];
    }

    public int find(String element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i < size - 1; i++) {
            stringBuilder.append(elements[i]);
            stringBuilder.append(", ");
        }

        if (size > 0) {
            stringBuilder.append(elements[size - 1]);
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}
