package Snackdown;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;


public class Word {

    public static void main(String args[]) throws IOException {


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int T = Integer.parseInt(br.readLine().trim());

            long arr[]; long ans[];
            String str[];

            while (T > 0) {

               int N = Integer.parseInt(br.readLine().trim());

                arr = new long[N];
                ans = new long[N];

               String a = br.readLine();

               str = a.split(" ");

                for (int i = 0; i < N; i++) {
                    arr[i] = Integer.valueOf(str[i]);//(int)(Math.random()*100000);
                }

                int count = 0;
                long sum = 0;

                for (int i = 0; i < N; i++) {
                    sum = sum + arr[i];
                    ans[i] = sum;
                }

                long x = 0;
                int end = N - 1;

                while (x < end) {


                    x = x + ans[(int) x];

                    count++;

                }

                System.out.println(count);

                T--;


            }

        }

        }





