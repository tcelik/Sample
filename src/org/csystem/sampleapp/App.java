package org.csystem.sampleapp;

import org.csystem.collection.CsdGenericArrayList;

public class App {

    public static void main(String[] args)
    {
        CsdGenericArrayList<String> stringCsdGenericArrayList = new CsdGenericArrayList<>();
        stringCsdGenericArrayList.add("ankara");
        stringCsdGenericArrayList.add("istanbul");


        //Doğrudan atama yapabildim. Object dönmedi E döndü yani String döndü.
        String str = stringCsdGenericArrayList.get(0);

        for (int i = 0; i < stringCsdGenericArrayList.size(); ++i)
            System.out.println(stringCsdGenericArrayList.get(i));
    }
}


