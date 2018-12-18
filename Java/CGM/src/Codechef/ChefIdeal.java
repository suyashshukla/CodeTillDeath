package Codechef;

import java.util.Scanner;
class ChefIdeal {

    public static void main(String args[]){

        int sum = 6;

        int random = (int)(Math.random()*10)%3;

        int X;

        if(random == 3)
            X = 3;
        else if(random == 2)
            X = 2;
        else
            X = 1;


        sum = sum - X;

        System.out.println(X);

        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();

        sum = sum - Y;


        System.out.println(sum);





    }


}
