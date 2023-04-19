package org.example.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingDublicates {
    public static void main(String[] args) {
        //System.out.println(getDublicates("Somaliawaawadanfiican"));
        //System.out.println(getDublicates1("Somaliawaawadanfiican"));
        System.out.println(getDublicates2());

    }
    public static Map<Character,Integer> getDublicates(String str){
        Map<Character, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            integerMap.compute(c,(character, integer) -> (integer == null) ? 1 : ++integer );
        }
        return integerMap;
    }

    public static Map<Character,Long> getDublicates1(String str){
        Map<Character, Long> result = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
    public static Map<Integer, Long> getDublicates2(){
      Student student1 = new Student("Abdi Mohamed", 25,"Year 6", List.of(78,45,65,89,12,10) );
      Student student2 = new Student("Ibrahim Mudan", 25,"Year 16", List.of(8,5,5,9,2,10) );
      Student student3 = new Student("Farhan abdi", 55,"Komvux 16", List.of(81,51,51,91,21,10) );
      List<Student> studentList = new ArrayList<>();
      studentList.add(student1);
      studentList.add(student2);
      studentList.add(student3);
      Map<Integer, List<Student>> studentByAge = studentList.stream().collect(Collectors.groupingBy(c -> c.getAge(), Collectors.toList()));
      Map<Integer, Long> studentByAge2 = studentList.stream().collect(Collectors.groupingBy(c -> c.getAge(), Collectors.counting()));
      return studentByAge2;

    }
}