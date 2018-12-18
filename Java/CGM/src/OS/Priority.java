package OS;

import java.util.Scanner;

public class Priority {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int priority[] = new int[4];
        int burst[] = new int[4];
        int waiting[] = new int[4];
        int turnaround[] = new int[4];

        System.out.println("No. of Processess ?");
        int process = sc.nextInt();


        for (int i = 0; i < process; i++) {

            burst[i] = sc.nextInt();
            priority[i] = sc.nextInt();

        }

        int prTemp;
        int buTemp;

        for(int i = 0;i<process-1;i++){
            for(int j = i+1;j<process;j++){
                if(priority[j]>priority[i]){
                    buTemp = burst[j];
                    burst[j] = burst[i];
                    burst[i] = buTemp;

                    prTemp = priority[j];
                    priority[j] = priority[i];
                    priority[i] = prTemp;
                }
            }

        }

        int exec = 0;

        double avTA = 0;
        double avWA = 0;

        for (int j = 0; j < process; j++) {

            waiting[j] = exec;
            turnaround[j] = waiting[j] + burst[j];
            exec = exec + burst[j];

        }

        for (int i = 0; i < process; i++) {

            System.out.println("P" + (i + 1) + " : \t" + priority[i] + "\t" + burst[i] + "\t" + waiting[i] + "\t" + turnaround[i]);

            avWA = avWA + waiting[i];
            avTA = avTA + turnaround[i];


        }


        System.out.println("Average Waiting Time : "+avWA/process+"\n"+
                "Average Turnaround Time : "+avTA/process);

    }
}











