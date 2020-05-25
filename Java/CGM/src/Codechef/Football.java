package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class Football {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        while (T != 0) {

            int N = sc.nextInt();

            int []goals = new int[N];
            int []foul = new int[N];
            int []score = new int[N];

            for (int i = 0; i < N; i++) {
                goals[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                foul[i] = sc.nextInt();
            }

            for(int i = 0;i<N;i++){
                score[i] = goals[i]*20 - foul[i]*10;
            }

            Arrays.sort(score);

            System.out.println(score[N-1]>=0?score[N-1]:0);

            T--;
        }

    }

}
