package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class SmPair {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();

            int arr[] = new int[N];

            for(int i = 0;i<N;i++)
                arr[i] = sc.nextInt();

            Arrays.sort(arr);

            int sum = 0;
            int count = 0;

            for(int i : arr){
                if(i > sum && count!=2) {
                    sum = sum + i;
                    count++;
                }
                else if(count==2){
                    break;
                }
            }

            System.out.println(sum);

            T--;
        }
    }
}
