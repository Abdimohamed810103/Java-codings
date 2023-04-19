package org.example.decoratorLamda;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CakeDecorator {
    private  Function<Cake,Cake> decorator;

    public CakeDecorator(Function<Cake, Cake>... decorate) {
        addDecorator(decorate);
    }

    public Cake decorate(Cake cake){
       return decorator.apply(cake);
    }
    private void addDecorator(Function<Cake, Cake>... decorate) {
       decorator = Stream.of(decorate).reduce(Function.identity(), Function::andThen);
    }

    public static void main(String[] args) {
        CakeDecorator dec = new CakeDecorator(
                (Cake cake) -> cake.decorate("Vanilj"),
                (Cake cake) -> cake.decorate("nuts")
        );
        Cake baseCake = dec.decorate(new Cake("Base Cake"));
        //System.out.println(baseCake.getDecorations());

        List<List<String>> abdi = List.of(
                List.of("Abdi", "Hassan", "Cali"),
                List.of("Fartuun", "Ciise", "Muse"),
                List.of("Faarah", "Khadro", "Maryan"),
                List.of("Cali", "Wadani", "Cali")
        );
        List<String> collect = abdi.stream().flatMap(Collection::stream).distinct().collect(Collectors.toList());
        Optional<String> any = collect.stream().findAny();
        if (!any.isEmpty()) {
            System.out.println(any.get());
        }else {
            System.out.println("no names");
        }
        String s = collect.stream().filter(a -> a.equals("Mohamed")).findAny().orElse("nobe");
        System.out.println(s);
    }
}
