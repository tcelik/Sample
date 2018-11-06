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

    public void add(Object elem)
    {

        if (m_index == m_elems.length) {
            allocateCapacity(m_elems.length * 2);
        }

        m_elems[m_index++] = elem;

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

    //Returns the number of elements in this list.(javadoc)
    public int size()
    {
        return m_index;
    }
}
