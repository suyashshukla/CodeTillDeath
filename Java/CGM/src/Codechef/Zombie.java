package Codechef;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Zombie {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){


            int N = sc.nextInt();

            int []caves = new int[N];
            int []zombies = new int[N];
            int []power = new int[N];

            for(int i = 0;i<N;i++){
                caves[i] = sc.nextInt();
            }

            for(int j = 0;j<N;j++){
                zombies[j] = sc.nextInt();
            }

            for(int i = 0;i<N;i++){

                int start = i - caves[i];
                int end = i + caves[i];

                start = start>=0?start:0;
                end = end<N?end:N-1;

                for(int j = start;j<=end;j++){
                    power[j]++;
                }

            }

            Arrays.sort(zombies);
            Arrays.sort(power);

            if(Arrays.equals(zombies,power))
                System.out.println("YES");
            else
                System.out.println("NO");

            T--;
        }

    }

}
