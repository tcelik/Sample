package org.csystem.app;

import java.util.ArrayList;

public class App {

    public static void main(String[] args)
    {
        //Her bir elemanı string türünde olan bir liste
        ArrayList<String> cityList = new ArrayList();
        cityList.add("ankara");
        cityList.add("istanbul");

        //Her bir elemanı string türünde olan bir liste
        ArrayList<String> animalList = new ArrayList();
        cityList.add("kedi");
        cityList.add("kopek");

        //Her bir elemanı liste olan bir liste
        ArrayList<ArrayList<String>> generalList = new ArrayList();
        generalList.add(cityList);
        generalList.add(animalList);

        //Önce her bir liste elemanını alıyorum
        for (ArrayList<String> l : generalList) {
            //Her bir elemanı string türünde olan bir liste
            for (String str : l)
                System.out.println(str);
        }
    }
}
