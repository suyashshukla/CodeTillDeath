package Codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class Event {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        ArrayList<String> days = new ArrayList<>();


                days.add("monday");
                days.add("tuesday");
                days.add("wednesday");
                days.add("thursday");
                days.add("friday");
                days.add("saturday");
                days.add("sunday");

        int T = sc.nextInt();

        while(T!=0){

            String S = sc.next();
            String E = sc.next();

            int L = sc.nextInt();
            int R = sc.nextInt();

            int count = 0;
            int value = 0;

            int diff = days.indexOf(E) - days.indexOf(S);

            if(diff>0) {
                diff = diff + 1;
            }
            else if(diff<0){
                diff = 7 + diff + 1;
            }
            else{
                diff = 1;
            }



            while(diff<=R){
                if(diff>=L) {
                    count++;
                    value = diff;
                }
                diff = diff + 7;
            }

            if(count==1)
                System.out.println(value);
            else if(count>1)
                System.out.println("many");
            else
                System.out.println("impossible");

            T--;
        }
    }
}
