package com.collection.setinterface;

import java.util.*;
import java.util.stream.Collectors;

class Conference {
    private Set<Person1> attendees = new HashSet<>();

    // Method to add attendees
    public void addAttendee(Person1 person) {
        attendees.add(person);
    }

    // Method to remove an attendee
    public void removeAttendee(Person1 person) {
        attendees.remove(person);
    }

    // Find duplicate attendees based on id
    public Set<Person1> findDuplicateAttendees() {
        Set<Person1> uniqueAttendees = new HashSet<>();
        Set<Person1> duplicates = new HashSet<>();

        for (Person1 attendee : attendees) {
            if (!uniqueAttendees.add(attendee)) {
                duplicates.add(attendee);
            }
        }
        return duplicates;
    }

    // List all unique attendees
    public Set<Person1> listUniqueAttendees() {
        return new HashSet<>(attendees);
    }

    // Find attendees within a certain age range
    public Set<Person1> findAttendeesByAgeRange(int minAge, int maxAge) {
        return attendees.stream()
                .filter(person -> person.getAge() >= minAge && person.getAge() <= maxAge)
                .collect(Collectors.toSet());
    }
}
