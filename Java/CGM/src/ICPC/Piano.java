package ICPC;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Piano {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            boolean flag = true;

            String str = sc.next();

            for(int i = 0;i<str.length();i+=2){

                char ch = str.charAt(i);
                char x = str.charAt(i+1);

                if(ch == x) {
flag = false;
break;
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
