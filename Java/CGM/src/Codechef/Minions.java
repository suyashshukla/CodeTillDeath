package Codechef;

import java.util.Scanner;

public class Minions {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int count = 0;

            int N = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0;i<N;i++){

                int num = sc.nextInt();

                if((num+K)%7==0)
                    count++;

            }

            System.out.println(count);
            T--;
        }

    }
}
