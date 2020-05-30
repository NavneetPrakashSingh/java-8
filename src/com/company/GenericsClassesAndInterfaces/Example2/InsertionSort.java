package com.company.GenericsClassesAndInterfaces.Example2;

public class InsertionSort {
    public int[] sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j >= 0; j--) {
                if(list[j]>list[i]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
}
