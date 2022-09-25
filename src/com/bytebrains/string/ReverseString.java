package com.bytebrains.string;

/**
 * User : Kalidas Daundkar
 * Description : Reverse a String
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "Kalidas";
        System.out.println(reverseString(str));
    }
    public static String reverseString(String s1){
        char [] ch=s1.toCharArray();
        System.out.println(ch.length);
        char temp;
        for (int i = 0, j = ch.length-1; i <= s1.length() / 2; i++, j--) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        return new String(ch);
    }
}
