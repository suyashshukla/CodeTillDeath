package com.company;

public class Merged {


    public String mergeString(String a, String b) {

        int al = a.length();
        int bl = b.length();


        int count = 0;

        int ac = 0;
        int bc = 0;

        String merged = "";

        while (ac != al && bc != bl) {

            if (count % 2 == 0)
                merged = merged + a.charAt(ac++);
            else
                merged = merged + b.charAt(bc++);

            count++;

        }

        if (ac == al) {
            for (int i = bc; i < bl; i++) {
                merged = merged + b.charAt(i);
            }
        } else if (bc == bl) {
            for (int i = ac; i < al; i++) {
                merged = merged + a.charAt(i);
            }
        }

        return merged;
    }


    public static void main(String args[]) {

        Merged m = new Merged();

        System.out.println(m.mergeString("abc", "stuvwx"));
    }
}


