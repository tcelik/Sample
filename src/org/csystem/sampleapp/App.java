package org.csystem.sampleapp;

import org.csystem.collection.CsdGenericArrayList;
import org.csystem.util.ArrayUtil;

public class App {

    public static void main(String[] args)
    {

        CsdGenericArrayList<String> stringCsdGenericArrayList = new CsdGenericArrayList<>();
        stringCsdGenericArrayList.add("ankara");
        stringCsdGenericArrayList.add("istanbul");

        for(String str : stringCsdGenericArrayList) {
            System.out.println(str);
        }
    }

}


