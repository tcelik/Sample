package org.csystem.sampleapp;

public class App {

    public static void main(String[] args)
    {
        //İfade: Değişkenlerin, operatörlerin, sabitlerin, ayraçların oluşturduğu birliktelik
        int a;
        a = 5;
        System.out.println("<ifade>");
        System.out.println(a = 10);

        //...
        a = foo(1) + 3;

        foo(foo(1) + 3);

        //foo(<a ya atanacak ifade bekliyor>)

        int c = 0;
        int d = c = 5, b = 10;
        System.out.println(d);

    }

    public static int foo(int a) {return 1;}
}
