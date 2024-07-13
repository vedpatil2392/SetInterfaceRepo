package com.collection.setinterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PerformanceAnalysis {

    public static void main(String[] args) {
        int numElements = 1_000_000;
        Set<Person1> hashSet = new HashSet<>();
        Set<Person1> linkedHashSet = new LinkedHashSet<>();

        long startTime, endTime;

        // Measure add performance
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            hashSet.add(new Person1(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet add time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedHashSet.add(new Person1(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet add time: " + (endTime - startTime) + " ns");

        // Measure contains performance
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            hashSet.contains(new Person1(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet contains time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedHashSet.contains(new Person1(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet contains time: " + (endTime - startTime) + " ns");

        // Measure remove performance
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            hashSet.remove(new Person1(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet remove time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedHashSet.remove(new Person1(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet remove time: " + (endTime - startTime) + " ns");
    }
}


