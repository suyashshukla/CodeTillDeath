package Codejam;


import java.io.*;
import java.math.BigInteger;

class FourFury{

public static void main(String args[]) throws IOException{

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        int c = 1;

        while(T!=0){

        String N = br.readLine();
        BigInteger num = new BigInteger(N);

        String N2 = N.replace("4","3");
        BigInteger num2 = new BigInteger(N2);

        BigInteger num3 = num.subtract(num2);

        System.out.println("Case #"+c+++": "+num2+" "+num3);


        T--;
        }
        }
        }






