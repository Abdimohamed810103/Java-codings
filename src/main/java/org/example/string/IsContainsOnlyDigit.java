package org.example.string;

public class IsContainsOnlyDigit {
    public static void main(String[] args) {
        System.out.println(isOnlyDigits2("sdsadsadsa"));
    }

//Best Solution
    public static boolean isOnlyDigits(String str){

        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))){
               return false;
            }

        }
        return true;
    }
    public static boolean isOnlyDigits2(String str){

       return str.chars().anyMatch(c->!Character.isDigit(c));
    }

}
