package org.csystem.sampleapp;

import org.csystem.collection.CsdGenericArrayList;
import org.csystem.util.ArrayUtil;

import java.util.Iterator;

public class App {

    public static void main(String[] args)
    {

        CsdGenericArrayList<String> stringCsdGenericArrayList = new CsdGenericArrayList<>();
        stringCsdGenericArrayList.add("ankara");
        stringCsdGenericArrayList.add("istanbul");

        //Arka planda olan
        Iterator<String> it = stringCsdGenericArrayList.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        //Arka planı boşver bunu for each yapıcak her adımda next'i vericek.
        for(String str : stringCsdGenericArrayList){
            System.out.println(str);
        }
    }

}


