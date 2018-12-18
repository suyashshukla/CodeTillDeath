package Snackdown;

import java.util.Arrays;
import java.util.Scanner;

public class Elimination {

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

            int item = arr[N - K];
            int out = 0;

            for (int i = 0; i < N; i++) {

                if (arr[i] >= item)
                    out++;

            }

            System.out.println(out);
            T--;
        }
    }
}


