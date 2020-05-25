package Codechef;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Apples {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            long n = sc.nextLong();
            long k = sc.nextLong();

            BigDecimal N = BigDecimal.valueOf(n);
            BigDecimal K = BigDecimal.valueOf(k);

            BigDecimal applesFirst = N.divide(K);

            BigDecimal applesSecond = K.multiply(N.divide(K.pow(2), RoundingMode.CEILING));


            if(applesFirst.equals(applesSecond))
                System.out.println("NO");
            else
                System.out.println("YES");

            T--;

        }

    }


}
