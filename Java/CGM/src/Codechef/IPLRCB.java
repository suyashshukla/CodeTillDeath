package Codechef;

import java.util.Scanner;

public class IPLRCB {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int X = sc.nextInt();
            int Y = sc.nextInt();


            for(int i=0;i<=Y;i++) {

                int w = 2 * i;
                int t = Y - i;

                if ((w + t) >= X) {
                    System.out.println(i);
                    break;
                }
            }


            T--;
        }


    }
}
