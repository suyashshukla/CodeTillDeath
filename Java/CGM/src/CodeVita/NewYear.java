package CodeVita;

import java.util.*;
public class NewYear {


    public static void main(String []args ) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();



            int []arr = new int[N];

            for(int i = 0;i<arr.length;i++)
                arr[i] = sc.nextInt();

            for(int i = N-1;i>0;i--){

                if(arr[i]<0) {
                    continue;
                }

                if(arr[i]>arr[i-1]) {
                    System.out.print(arr[i]);
                    i = i - 1;
                }
                else {
                    System.out.print(arr[i - 1]);
                    i = i - 2;
                }

            }

            System.out.println();

            T--;

        }

    }
}






