package org.csystem.collection;


import java.util.Arrays;

public class CsdArrayList {
    //Data field
    private static final int DEFAULT_CAPACİTY = 10;
    private Object[] m_elems;
    private int m_index = 0;

    //Private area
    private void allocateCapacity(int capacity)
    {
        Object[] temp = new Object[capacity];

        for (int i = 0; i < m_elems.length; ++i)
            temp[i] = m_elems[i];

        m_elems = temp;
    }

    //Başlangıç
    public CsdArrayList()
    {
        this(DEFAULT_CAPACİTY);
    }


    public CsdArrayList(int initialCapacity)
    {
        //...
        if (initialCapacity < 0) {
            System.out.println("IllegalArgumentException");
            System.out.println("Processi sonlandırıyorum");
            System.exit(-1);
        }

        m_elems = new Object[initialCapacity];
    }


    //Public area - ascending order
    public void add(Object elem)
    {

        if (m_index == m_elems.length) {
            allocateCapacity(m_elems.length * 2);
        }

        m_elems[m_index++] = elem;

    }

    public void add(int index, Object obj)
    {
        //TODO:
    }


    public void clear()
    {
        /*
        for (int i = 0; i < m_index; ++i)
            m_elems[i] = null;*/

        //m_elems(dizi) iterable aslında. Diziler iterable
        for (Object o : m_elems)
            o = null;

        //unutma
        m_index = 0; //0 a ekleme yapıcam.
    }

    public int capacity()
    {
        //bu dizinin uzunluğu içerisinde kaç tane eleman tutabileceği bilgisi (capacitysi aslında)
        return m_elems.length;
    }


    //Ver bana bir index o indexteki nesneyi verim.
    public Object get(int index)
    {
        //...
        if (index < 0 || index >= m_index) {
            System.out.println("IndexOutOfBoundsException");
            System.exit(-1); //exception konusu burada olmasın şimdilik.
        }
        return m_elems[index];
    }

    //şu indextekini silmek istiyorum
    public Object remove(int index)
    {
        //TODO:
        return null;
    }

    //şu indextekini şununla değiştirmek değişmişi dönmek
    public Object set(int index, Object obj)
    {
        //TODO:
        return null;
    }

    //Returns the number of elements in this list.(javadoc)
    public int size()
    {
        return m_index;
    }

    public void trimToSize()
    {
        allocateCapacity(m_index == 0 ? DEFAULT_CAPACİTY :m_index);
    }

    //Listenin elemanları arasında virgül koyarak göstermek printMessage
    public String toString()
    {
        String result = "";

        for (int i = 0; i < m_index; ++i) {
            if (!result.isEmpty())
                result += ",";
            result += m_elems[i].toString();
        }

        return "[" + result + "]";
    }

}