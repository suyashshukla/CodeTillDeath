package Codechef;

import java.util.Scanner;

public class Modulo {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();
            int P = sc.nextInt();

            int max = 0;


            int count = 0;

            for(int i = 2;i<=P;i++){
                for(int j = 2;j<=P;j++){
                    for(int k =2;k<=P;k++){

                        int score = (((((N%i)%j))%k)%N);

                        if(score>=max)
                            max = score;

                    }
                }
            }

            for(int i = 2;i<=P;i++){
                for(int j = 2;j<=P;j++){
                    for(int k =2;k<=P;k++){

                        int score = (((((N%i)%j))%k)%N);

                        if(score==max)
                            count++;

                    }
                }
            }

            System.out.println(count);
            T--;


        }


    }
}
