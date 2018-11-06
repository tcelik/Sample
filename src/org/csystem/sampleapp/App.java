package org.csystem.sampleapp;

import org.csystem.collection.CsdArrayList;

import java.util.ArrayList;

public class App {

    public static void main(String[] args)
    {
        CsdArrayList cityList = new CsdArrayList();
        cityList.add("ankara");
        cityList.add("istanbul");

        CsdArrayList numberList = new CsdArrayList();
        numberList.add(6);
        numberList.add(34);

        CsdArrayList generalList = new CsdArrayList();
        generalList.add(cityList);
        generalList.add(numberList);

        for (int i = 0; i < generalList.size(); ++i) {
            CsdArrayList clist = (CsdArrayList) generalList.get(i);

            for (int k = 0; k < clist.size(); ++k)
                System.out.println(clist.get(k));

        }



    }
}
