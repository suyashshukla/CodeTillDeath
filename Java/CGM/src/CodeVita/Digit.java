package CodeVita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Digit {

    public static void main(String []args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            String num = sc.next();

            int d = sc.nextInt();

            String startString = "", endString;

            String original = String.valueOf(Long.parseLong(num));

            int length = original.length();

            int size = 0;

            int smallIndex = 0;
            int inc = 0;

            for (int i = 1; i <= d; i++) {


                while (original.contains(i + "") && size<=length) {

                    startString = startString.concat(i + "");
                    smallIndex = original.indexOf(i + "");

                    size = size + 1;

                    original = original.substring(smallIndex+1);

                }

                inc = original.indexOf((char)(i + 48)) - smallIndex;
                size = size + inc;
            }

            int count = length - startString.length();

            char[] end = new char[count];
            Arrays.fill(end, (char) (d + 48));
            endString = new String(end);

            String intermediate = startString + endString;

            System.out.println(intermediate);

            T--;

        }
    }
}
