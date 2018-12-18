package OS;

import java.util.Arrays;
import java.util.Scanner;

public class FCFS {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("No. of Processess ?");
        int process = sc.nextInt();


        int arrival[] = new int[process];
        int burst[] = new int[process];
        int waiting[] = new int[process];
        int turnaround[] = new int[process];



        for (int i = 0; i < process; i++) {

            arrival[i] = sc.nextInt();
            burst[i] = sc.nextInt();

        }

        int exec = 0;

        double avTA = 0;
        double avWA = 0;

        for (int j = 0; j < process; j++) {

            waiting[j] = exec - arrival[j];
            turnaround[j] = waiting[j] + burst[j];
            exec = exec + burst[j];

        }

        for (int i = 0; i < process; i++) {

            System.out.println("P" + (i + 1) + " : \t" + arrival[i] + "\t" + burst[i] + "\t" + waiting[i] + "\t" + turnaround[i]);

            avWA = avWA + waiting[i];
            avTA = avTA + turnaround[i];


        }


        System.out.println("Average Waiting Time : "+avWA/process+"\n"+
                           "Average Turnaround Time : "+avTA/process);

    }
}











