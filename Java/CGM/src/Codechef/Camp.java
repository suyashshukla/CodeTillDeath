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

            for(int i = 0;i<D;i++){
                d[i] = sc.nextInt();
                p[i] = sc.nextInt();

                if(i!=0)
                    p[i] = p[i] + p[i-1];
            }

            int Q = sc.nextInt();

            int dQ[] = new int[Q];
            int pQ[] = new int[Q];

            for(int i = 0;i<Q;i++){
                dQ[i] = sc.nextInt();
                pQ[i] = sc.nextInt();

                int problem = 0;

                for(int j = 0;j<D;j++){
                if(d[j]>=dQ[i]) {
                    if(d[j]>dQ[i])
                        problem = j!=0?p[j-1]:0;
                    else
                        problem = p[j];

                    break;
                }

                else if(d[j] < dQ[i]){
                    if(j+1 == D)
                        problem = p[j];
                }
                }

                if(problem>=pQ[i])
                    System.out.println("Go Camp");
                else
                    System.out.println("Go Sleep");
            }

T--;
        }
    }
}
