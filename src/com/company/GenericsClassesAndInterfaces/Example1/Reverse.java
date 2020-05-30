package com.company.GenericsClassesAndInterfaces.Example1;

import java.util.Comparator;

public class Reverse<T> implements Comparator<T> {
    Comparator<T> comparator;

    public Reverse(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(T student1, T student2) {
        return comparator.compare(student2, student1);
    }
}
