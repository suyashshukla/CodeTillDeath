package Codechef;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ChefCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long K = sc.nextLong();

        long count = 0;

        ArrayList<Long> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            long num = sc.nextLong();

            if (num <= K)
                arrayList.add(num);

        }

        BigInteger product = BigInteger.ONE;


        int size = ((int) Math.pow(2, arrayList.size()) - 1)/2;

        boolean flag = false;

        for (int i = 1; i <= size; i++) {

            for (int j = 0; j < arrayList.size(); j++) {

                if (BigInteger.valueOf(i).testBit(j)) {
                    product = product.multiply(BigInteger.valueOf(arrayList.get(j)));
                }

                if (product.compareTo(BigInteger.valueOf(K)) > 0) {
                    flag = true;
                    break;
                }

            }

            if (flag) {
                product = BigInteger.ONE;
                flag = false;
                continue;
            }

            if (product.compareTo(BigInteger.valueOf(K)) <= 0) {
                count++;
            }
            product = BigInteger.ONE;
        }

        System.out.println(count);

    }

}

