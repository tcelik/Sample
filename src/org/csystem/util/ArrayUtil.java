package org.csystem.util;

public class ArrayUtil{

    //primitive int dizisini display
    public static void display(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
    }
    //primitive double dizisini display
    public static void display(double [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
    }

    //print any array type - generic method bildirimi ve impl.
    public static <E> void display(E [] e)
    {
        for (int i = 0; i < e.length; ++i)
            System.out.print(e[i] + " ");
    }

    //print any array type - generic method bildirimi ve impl. - diziler iterable.
    public static <E> void display_(E [] e)
    {
        for (E elem : e)
            System.out.print(elem + " ");
    }


}
