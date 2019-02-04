package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Facnyc {

    public static void main(String args[])throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T!=0){


            String S = br.readLine();
            boolean flag = false;

            String []words = S.split(" ");

            for(String str : words){
                if(str.equals("not")) {
                    flag = true;
                    break;
                }
            }

            if(flag)
                System.out.println("Real Fancy");
            else
                System.out.println("regularly fancy");

            T--;
        }

    }
}
