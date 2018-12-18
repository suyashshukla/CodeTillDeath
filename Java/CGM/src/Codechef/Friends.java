package Codechef;

import java.util.Scanner;

public class Friends {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int a,b,c,sum;
            boolean flag = false;


            for(int i = 1;i<=2;i++) {
                a = (int) Math.pow(-1, i) * x;
                for (int j = 1; j <= 2; j++) {
                    b = (int) Math.pow(-1, j) * y;
                    for (int k = 1; k <= 2; k++) {
                        c = (int) Math.pow(-1, k) * z;

                        sum = a + b + c;

                        if (sum == 0) {
                            flag = true;
                            break;
                        }
                    }
                }
            }

            if(flag)
                System.out.println("yes");
            else
                System.out.println("no");

            T--;
        }

    }
}
