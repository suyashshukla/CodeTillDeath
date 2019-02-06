package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Appy {

    public long gcd(long a,long b){
        if(a==0)
            return b;

        return gcd(b%a,a);

    }

    public static void main(String args[])throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T!=0){

            System.out.println("hello");
        }



        while(T!=0){

            String input = br.readLine();

            String arr[] = input.split(" ");

            long N = Long.parseLong(arr[0]);

            long A = Long.parseLong(arr[1]);

            long B = Long.parseLong(arr[2]);

            long K = Long.parseLong(arr[3]);

            long count;

            long app = N/A;
            long chef = N/B;
            long diff;

            long min = A>=B?B:A;
            long hcf;
            long lcm;


            hcf = new Appy().gcd(A,B);


            lcm = (A*B)/hcf;

            diff = N/lcm;

            count = (app + chef) - (2*diff);

            if(count>=K)
                System.out.println("Win");
            else
                System.out.println("Lose");

            T--;
        }
    }
}
