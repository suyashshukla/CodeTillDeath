package ICPC;

import java.util.Arrays;
import java.util.Scanner;

public class Reduction {

    public static void min(int arr[]){



    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            int N = sc.nextInt();
            int K = sc.nextInt();

            int arr[] = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);


            int sum = 0;

            for (int i = 0; i < N - 1; i++) {
                if (arr[i] > K) {
                    int diff = arr[i] - K;
                    arr[i] = K;
                    arr[i + 1] = arr[i+1] - diff;
                }
            }

            for (int i = 0; i < N; i++) {
                sum = sum + arr[i];
            }

            System.out.println(sum);

            T--;
        }


    }
}
