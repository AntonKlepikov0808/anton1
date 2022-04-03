package Lesson_8;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "beer", "love", "mock", "lock", "fork", "mock", "golf", "vodka"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Batova", "375297143431");
        pb.add("Klepikov", "375295124049");
        pb.add("Klepikov", "375297165149");

        System.out.println(pb.get("Petrov"));
    }
}
