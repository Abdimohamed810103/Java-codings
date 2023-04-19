package org.example.string;

import java.util.Arrays;

public class JoiningStringWithDelimiter {
    public static void main(String[] args) {
        String[] striA = {"Mohamed", "Hassan", "abdi"};
        System.out.println(joinStringWithDelimiter(',', striA));
    }

    public static String joinStringWithDelimiter(char c, String...args){
      StringBuilder st = new StringBuilder();
      int i =0;
        for (i = 0; i < args.length-1; i++) {
            st.append(args[i]).append(c);
        }
        st.append(args[i]);
        return st.toString();
    }
}
