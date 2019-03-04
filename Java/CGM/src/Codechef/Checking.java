package Codechef;

import java.util.Scanner;
import java.util.Set;
import java.lang.System;

public class Checking {

    private static int num = 7;

    public static void main(String []args){

        Checking checking = new Checking();

        for(checking.r(); checking.r() != 0; checking.r())
        System.out.print(checking.r());

        System.out.println();


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int start = 65;
        int end = 65+n;



        for (int i = end;i>=start;i--){
            System.out.println();
            for(int j = 65;j<=i;j++){
                if(j!=end)
                System.out.print((char)j+" ");
            }
            for(int s = i;s<end;s++){
                if(s!=(end-1))
                System.out.print("    ");
                else
                    System.out.print("  ");
            }
            for(int k = i;k>=start;k--){
                System.out.print((char)k+" ");
            }

        }

    for(int i = 1;i<=n;i++){
        System.out.println();
        for(int j=n;j>=i;j--){
            System.out.print(" ");
        }
        for(int k = 1;k<=i;k++){
            System.out.print(k+" ");
        }
    }


    }



    private int r(){
        return num--;
    }

    public Checking(){}

    public void one(){
    }


    private static Checking getInstance(){
        return new Checking();
    }

    public int num(){
        return 0;
    }
}

class Hello extends Checking{}
