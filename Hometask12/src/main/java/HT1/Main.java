package HT1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Integer> randomList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            randomList.add(new Random().nextInt());
        }

        List<Integer> collect1 = randomList.stream()
                .distinct()
                .collect(Collectors.toList());

        List<Integer> collect2 = randomList.stream()
                .filter((Integer) -> Integer >= 7 && Integer <= 17)
                .collect(Collectors.toList());

        List<Integer> collect3 = randomList.stream()
                .map( Integer -> Integer = Integer * 2)
                .collect(Collectors.toList());

        List<Integer> collect4 = randomList.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());

        long count = randomList.stream()
                .count();

        OptionalDouble average = randomList.stream()
                .mapToInt(Integer -> Integer)
                .average();

        System.out.println(collect1);
        System.out.println(collect2);
        System.out.println(collect3);
        System.out.println(collect4);
        System.out.println(count);
        System.out.println(average);



    }

}
