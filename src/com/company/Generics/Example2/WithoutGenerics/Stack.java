package com.company.Generics.Example2.WithoutGenerics;

//follows LIFO principle
public class Stack {
    int pointer = 0;
    Object[] buffer;

    public Stack(int size) {
        buffer = new Object[size];
    }

    public boolean push(Object element) {
        if (pointer >= buffer.length) {
            return false;
        }
        buffer[pointer] = element;
        pointer++;
        return true;
    }

    public Object poll() {
        if (pointer <= 0) {
            return null;
        }
        pointer--;
        Object removedElement = buffer[pointer];
        buffer[pointer] = null;
        return removedElement;
    }

}
