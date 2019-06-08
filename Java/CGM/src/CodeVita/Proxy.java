package CodeVita;

import java.util.Arrays;
import java.util.Scanner;

public class Proxy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            int D = sc.nextInt();

            String stream = sc.next();

            char[] ch = stream.toCharArray();

            Arrays.sort(ch);

            String str = new String(ch);

            int divider = str.indexOf('P');

            String present;

            if(divider>=0)
            present = str.substring(divider);
            else
                present = "";

            int real = present.length();

            int pre = real;

            int threshold = (int) Math.ceil(0.75 * D);

            int index = 2;

            while (pre < threshold && index < D - 2) {

                if (stream.charAt(index) == 'A') {
                    if (stream.charAt(index - 1) == 'P' || stream.charAt(index - 2) == 'P') {
                        if (stream.charAt(index + 1) == 'P' || stream.charAt(index + 2) == 'P') {
                            pre++;
                        }
                    }
                }
                index++;
            }

            if (pre == threshold)
                System.out.println(threshold - real);
            else if(pre>threshold)
                System.out.println(0);
            else
                System.out.println(-1);
            T = T - 1;
        }

    }

}
