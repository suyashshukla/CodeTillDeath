package CodeVita;

import java.util.Scanner;

public class Card {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();

            int arr[] = new int[N];

            int min=0,max=0;

            int negative = 0;

            for(int i = 0;i<N;i++) {
                arr[i] = sc.nextInt();
                if(arr[i]<0)
                    negative++;
            }

            if(negative==0){

                min = N;
                max = N;

            }

            else{

                int positive = N - negative;

                max = positive>=negative?positive:negative;
                min = N - max;

            }

            System.out.println(max+" "+min);


            T--;

        }
    }
}
