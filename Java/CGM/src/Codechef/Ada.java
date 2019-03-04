package Codechef;

import java.util.Scanner;

public class Ada {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            int K = sc.nextInt();

            int moves = 9;

            if (R == 1 || R == 8) {
                moves -= 3;
                if (C == 1 || C == 8)
                    moves += 1;
            }

            if (C == 1 || C == 8) {
                moves -= 3;
                if (R == 1 || R == 8)
                    moves += 1;
                }

                System.out.println(moves);

                T--;
        }


    }
}
