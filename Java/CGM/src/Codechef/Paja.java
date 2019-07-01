package Codechef;

import java.util.Scanner;

public class Paja {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();


            int points = X + Y;

            int service = points / K;

            if (service % 2 == 0) {
                System.out.println("Chef");
            } else
                System.out.println("Paja");

            T--;
        }


    }
}
