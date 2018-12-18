package Codechef;

import java.util.Scanner;

public class Coins {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();


        int check = 1;
        int y = 1;

            int MP = (N) / 2;

            MP = MP>0?MP:1;

            System.out.println(check + " " + MP);
            int ans = sc.nextInt();

            if (ans == 1) {
                while (ans != 0 && MP != 1) {
                    MP = MP / 2;
                    y = MP;
                    System.out.println("2");
                    System.out.println(check + " " + MP);
                    ans = sc.nextInt();
                }
                while (ans != 1) {
                    System.out.println(check + " " + ++y);
                    ans = sc.nextInt();
                }
            }

            else if (ans == 0) {

                while (ans != 1 && MP != N) {
                    y = MP;
                    MP = (MP + N + 1) / 2;
                    System.out.println(check + " " + MP);
                    ans = sc.nextInt();
                }

                if(y!=N) {
                    ans = 0;
                    System.out.println("2");
                }

                while (ans != 1) {
                    System.out.println(check + " " + ++y);
                    ans = sc.nextInt();
                }

            }



            if (ans == 1)
                System.out.println("2");

            System.out.println("3 " + y);

    }
}
