package OS;

import java.util.Scanner;

public class FCFSDisk {

    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        System.out.println("No. of Requests : ");
        int size = sc.nextInt();

        System.out.println("Head Position Initially : ");
        int head = sc.nextInt();

        int requests[] = new int[size];

        for(int i = 0;i<size;i++){

            requests[i] = sc.nextInt();

        }

        int seekTime = 0;

        for(int i = 0;i<size;i++){

            seekTime = seekTime + Math.abs(head - requests[i]);
            head = requests[i];

        }

        System.out.println("Total Movement of Seek Slider of Disk = "+seekTime);


    }


}
