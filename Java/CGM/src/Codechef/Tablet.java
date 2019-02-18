package Codechef;

import java.util.Scanner;

public class Tablet {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();
            int B = sc.nextInt();

            int max = -1;

            for(int i = 0;i<N;i++){

                int W = sc.nextInt();
                int H = sc.nextInt();
                int P = sc.nextInt();


                int area = W*H;

                if(P<=B){

                    if(area>max)
                        max = area;

                }

            }

            if(max==-1)
                System.out.println("no tablet");
            else
                System.out.println(max);


            T--;
        }

    }

}
