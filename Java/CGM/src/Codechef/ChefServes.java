package Codechef;

import java.util.Scanner;

public class ChefServes {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int P1 = sc.nextInt();
            int P2 = sc.nextInt();

        int K = sc.nextInt();

        int points = P1+P2;

        int rem = points/K;

        if(rem%2==0)
            System.out.println("CHEF");
        else
            System.out.println("COOK");

 T--;

        }

    }
}
