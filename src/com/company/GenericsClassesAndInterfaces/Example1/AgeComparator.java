package com.company.GenericsClassesAndInterfaces.Example1;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
