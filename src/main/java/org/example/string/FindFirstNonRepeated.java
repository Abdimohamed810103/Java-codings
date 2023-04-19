package org.example.string;

import java.util.LinkedHashMap;
import java.util.Map;




public class FindFirstNonRepeated {
    public static void main(String[] args) {
        System.out.println(chars("manalagraadbaa mise waa nin kale"));
    }
    public static char chars (String str){
        Map<Character, Integer> chars = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            chars.compute(c, (k,v)->(v==null) ? 1 :++v);
        }
        for (Map.Entry<Character,Integer> entry:chars.entrySet()) {
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }
}
