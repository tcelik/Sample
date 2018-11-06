package org.csystem.collection;
// 1. Derleyici kontrol etsin E türünden girilmesse hata versin.
// 2. Bana object türünden vermesin, E türünden versin. Casting yapmak zorunda kalmim.

public class CsdGenericArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E [] m_elems;
    private int m_index;

    private void allocateCapacity(int capacity)
    {
        //burası değişik object dizisi alınıyormuş.
        E [] temp = (E[]) new Object[capacity];

        int index = 0;
        for (E elem : m_elems)
            temp[index++] = elem;
        m_elems = temp;
    }

    public CsdGenericArrayList()
    {
        this(DEFAULT_CAPACITY);
    }

    public CsdGenericArrayList(int initialCapacity)
    {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("invalid initialCapacity value");
        m_elems = (E []) new Object[initialCapacity == 0 ? DEFAULT_CAPACITY : initialCapacity];

    }

    public boolean add(E elem)
    {
        if (m_index == m_elems.length)
            allocateCapacity(m_elems.length * 2 );
        m_elems[m_index++] = elem;

        return true;
    }

    public E get(int index)
    {
        //...eşit olduğu yerde data yok henüz o mantık var.
        if (index < 0 || index >= m_index)
            throw new IndexOutOfBoundsException("index out of bounds");

        return  m_elems[index];
    }

    public int size()
    {
        return m_index;
    }





}
