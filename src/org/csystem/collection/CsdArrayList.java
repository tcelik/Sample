package org.csystem.collection;


public class CsdArrayList {
    private static final int DEFAULT_CAPACİTY = 10;
    private Object [] m_elems;
    private int m_index = 0;

    private void allocateCapacity(int capacity)
    {
        Object [] temp = new Object[capacity];

        for (int i = 0; i < m_elems.length; ++i)
            temp[i] = m_elems[i];

        m_elems = temp;
    }

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

    //Ver bana bir nesne onu listeye(diziye) eklemek
    public void add(Object elem)
    {


        //10'luk bir dizi üzerinden düşünmek, index = 9 iken eklenebilir ama index = 10(length) olduğunda eklenmemesi gerekir.
        if (m_index == m_elems.length) {
            allocateCapacity(m_elems.length * 2);
        }

        m_elems[m_index++] = elem;

    }



    public int size()
    {
        return m_index;
    }

}
