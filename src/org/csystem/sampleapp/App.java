package org.csystem.sampleapp;

public class App {

    public static void main(String[] args)
    {
        //Babadan kalma meşhur dizimiz ve ekrana basılması
        int [] a = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int size = 10;
        for (int i = 0; i < size; ++i)
            System.out.print(a[i] + " ");

        System.out.println();
        //...
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");


    }
}
