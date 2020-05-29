package com.company.Generics.Example1.WithGenerics;

public class GenericsCircularBuffer<T> {
    int start = 0;
    int end = 0;
    T[] buffer;

    public GenericsCircularBuffer(int size) {
        buffer = (T[]) new Object[size];
    }

    public boolean add(T element) {
        if(buffer[end]==null){
            buffer[end] = element;
            end = next(end);
            return true;
        }
        return false;
    }

    public T remove(){
        T current = buffer[start];
        if(current!=null){
            buffer[start] = null;
            start = next(start);
            return current;
        }
        return null;
    }

    public int next(int current) {
        return (current + 1) % buffer.length;
    }
}
