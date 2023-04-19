package org.example.reflectionClasses;

import javafx.util.Pair;

import java.io.File;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaRefelctions {

    public static void main(String[] args) throws ClassNotFoundException {
        Integer integer = Integer.parseInt("30");
        Class aClass = integer.getClass();
        Package aPackage = aClass.getPackage();
        String name = aPackage.getName();
        System.out.println(name);
        List<String> collect = Arrays.stream(Package.getPackages()).map(Package::getName).collect(Collectors.toList());
        collect.forEach(s -> System.out.println(s));
        File file = new File(".");
        Package aPackage1 = file.getClass().getPackage();
        String name1 = aPackage1.getName();
        System.out.println(name1);

        Pair pair = new Pair(1, 1);
        Class<? extends Pair> aClass1 = pair.getClass();
        Package aPackage2 = aClass1.getPackage();
        String name2 = aPackage2.getName();
        int modifiers = aClass1.getModifiers();
        boolean aFinal = Modifier.isFinal(modifiers);
        System.out.println(aFinal);

    }
}
