package org.csystem.sampleapp;

import org.csystem.collection.CsdArrayList;

import java.util.ArrayList;

import static org.csystem.util.StringUtil.*;


public class App {

    public static void main(String[] args)
    {
        CsdArrayList palindromeList = new CsdArrayList();
        palindromeList.add("Kim O KOMİK?");
        palindromeList.add("AÇ RIFAT’A FIRÇA");
        palindromeList.add("NALAN ABLA, KETEN ETEK AL BANA LAN");
        palindromeList.add("NE? MENEMEN!");
        palindromeList.add("YOKSA...AS, KOY");
        palindromeList.add("Tabiki değil");

        String fmt = "Str:%s - isPalindrome:%b%n";

        //iterable değil.
        for (int i = 0; i < palindromeList.size(); ++i) {
            String str = (String) palindromeList.get(i);
            System.out.printf(fmt, str, isPalindrome(removeNotLetter(removeWS(str))));
        }


    }
}
