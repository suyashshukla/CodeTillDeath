package Codechef;

import java.util.Scanner;

public class Magicjar {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int n = sc.nextInt();

            int []arr = new int[n];

            int max = 0;

            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();

                if(arr[i]>max)
                    max = arr[i];
            }

                System.out.println(max);
                    T--;

        }
    }

}
