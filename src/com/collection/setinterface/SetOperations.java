package com.collection.setinterface;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        Set<Person1> set1 = new HashSet<>();
        Set<Person1> set2 = new LinkedHashSet<>();

        Person1 p1 = new Person1(1, "Alice", 30);
        Person1 p2 = new Person1(2, "Bob", 25);
        Person1 p3 = new Person1(3, "Charlie", 35);
        Person1 p4 = new Person1(2, "Bob", 25); // Duplicate

        set1.add(p1);
        set1.add(p2);
        set1.add(p3);

        set2.add(p2);
        set2.add(p3);
        set2.add(p4);

        // Union
        Set<Person1> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection
        Set<Person1> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Difference (set1 - set2)
        Set<Person1> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + difference1);

        // Difference (set2 - set1)
        Set<Person1> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Difference (set2 - set1): " + difference2);
    }
}

