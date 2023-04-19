package org.example.DecoraterPattern;

import java.util.function.Function;

public class Main {
    private static  void  func (int value, Function<Integer,Integer> function){
        System.out.println(function.apply(value));
           }
    public static void main(String[] args) {
        Function<Integer,Integer> inc = e->e+2;
        Function<Integer,Integer> doubleIt = e->2*e;
        func(5,inc);
        func(5,doubleIt);
        func(5,inc.andThen(doubleIt));

       Cake nuts = new Nuts(new CakeDecorater(new BaseCake()));
        System.out.println(nuts.decorate());

    }
}
