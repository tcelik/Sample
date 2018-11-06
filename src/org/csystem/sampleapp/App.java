package org.csystem.sampleapp;

public class App {

    public static void main(String[] args)
    {
        //Babadan kalma meşhur dizimiz ve ekrana basılması
        int [] a = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int asize = 10;

        int [] b = new int[asize];
        int bsize = 10;

        //çift olanları b dizisine alalım
        int index = 0;
        for (int i = 0; i < asize; ++i)
            if (a[i] % 2 == 0)
                b[index++] = a[i];

        //...
        for (int i = 0; i < b.length; ++i)
            System.out.print(b[i] + " ");

    }
}
