package Codechef;

import java.util.Scanner;

public class Robo {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int left_buffer = 0;
        int right_buffer = 0;

        int buffer = -1;

        boolean flag =false;

        while(T!=0){

            String s = sc.next();

            for(int i = 0;i<s.length();i++){

                char ch = s.charAt(i);

                if(ch!='.'){
                    int robot = ch%48;

                left_buffer = i-robot>=0?i-robot:0;
                right_buffer = i+robot<s.length()?i+robot:s.length()-1;

                if(left_buffer<=buffer){
                    flag = true;
                    break;
                }

                buffer = right_buffer;

                }


            }


            if(flag)
                System.out.println("unsafe");
            else
                System.out.println("safe");

            T--;
            flag = false;
            buffer = -1;
        }


    }
}
