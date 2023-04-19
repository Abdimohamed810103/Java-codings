package org.example.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.example.strategy.Remover.checkIflimitIsReached;
import static org.example.strategy.Remover.removeWhiteSpace;

public class Strategy {

    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("volvo", 2015),new Car("volvo", 2012),new Car("volvo", 2017),new Car("volvo", 2022),new Car("volvo", 2012));

        String remove = removeWhiteSpace("abdi23sdsadas56", t -> t.replaceAll("\\d", ""));
        System.out.println(remove);
        Send send = new Send(15000);
        boolean b = checkIflimitIsReached(send, limit -> limit.getTotalAmount() > 14000);
        System.out.println(b);

        List<Car> collect = cars.stream().filter(s -> s.getAge() > 2015).collect(Collectors.toList());
        System.out.println(collect);
    }


}
