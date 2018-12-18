package Snackdown;

import java.util.Arrays;
import java.util.Scanner;

public class Cards {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();

//            int N = 1000000;

            long arr[] = new long[N];
            long brr[] = new long[N];
            long crr[] = new long[N];

            for(int i = 0;i<N;i++) {
                arr[i] = sc.nextLong();
               brr[i] = arr[i];

//                arr[i] = (long)(Math.random()*1000000000);
//                brr[i] = arr[i];
//
}


            Arrays.sort(brr);

            long min = brr[0];

            int mid =0;int index=0;boolean flow = false;

            for(int i = 0;i<N;i++) {

                if (arr[i] == min && !flow) {
                    crr[index++] = arr[i];
                    mid = i;
                    flow = true;
                    continue;
                }

                if(flow){
                    crr[index++] = arr[i];
                }

            }



            for(int i = 0;i<mid;i++){
                crr[index++] = arr[i];
            }


            for(int i = 0;i<N;i++){
                System.out.println(arr[i]+"\t"+brr[i]+"\t"+crr[i]);
            }

            boolean equal = true;

            for(int i = 0 ;i<N;i++) {

                if (brr[i] != crr[i]){
                    equal = false;
                    break;
                }
            }

            if(equal)
                System.out.println("YES");
            else
                System.out.println("NO");

            T--;



        }




    }


}
