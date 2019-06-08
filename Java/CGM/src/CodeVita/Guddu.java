package CodeVita;

import java.math.BigInteger;
import java.util.Scanner;

public class Guddu {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0) {

            long N = sc.nextLong();

            String num = String.valueOf(N);

            int sum = 0;

            for(int i = 0;i<num.length();i++){

                sum = sum + num.charAt(i)%48;

            }

            int digit = 10-(sum%10);

            digit = digit%10;

            num = num.concat(String.valueOf(digit));


            System.out.println(num);


            T--;
        }
        }
    }

