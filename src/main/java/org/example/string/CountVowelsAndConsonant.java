package org.example.string;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountVowelsAndConsonant {

    public static void main(String[] args) {
        Pair<Integer, Integer> integerIntegerPair = countVowelsAndConsonants("Afrfika oo ka timid wadan fiican ee somalia");
        System.out.println("Vowels " + integerIntegerPair.getKey());
        System.out.println("Cons " + integerIntegerPair.getValue());
    }

    public  static Pair<Integer,Integer> countVowelsAndConsonants(String str){
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'u', 'o'));
        String s = str.toLowerCase();
        int vow =0;
        int cons =0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)){
                vow ++;
            }else if(c>='a' && c<='z') {
                cons++;
            }
        }
        return new Pair<Integer,Integer>(vow,cons);

    }
}
