package org.csystem.sampleapp;

import org.csystem.collection.CsdArrayList;

import java.util.ArrayList;

public class App {

    public static void main(String[] args)
    {
        //10 capacity bir dizi oluştu.
        CsdArrayList list1 = new CsdArrayList();

        //Dinamik olarak eklendi.
        for (int i = 0; i < 100; ++i)
            list1.add(i);
;

        System.out.println(list1);






    }
}
