package org.csystem.sampleapp;

import static org.csystem.util.StringUtil.*;


public class App {

    public static void main(String[] args)
    {
        String str = "KİM O KOMİK??";

        //Whitespace silelim
        str = removeWS(str);

        //Remove harf olmayanları
        str = removeNotLetter(str);

        System.out.println(isPalindrome(str));

        //uzun hali
        System.out.println(isPalindrome(removeNotLetter(removeWS(str))));

        //import staticli hali daha şık

    }
}
