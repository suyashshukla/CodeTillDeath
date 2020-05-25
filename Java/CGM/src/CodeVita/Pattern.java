package CodeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern {

    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int second = 10;

        int num = (N*(N+1))/2;
        int fourth = 2*num;

        int third = (N*N*10)+10;


        for(int i = 1;i<=N;i++){

            int reverse = N-i+1;

            int thirdPrint = third;

            for(int j = 1;j<=i-1;j++){
                System.out.print("**");
            }

            for(int k=N;k>=i;k--){
                System.out.print(second);
                second+=10;
            }

            for(int l = N-1;l>=i;l--){
                System.out.print(thirdPrint);
                thirdPrint+=10;
            }

            for(int m=i;m<=i;m++){
                System.out.print(fourth);
                fourth = fourth - (N-i+1);
            }
System.out.println();
            third = third - ((N-i)*10);
        }

    }
}
