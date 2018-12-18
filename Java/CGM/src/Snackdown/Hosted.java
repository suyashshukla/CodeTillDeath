package Snackdown;

import java.util.Scanner;

public class Hosted {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        String hosted = "2010;2015;2016;2017;2019";

        while(T!=0) {

            String year = sc.next();

            if (hosted.contains(year))
                System.out.println("HOSTED");
            else
                System.out.println("NOT HOSTED");

            T--;
        }


        }

    }

