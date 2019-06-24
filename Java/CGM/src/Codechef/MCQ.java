package Codechef;

import java.util.Scanner;

public class MCQ {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

    int N = sc.nextInt();

            String S = sc.next();
            String U = sc.next();

            int  i = 0;
            int score = 0;

            while (i < N) {


                char sol = S.charAt(i);
                char ans = U.charAt(i);

                if(sol==ans) {
                    score++;
                    i++;
                }
                else if(ans == 'N'){
                    i++;
                }
                else{
                    i+=2;
                }


            }

            System.out.println(score);


T--;
        }

    }
}
