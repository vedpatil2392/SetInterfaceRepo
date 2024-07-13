package com.collection.setinterface;
import java.util.*;

public class ComplexOperations {

    public static void main(String[] args) {
        Set<Person1> set1 = new HashSet<>();
        Set<Person1> set2 = new LinkedHashSet<>();

        Person1 p1 = new Person1(1, "Alice", 30);
        Person1 p2 = new Person1(2, "Bob", 25);
        Person1 p3 = new Person1(3, "Charlie", 35);
        Person1 p4 = new Person1(4, "David", 20);

        set1.add(p1);
        set1.add(p2);
        set1.add(p3);

        set2.add(p2);
        set2.add(p3);
        set2.add(p4);

        // Find max and min age
        Person1 maxAgePerson = Collections.max(set1, Comparator.comparingInt(person -> person.age));
        Person1 minAgePerson = Collections.min(set1, Comparator.comparingInt(person -> person.age));

        System.out.println("Max age in set1: " + maxAgePerson);
        System.out.println("Min age in set1: " + minAgePerson);

        // Sort by age
        List<Person1> sortedList1 = new ArrayList<>(set1);
        sortedList1.sort(Comparator.comparingInt(person -> person.age));

        List<Person1> sortedList2 = new ArrayList<>(set2);
        sortedList2.sort(Comparator.comparingInt(person -> person.age));

        System.out.println("Sorted set1 by age: " + sortedList1);
        System.out.println("Sorted set2 by age: " + sortedList2);

        // Filter persons by age
        Set<Person1> filteredSet = filterByAge(set1, 25);
        System.out.println("Filtered set1 by age > 25: " + filteredSet);
    }

    public static Set<Person1> filterByAge(Set<Person1> set, int age) {
        Set<Person1> result = new HashSet<>();
        for (Person1 person : set) {
            if (person.age > age) {
                result.add(person);
            }
        }
        return result;
    }
}


