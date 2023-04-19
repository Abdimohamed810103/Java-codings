package org.example.decoratorLamda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Immutable {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3);
        Integer collect = numbers.stream().collect(Collectors.reducing(0, doubleNum -> doubleNum * 2, (s1, s2) -> s1 + s2));
        System.out.println(collect);


    }
}
