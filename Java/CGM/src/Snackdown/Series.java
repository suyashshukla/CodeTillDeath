package Snackdown;

import java.util.Scanner;

public class Series {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();
            int K = sc.nextInt();


            int count = 0;

            int arr[] = new int[N];

            for(int i = 0;i<N;i++){

                arr[i] = sc.nextInt();

                if(arr[i]!=1)
                    count++;

            }

            if(count<=K)
                System.out.println("YES");
            else
                System.out.println("NO");


            T--;
        }


    }
}
