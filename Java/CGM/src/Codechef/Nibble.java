package Codechef;

import java.util.Scanner;

class Nibble {


    public static void main(String args[]){

        int T;

        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        long a,b,c;
        long v;
        int t;


        while(T!=0) {

            int N = sc.nextInt();

            N = N-1;

            a=0;b=0;c=0;

            int pow = N/26;

            if(N>=26) {
                v = (long)Math.pow(2,pow);
                t = N % 26;
            }
            else {
                v = 1;
                t = N;
            }


            if (t >= 2 && t < 10)
                b = v;
            else if (t >= 10)
                c = v;
            else
                a = v;


            System.out.println(a+" "+b+" "+c);

            T--;
        }











    }





}
