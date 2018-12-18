package OS;

import java.util.Scanner;

public class SJF {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int arrival[] = new int[4];
        int burst[] = new int[4];
        int waiting[] = new int[4];
        int turnaround[] = new int[4];

        System.out.println("No. of Processess ?");
        int process = sc.nextInt();


        for (int i = 0; i < process; i++) {

            arrival[i] = sc.nextInt();
            burst[i] = sc.nextInt();

        }

        int arTemp;
        int buTemp;

        for(int i = 0;i<process-1;i++){
            for(int j = i+1;j<process;j++){
                if(burst[j]<burst[i]){
                    buTemp = burst[j];
                    burst[j] = burst[i];
                    burst[i] = buTemp;

                    arTemp = arrival[j];
                    arrival[j] = arrival[i];
                    arrival[i] = arTemp;
                }
            }

        }

        int index = -1;

        int zeroBU = 0;
        int zeroAR = 0;

        for(int i = 0;i<process;i++){
            if(arrival[i] == 0) {
                index = i;
                zeroAR = arrival[i];
                zeroBU = burst[i];
                break;
            }
        }

        for(int i = index;i>0;i--){

            burst[i] = burst[i-1];
            arrival[i] = arrival[i-1];

        }

        if(index!=-1){
            burst[0] = zeroBU;
            arrival[0] = zeroAR;
        }


        int exec = 0;

        double avTA = 0;
        double avWA = 0;

        for (int j = 0; j < process; j++) {

            waiting[j] = exec - arrival[j];
            waiting[j] = waiting[j]>=0?waiting[j]:0;

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











