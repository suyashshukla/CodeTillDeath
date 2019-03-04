package Codechef;

import java.util.Scanner;

public class Bathwater {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        while (T != 0) {


            long v1 = sc.nextLong();
            long t1 = sc.nextLong();
            long v2 = sc.nextLong();
            long t2 = sc.nextLong();
            long v3 = sc.nextLong();
            long t3 = sc.nextLong();

            long tx = (((v1 * t1) + (v2 * t2)) / (v1 + v2));
            long vx = v1 + v2;

            String ans = "";

            if (t1 == t3) {
                if (v1 >= v3) {
                    ans = "YES";
                }
            } else if (t2 == t3) {
                if (v2 >= v3) {
                    ans = "YES";
                }
            } else if (tx == t3) {

                if (vx >= v3) {
                    ans = "YES";
                }
            }
            else
                    ans = "NO";


            System.out.println(ans);

                T--;

        }


    }
}
