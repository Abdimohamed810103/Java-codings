package org.example.fucntional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JavaFunc {
    public static List<String> replace(List<String> names, Replacer<String> r){
      List<String> list = new ArrayList<>();
        if (names != null) {
            for (String name: names) {
                list.add(r.replace(name));
            }
        }
        return list;
    }
    public static Function<String,String> replaceString(Function<String,String> ...functions){
        Function<String, String> function = Stream.of(functions).reduce(Function.identity(), Function::andThen);
        return function;
    }

    public static void main(String[] args) {
      //  List<String> abdi = List.of("abdi", null, "Muse", "Cali");


        List<Integer> ints = List.of(2, 4, 7, 0, 3, 4, 2, 7, 9, 0);
        List<Integer> sorted = ints.stream().filter(s -> s.intValue() != 0)
                .distinct()
                .skip(2)
                .limit(3)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);

    }

}
