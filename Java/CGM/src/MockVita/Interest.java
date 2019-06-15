package MockVita;

import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Interest {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        double rate = sc.nextDouble();

        rate = rate/36500;

        int days = sc.nextInt();

        int []r = new int[days];
        int []am = new int[days];
        String []mode = new String[days];
        int []balance = new int[days];

        double interest;

        int count = 1;

        for (int i = 0;i<days-2;i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            String c = sc.next();
            int d = sc.nextInt();

            r[a-1] = a;
            am[a-1] = b;
            mode[a-1] = c;
            balance[a-1] = d;

        }

        int entry1=0;
        int entry2=0;

        interest = sc.nextDouble();

        int deficit = r[0]==0?1:r[0];

        for(int i = days-1;i>=0;i--){

            if(r[i]==i+deficit){
                interest = interest-((balance[i]*rate));
            }

            else{
                if(count==1) {
                    entry2 = i;
                    r[i] = i+deficit;
                    balance[i] = am[i + 1] + balance[i + 1];
                    interest = interest-((balance[i]*rate));
                    count++;
                }
                else {
                    entry1 = i;
                    r[i] = i+deficit;
                }
            }

        }


        balance[entry1] = (int)Math.round((interest/rate));
        am[entry1] = Math.abs(balance[entry1-1]-balance[entry1]);
        mode[entry1] = balance[entry1]>balance[entry1-1]?"credit":"debit";

        am[entry2] = Math.abs(balance[entry1]-balance[entry2]);;
        mode[entry2] = balance[entry2]>balance[entry1]?"credit":"debit";


        System.out.print(r[entry1]+" "+am[entry1]+" "+mode[entry1]+" "+balance[entry1]);
        System.out.println();
        System.out.print(r[entry2]+" "+am[entry2]+" "+mode[entry2]+" "+balance[entry2]);


    }
}
