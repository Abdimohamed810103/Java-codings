package org.example.DecoraterPattern;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

class Samples {
    private Function<Color, Color> filter;
    public Samples(Function<Color, Color>... filters) {
        setfilter(filters);
    }
    public void setfilter(Function<Color, Color>... filters) {
        filter = Stream.of(filters).
                reduce(
                        Function.identity(),
                        Function::andThen
                );
    }
    public Color snap(Color input) {
        return filter.apply(input);
    }
}

public class Camera {
    public static void printColor(Samples sample) {
        System.out.println(sample.snap(new Color(125, 125, 125)));
    }

    public static void main(String[] args) {
        printColor(new Samples());
        printColor(new Samples(Color::brighter));
    }
}
