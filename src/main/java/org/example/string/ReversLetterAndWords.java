package org.example.string;

public class ReversLetterAndWords {
    public static void main(String[] args) {
        System.out.println(reverseWords2("Somlia Waa wadan fiican"));
    }
    public static String reverseWords(String str){
        String[] splitedStringArray = str.split(" ");
        StringBuilder st = new StringBuilder();
        for (String word: splitedStringArray) {
            StringBuilder wordSt = new StringBuilder();
            for (int i = word.length()-1; i >= 0 ; i--) {
                char c = word.charAt(i);
                wordSt.append(c);
            }
            st.append(wordSt).append(" ");
        }
        return st.toString();
    }

    public static String reverseWords2(String str){
       return new StringBuilder(str).reverse().toString();
    }
}
