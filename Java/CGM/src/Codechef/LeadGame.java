package Codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadGame {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sLead;
        int tLead;

        int s[] = new int[N];
        int t[] = new int[N];
        int p[] = new int[N];
        int lead[] = new int[N];

       for(int i = 0;i<N;i++){

           s[i] = sc.nextInt();
           t[i] = sc.nextInt();

           if(i>0){
               s[i] = s[i] + s[i-1];
               t[i] = t[i] + t[i-1];
           }


           if(s[i] > t[i]){
               sLead = s[i] - t[i];
               lead[i] = sLead;
               p[i] = 1;
           }

           else if(t[i] > s[i]){
               tLead = t[i] - s[i];
               lead[i] = tLead;
               p[i] = 2;
           }
       }

       int maxLead = 0;
       int player = 0;

       for(int i = 0;i<N;i++){
           if(lead[i]>maxLead) {
               maxLead = lead[i];
               player = p[i];
           }
       }

       System.out.println(player+" "+maxLead);

    }

}
