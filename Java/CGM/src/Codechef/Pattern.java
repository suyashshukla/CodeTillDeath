package Codechef;

import java.util.Scanner;

public class Pattern {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();

            int arr[][] = new int[N][N];

            int x = 0;int y = 0;
            int count = 1;
            int end = 2*N - 1;

            int iteration = 0;
            boolean flag = true;
            for(int i = 0;i<end;i++){
                if(iteration==N)
                    flag = false;

                if(flag) {
                    x = 0;
                    y = iteration++;
                }
                else {
                    y = N-1;
                    iteration--;
                    x = N - iteration;
                }

                for(int j = 0;j<iteration;j++){

                    arr[x++][y--] = count++;

                }
            }


            for(int i = 0;i<N;i++){
                System.out.println();
                for(int j = 0;j<N;j++){
                System.out.print(arr[i][j]+" ");
                }
            }

T--;
            System.out.println();
        }

    }
}
