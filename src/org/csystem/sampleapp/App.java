package org.csystem.sampleapp;

import org.csystem.util.StringUtil;

public class App {

    public static void main(String[] args)
    {
        //Auto-boxing (otomatik kutulama - otomatik kutuladı - nesne yarattı bana verdi - primtiveden nesne)
        Character c1 = 'A';

        //KUTULAMA - BOXİNG
        c1 = new Character('A'); //Java 9 öncesi, nesne yarat.
        c1 = Character.valueOf('A');   //Java 9 ve sonrası, Character adresi dönecek ve set edecek private char m_elem = <your char>;

        //OTOMATİK KUTULAMA - AUTO BOXİNG
        Integer i1 = 2;
        Double d1 = 1.0;

        //UNBOXİNG
        Character chA = 'A';
        Character chB = 'B';

        //AUTO UNBOXİNG, charValue çağırıyor nasıl toString çağırıyorsa. Ara koda o bilgiyle yazılıyor.
        char cha = chA;
        char chb = chB;

    }
}
