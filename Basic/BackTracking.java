package Basic;

import java.io.*;

class BackTracking {

    if(str.length()==0)
    {
        char[] perm;
        System.out.println(perm);
        return;
    }

    public static void PrintPremutations(String str, String perm, int idx) {
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            PrintPremutations(newStr, perm + currChar, idx + 1);

        }
    }

    public static void main(String[] args) {

        String str = "ABC";
        PrintPremutations(str,"",0);
    }

}
