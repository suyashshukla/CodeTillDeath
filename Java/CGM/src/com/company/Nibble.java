package com.company;

import java.util.Scanner;

class Nibble {


    public static void main(String args[]){

        int T;

        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        int a=0,b=0,c=0;
        int v;
        int t;


        while(T!=0) {

            int N = sc.nextInt();

            a=0;b=0;c=0;

            int pow = N/26;

            if(N>26) {
                v = (int)Math.pow(2,pow);
                t = N % 26;
            }
            else if (N<26) {
                v = 1;
                t = N;
            }
            else {
                v = 1;
                t = 0;
            }

            if (t > 2 && t <= 10)
                b = v;
            else if (t > 10)
                c = v;
            else if(t==0) {
if(N>26)
                a = v / 2;
else
    c = 1;
            }
            else
                a = v;


            System.out.println(a+" "+b+" "+c);

            T--;
        }











    }





}
