package HT2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> studentsNameList = new ArrayList<>();

        studentsNameList.add("Petya");
        studentsNameList.add("VasyA");
        studentsNameList.add("Oleg");
        studentsNameList.add("Renat");
        studentsNameList.add("artem");
        studentsNameList.add("Vasya");
        studentsNameList.add("Avgust");

        long count = studentsNameList.stream()
                .filter(String -> String.equalsIgnoreCase("vAsYa"))
                .count();

        List<String> collected = studentsNameList.stream()
                .filter(String -> String.startsWith("A") || String.startsWith("a"))
                .collect(Collectors.toList());

        Optional<String> first = studentsNameList.stream()
                .sorted(Comparator.comparing(String -> String))
                .findFirst();



        System.out.println(count);

        System.out.println(collected);

        System.out.println(first);


    }
}
