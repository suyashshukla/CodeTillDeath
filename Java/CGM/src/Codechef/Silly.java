package Codechef;

import java.util.Scanner;

public class Silly {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            int N = sc.nextInt();

            long sum = 0;
            int odd[] = new int[2];
            int even[] = new int[2];

            for (int i = 0; i <= 1; i++) {
                for (int j = 0; j < N; j++) {
                    int num = sc.nextInt();
                    sum = sum + num;

                    if (num % 2 == 0) {
                        even[i]++;
                    } else
                        odd[i]++;
                }
            }

            sum /= 2;

            int o = Math.abs(odd[0]-odd[1]);
            int e = Math.abs(even[0]-even[1]);

            int deficit = (o+e)/4;

            System.out.println(sum - deficit);

            T--;
        }
    }

}
