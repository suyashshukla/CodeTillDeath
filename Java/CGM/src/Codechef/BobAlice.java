package Codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class BobAlice {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            int N = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            String winner;
            int bob = 0;
            int alice = 0;
            int common = 0;



            for (int i = 0; i < N; i++) {

                int num = sc.nextInt();


                if (num % a == 0 && num % b == 0) {

                    common++;


                } else {

                    if (num % a == 0) {
                        bob++;
                    }
                    if (num % b == 0) {
                        alice++;
                    }
                }
            }

            bob = bob + common;


            if (bob > alice)
                winner = "BOB";
            else if (bob < alice)
                winner = "ALICE";
            else
                winner = "ALICE";

            System.out.println(winner);

            T--;

        }
    }
}
