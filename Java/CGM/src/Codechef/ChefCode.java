package Codechef;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ChefCode {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long K = sc.nextLong();

        long arr[] = new long[N];

        for(int i = 0 ;i<N;i++){
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        BigInteger product = BigInteger.ONE;
        long count = 0;

        int size = (int)Math.pow(2,N)-1;

        for(int i = 1;i<=size;i++){
            for(int j = 0;j<N;j++){
                if(BigInteger.valueOf(i).testBit(j))
                    product = product.multiply(BigInteger.valueOf(arr[j]));
            }

            if(product.compareTo(BigInteger.valueOf(K))<=0) {
             count++;
            }
            product = BigInteger.ONE;
        }

        System.out.println(count);

    }

}

