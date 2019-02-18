package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class Party {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

        int N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0;i<N;i++)
            arr[i] = sc.nextInt();

            Arrays.sort(arr);

            int count = 0;

            for(int i = 0;i<N;i++){
            if(arr[i]<=count)
                count = count + 1;
            }

            System.out.println(count);

            T--;

        }
    }
}
