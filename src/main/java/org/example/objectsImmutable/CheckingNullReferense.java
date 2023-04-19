package org.example.objectsImmutable;

import java.util.List;
import java.util.Objects;

public class CheckingNullReferense {
    public static void main(String[] args) {
        System.out.println(isNullReference(List.of(1, 2, 3, null, 5, 6, 7, 8)));
    }
    public  static int isNullReference(List<Integer> integers){
        if (integers == null) {
            throw new NullPointerException("Empty List");
        }
        if (Objects.isNull(integers)) {
            throw new NullPointerException("Empty List");
        }
        return  integers.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).sum();
    }
}
