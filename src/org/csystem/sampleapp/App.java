package org.csystem.sampleapp;

import org.csystem.collection.CsdGenericArrayList;
import org.csystem.util.ArrayUtil;

public class App {

    public static void main(String[] args)
    {

        //Babadan kalma meşhur dizimiz ve ekrana basılması
        int [] a = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        Double [] b = {4.0, 8.0, 3.0, 1.0, 18.0, 9.0, 21.0, 20.0, 5.0, 17.0};

        ArrayUtil.display(a);
        Util.yildiz();
        ArrayUtil.display_(b);
        Util.yildiz();

        CsdGenericArrayList<String> stringCsdGenericArrayList = new CsdGenericArrayList<>();
        stringCsdGenericArrayList.add("ankara");
        stringCsdGenericArrayList.add("istanbul");


        //Doğrudan atama yapabildim. Object dönmedi E döndü yani String döndü.
        String str = stringCsdGenericArrayList.get(0);

        for (int i = 0; i < stringCsdGenericArrayList.size(); ++i)
            System.out.println(stringCsdGenericArrayList.get(i));
    }
}

class Util {

    //generic method yazalım
  public static <E> void printAnyArray(E [] array)
  {

  }

  public static void yildiz()
  {
      System.out.println("\n*****");
  }




}


