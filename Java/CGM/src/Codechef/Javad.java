package Codechef;

import java.util.Scanner;

public class Javad {

    public static int calculateDays(int m,int d, int mDays[]){

        int days = 0;

        for(int i = 0;i<m-1;i++){
            days = days + mDays[i];
        }

        days = days + d;

        return days;

    }



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){


            int N = sc.nextInt();

            int arr[] = new int[N];

            int days = 0;

            for(int i = 0;i<N;i++){
                arr[i] = sc.nextInt();
                days = days + arr[i];
            }


            int yb = sc.nextInt();
            int mb = sc.nextInt();
            int db = sc.nextInt();

            int yc = sc.nextInt();
            int mc = sc.nextInt();
            int dc = sc.nextInt();

            int totalDays = 0;

            for(int i = yb+1;i<yc;i++){
                totalDays = totalDays + days;

                if(i%4==0)
                    totalDays++;
            }

            int currentDays = calculateDays(mc,dc,arr);
            int birthDays = calculateDays(mb,db,arr);



            if(yc!=yb) {
                int remainingDays = days - (birthDays - 1);  //to calculate the remainant days of the year
                if(yb%4==0)
                    remainingDays = remainingDays + 1;

                totalDays = totalDays + remainingDays + currentDays;
            }
            else {
                totalDays = currentDays - (birthDays - 1);
            }



            System.out.println(totalDays);

            T--;
        }

    }
}
