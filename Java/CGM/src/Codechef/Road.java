package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Road {

    static Map<String,Long> array;

    public static void main(String[] args) throws IOException {

        array = new HashMap<>();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T != 0) {

            int K = Integer.parseInt(br.readLine());

            if(array.get(String.valueOf(K))==null)
            System.out.println((compute(K)*5)%1000000007);
            else
                System.out.println((array.get(String.valueOf(K))*5)%1000000007);

            T--;
        }

    }

    static long compute(int k){

        int half = k/2;
        int rest = k-half;
        long ans;
        long mod = 1000000007;
        if(k==1)
            return 2;
        else {
            if(array.get(String.valueOf(k))==null) {
             ans = ((compute(half)%mod)*(compute(rest)%mod))%mod;
                array.put(String.valueOf(k),ans);
             return (ans);
            }
            else{
                return array.get(String.valueOf(k));
            }

        }

    }

}
