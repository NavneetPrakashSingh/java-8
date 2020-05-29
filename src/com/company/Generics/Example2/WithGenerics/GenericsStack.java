package com.company.Generics.Example2.WithGenerics;

//follows LIFO principle
public class GenericsStack<T> {
    int pointer = 0;
    T[] buffer;

    public GenericsStack(int size) {
        buffer = (T[]) new Object[size];
    }

    public boolean push(T element) {
        if (pointer >= buffer.length) {
            return false;
        }
        buffer[pointer] = element;
        pointer++;
        return true;
    }

    public Object pop() {
        if (pointer <= 0) {
            return null;
        }
        pointer--;
        Object currentElement = buffer[pointer];
        buffer[pointer] = null;
        return currentElement;
    }
}
