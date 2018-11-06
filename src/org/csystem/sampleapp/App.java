package org.csystem.sampleapp;

import java.util.ArrayList;

import static org.csystem.util.StringUtil.*;


public class App {

    public static void main(String[] args)
    {
        ArrayList<String> palindromeList = new ArrayList<>();
        palindromeList.add("Kim O KOMİK?");
        palindromeList.add("AÇ RIFAT’A FIRÇA");
        palindromeList.add("NALAN ABLA, KETEN ETEK AL BANA LAN");
        palindromeList.add("NE? MENEMEN!");
        palindromeList.add("YOKSA...AS, KOY");
        palindromeList.add("Tabiki değil");

        String fmt = "Str:%s - isPalindrome:%b%n";
        for (String str : palindromeList)
            System.out.printf(fmt, str, isPalindrome(removeNotLetter(removeWS(str))));

    }
}
