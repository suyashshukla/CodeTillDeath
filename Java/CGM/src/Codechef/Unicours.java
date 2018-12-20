package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class Unicours {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();

            int courses[] = new int[N];
            int prequisites[] = new int[N];
            int ans = 0;

            for(int i = 0;i<N;i++)
                prequisites[i] = sc.nextInt();

            for(int i = 0;i<N;i++){
                int p = prequisites[i];
                int index = 0;
                while(p!=0){
                    courses[index++]++;
                    p--;
                }
            }

            for(int i = 0;i<N;i++)
                if(courses[i]==0)
                    ans++;

            System.out.println(ans);
    T--;
        }

    }
}
