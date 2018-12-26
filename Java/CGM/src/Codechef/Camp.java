package Codechef;

import java.util.Scanner;

public class Camp {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int D = sc.nextInt();

            int d[] = new int[D];
            int p[] = new int[D];


            int days[] = new int[32];

            for(int i = 0;i<D;i++){
                d[i] = sc.nextInt();
                p[i] = sc.nextInt();

                if(i!=0)
                    p[i] = p[i] + p[i-1];

                days[d[i]] = p[i];
            }

            int score = 0;

            for(int i= 0 ;i<32;i++){
                if(days[i] == 0)
                    days[i] = score;
                else
                    score = days[i];
            }


            int Q = sc.nextInt();

            int dQ,pQ;

            for(int i = 0;i<Q;i++){
                dQ = sc.nextInt();
                pQ = sc.nextInt();

                int problem = days[dQ];

                if(problem>=pQ)
                    System.out.println("Go Camp");
                else
                    System.out.println("Go Sleep");
            }

T--;
        }
    }
}
