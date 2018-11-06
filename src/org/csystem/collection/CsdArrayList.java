package org.csystem.collection;

//Dinamik olarak büyüyen bir dizi
public class CsdArrayList {
    //1.Default kapasite
    private static final int DEFAULT_CAPACİTY = 10;

    //2. Object dizisi alınır
    private Object [] m_elems; //elemanlar bu dizide tutulucak.

    //3. Argüman verilmesse default kapasite 10 olsun
    public CsdArrayList()
    {
        this(DEFAULT_CAPACİTY);
    }

    //4. Argüman verilirse
    public CsdArrayList(int initialCapacity)
    {
        //...
        if (initialCapacity < 0) {
            System.out.println("IllegalArgumentException");
            System.out.println("Processi sonlandırıyorum");
            System.exit(-1);
        }

        //init kadar bir yer ayrılır.
        m_elems = new Object[initialCapacity];
    }

}
