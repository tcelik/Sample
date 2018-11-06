package org.csystem.sampleapp;

import java.util.ArrayList;

public class App {

    public static void main(String[] args)
    {
        //Dinamik olmayan ama herşeyi tutabilen genel bir object dizisi
        Object [] elems = new Object[10];

        for (int i = 0; i < 5; i++) {
            elems[i] = String.valueOf("ankara");
        }

        for (int i = 5; i < 10; i++) {
            elems[i] = Integer.valueOf(i);
        }

        for (int i = 0; i < elems.length; i++) {
            System.out.println(elems[i]);
        }


        //...atamamassın
        //elems[10] = "istanbul";

        //...napman lazım
        Object [] temp = new Object[20];

        //kopyalama yapma ihtiyacı, yani bir ihtiyacım var ben eklim o kendi arka planda kopyalamadır o ilgilensin bu bilgiler benden abstract olsun, gereksiz bilgi vermesin
        for (int i = 0; i < elems.length; ++i) {
            temp[i] = elems[i];
        }

        //temp[10] = "istanbul";
        elems = temp; //copy
        elems[10] = "istanbul";

        for (int i = 0; i < elems.length; ++i) {
            System.out.println(elems[i]);
        }


    }
}
