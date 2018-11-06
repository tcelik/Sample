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
}
