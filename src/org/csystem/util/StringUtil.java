package org.csystem.util;

public class StringUtil {











    //ver bana bir str, verim sana tersini methodu
    public static String reverse(String str)
    {
        String result = "";

        for (int i = str.length() - 1; i >= 0; --i)
            result += str.charAt(i);

        return result;
    }

    //aradaki white space silmek [tugberk   sumeyye -> tugberksumeyye]
    public static String removeWS(String str)
    {
        String result = "";

        for (int i = 0; i < str.length(); ++i)
            if(!(str.charAt(i) == ' '))
                result += str.charAt(i);

        return result;
    }

    public static String removeWS_(String str)
    {
        String result = "";

        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);

            if (!Character.isWhitespace(ch))
                result += ch;
        }

        return result;
    }


}
