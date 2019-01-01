package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class Lapidromes {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            String S = sc.next();

            boolean isOdd = S.length()%2!=0;


            int mid = S.length()/2;

            String s1,s2;

            if(isOdd){

                s1 = S.substring(0,mid);
                s2 = S.substring(mid+1);

            }
            else{

                s1 = S.substring(0,mid);
                s2 = S.substring(mid);
            }

            char []ch = s1.toCharArray();
            char []x = s2.toCharArray();

            Arrays.sort(ch);
            Arrays.sort(x);

            if(Arrays.equals(ch,x))
                System.out.println("YES");
            else
                System.out.println("NO");




T--;
        }

    }
}
