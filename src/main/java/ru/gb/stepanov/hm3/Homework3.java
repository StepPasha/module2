package ru.gb.stepanov.hm3;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = {
                "Table", "chair", "monitor",
                "keyboard", "mouse", "guitar",
                "tv", "wear", "java",
                "idea", "light", "tea",
                "mouse", "bed", "door",
                "guitar", "internet", "chair", "internet"};

        Set<String> unique = new HashSet<>(Arrays.asList(words));
        System.out.println(unique);

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "8911333445");
        phonebook.add("Smirnov", "891023423");
        phonebook.add("Sobolev", "891242535");
        phonebook.add("Ivanov", "8989992389");
        phonebook.add("Medvedkov", "8919929323");
        phonebook.add("Lovrov", "8912492949");

        System.out.println(phonebook.get("Ivanov"));
    }
}
