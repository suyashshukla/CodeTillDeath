package OS;

import java.util.Arrays;
import java.util.Scanner;

public class RRSchedule{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("No. of Processess ?");
        int process = sc.nextInt();


        System.out.println("Quantum ?");
        int quantum = sc.nextInt();


        int burst[] = new int[process];
        int waiting[] = new int[process];
        int turnaround[] = new int[process];
        int remBurst[] = new int[process];

        System.out.println("Processes ?");

        for (int i = 0; i < process; i++) {

            burst[i] = sc.nextInt();
            remBurst[i] = burst[i];

        }

        int exec = 0;

        double avTA = 0;
        double avWA = 0;

        RRSchedule rrSchedule = new RRSchedule();

        while(!rrSchedule.isComplete(remBurst)) {

            for (int j = 0; j < process; j++) {

                if(remBurst[j] > 0) {
                    if (remBurst[j] > quantum) {
                        exec = exec + quantum;
                        remBurst[j] = remBurst[j] - quantum;
                    } else if (remBurst[j] <= quantum) {
                        exec = exec + remBurst[j];
                        waiting[j] = exec - burst[j];
                        remBurst[j] = 0;
                    }
                }
            }
        }


        for(int i = 0;i<process;i++){

            turnaround[i] = waiting[i] + burst[i];

        }

        for (int i = 0; i < process; i++) {

            System.out.println("P" + (i + 1) + " : \t" + burst[i] + "\t" + waiting[i] + "\t" + turnaround[i]);

            avWA = avWA + waiting[i];
            avTA = avTA + turnaround[i];


        }


        System.out.println("Average Waiting Time : "+avWA/process+"\n"+
                           "Average Turnaround Time : "+avTA/process);

    }

    public boolean isComplete(int arr[]){

        boolean flag = true;

        for(int i = 0;i<arr.length;i++) {
            if (arr[i] != 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

}











