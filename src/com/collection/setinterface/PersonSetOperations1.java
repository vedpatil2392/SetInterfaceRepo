package com.collection.setinterface;


	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.Set;

	public class PersonSetOperations1 {

	    public static void addPersonToHashSet(Set<Person1> set, Person1 person) {
	        set.add(person);
	    }

	    public static void addPersonToLinkedHashSet(Set<Person1> set, Person1 person) {
	        set.add(person);
	    }

	    public static void main(String[] args) {
	        Set<Person1> hashSet = new HashSet<>();
	        Set<Person1> linkedHashSet = new LinkedHashSet<>();

	        Person1 p1 = new Person1(1, "Alice", 30);
	        Person1 p2 = new Person1(2, "Bob", 25);
	        Person1 p3 = new Person1(1, "Alice", 30); // Duplicate based on id

	        addPersonToHashSet(hashSet, p1);
	        addPersonToHashSet(hashSet, p2);
	        addPersonToHashSet(hashSet, p3); // Won't be added

	        addPersonToLinkedHashSet(linkedHashSet, p1);
	        addPersonToLinkedHashSet(linkedHashSet, p2);
	        addPersonToLinkedHashSet(linkedHashSet, p3); // Won't be added

	        System.out.println("HashSet: " + hashSet);
	        System.out.println("LinkedHashSet: " + linkedHashSet);
	    }
	

}
