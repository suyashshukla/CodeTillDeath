package Codechef;

import java.util.Scanner;

public class Unicours {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();

            int prequisites[] = new int[N];
            int ans;
            int max = 0;

            for(int i = 0;i<N;i++) {
                prequisites[i] = sc.nextInt();
                if(prequisites[i]>max){
                    max = prequisites[i];
                }
            }

            ans = N-max;

            System.out.println(ans);
    T--;
        }

    }
}
