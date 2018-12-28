package Codechef;

import java.util.Scanner;

public class ChefKey {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            long n = sc.nextInt();
            long m = sc.nextInt();
            long c = sc.nextInt();

            long count = 0;

            for(long i = 1;i<=n;i++){
                for(long j = 1;j<=m;j++){
                    if((i*j)==c)
                        count++;
                    else if((i*j)>c)
                        break;
                }
            }

            System.out.println(count);

            T--;
        }

    }
}
