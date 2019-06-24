package Codechef;

import java.util.*;

public class EatTwice {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            int []tasteList = new int[M+1];

            for (int i = 0; i < N; i++) {

                int day = sc.nextInt();
                int taste = sc.nextInt();

                if(taste>tasteList[day])
                tasteList[day] = taste;

            }

            Arrays.sort(tasteList);

            int score = tasteList[M] + tasteList[M-1];

            System.out.println(score);

            T--;

        }

    }
}
