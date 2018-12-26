package Codechef;

import javax.print.DocFlavor;
import java.math.BigInteger;
import java.util.Scanner;

public class Yalavochik {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        while (T != 0) {

            String N = sc.next();

            int d = N.length();

            String yala = "";

            int start = 0;


            for (int i = 0; i < d; i++) {

                String shift = N.substring(start);

                shift = shift.concat(N.substring(0, start));

                yala = yala.concat(shift);

                yala = new BigInteger(yala).mod(BigInteger.valueOf(1000000007)).toString();

                start++;
            }


            System.out.println(yala);

            T--;

        }
    }
}
