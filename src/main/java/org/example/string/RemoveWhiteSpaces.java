package org.example.string;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Abdi Waa nin fiican";

        System.out.println(str.replaceAll("\\s", ""));
    }
}
