package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ChefCoins

{

    public static void main(String []args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        System.out.println(new ArrayList<>(Arrays.asList("HEllo".split(""))));
        while(T!=0){

            long sum = 0;

            int coins = Integer.parseInt(br.readLine());

            String elements = br.readLine();
            ArrayList<Integer> integers = new ArrayList<>();

            String[] str = elements.split(" ");

            for(int i = 0;i<str.length;i++){
                integers.add(Integer.parseInt(str[i]));
                sum = sum + Integer.parseInt(str[i]);
            }

            double mean = (double)sum/coins;

            if(mean - Math.floor(mean)==0){
                if(integers.contains((int)mean))
                    System.out.println(integers.indexOf((int)mean)+1);
                else
                    System.out.println("Impossible");
            }
            else{
                System.out.println("Impossible");
            }

            T--;
        }


    }

}
