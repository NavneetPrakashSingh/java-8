package com.company.Generics.Example1.WithoutGenerics;

public class CircularBuffer {
    int start = 0;
    int end = 0;
    Object[] buffer;

    public CircularBuffer(int size) {
        buffer = new Object[size];
    }

    public Object remove() {
        Object currentElement = buffer[start];
        if(null == currentElement){
            return null;
        }
        buffer[start] = null;
        start = next(start);
        return currentElement;

    }

    public boolean add(Object element) {
        if(buffer[end]==null){
            buffer[end] = element;
            end = next(end);
            return true;
        }
        return false;
    }

    public int next(int currentIndex) {
        return (currentIndex + 1) % buffer.length;
    }

    public int size(){
        return buffer.length;
    }

}
