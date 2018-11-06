package org.csystem.sampleapp;

import org.csystem.collection.CsdArrayList;

import java.util.ArrayList;

public class App {

    public static void main(String[] args)
    {
        //10 kapasiteli bir dizi aslında
        CsdArrayList list1 = new CsdArrayList();

        //init kapasiteli bir dizi aslında
        CsdArrayList list2 = new CsdArrayList(20);

        //init kapasiteli bir dizi aslında
        //CsdArrayList list3 = new CsdArrayList(-1); process finished


        //Aşağıdan yukarıya doğrudan atama yapılabilir. "String extends Object"
        Object o = "string atayabilirim."; // o = (Object) new String("string atayabilirim");, implicit casting.

        //Yukarıdan aşağıda doğrudan atama yok, isternirse casting,static türü Object(o nesnesinin)
        //String str =  o;


        o = 2; //o'nun gösterdiği yeri new Integer(2), Integer.valueof(2) ile değiştirdim
        //class cast exception mantığı, sen explicit olarak cast ettin.
        try {
            String str = ((String) o);
            System.out.println(str); //burası atlanıcak

        }
        catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }

        String str = ((String) o);

        //o.toString(), aslında eğer varsa dinamik türün(new String) toString çağrılır.
        System.out.println(o);

        //list1.add(<something1 nesne - Herhangi bir sınıf nesnesi olabilir, s extends Object aslında>);
        //list1.add(<something2 nesne - string eklersem new String gibi>);
        //list1.add("something3 nesne - int eklersem oto boxing yapacak");
    }
}
