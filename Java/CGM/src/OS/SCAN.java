package OS;

import java.util.Arrays;
import java.util.Scanner;

public class SCAN {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int sum =0;
        int head;
        int [] queue;
        int max;
        int dloc = 0;

        System.out.println("Input no of disk locations");
        int size = Integer.parseInt(input.nextLine());

        queue = new int[size+1];
        System.out.println("Enter head position");
        head = Integer.parseInt(input.nextLine());

        System.out.println("Input elements in disk queue");
        for(int i=0; i<size; i++){
            queue[i] = Integer.parseInt(input.nextLine());
        }

        queue[size] = head;
        size++;


        Arrays.sort(queue);

        max = queue[size-1];

        for(int i = 0; i<size; i++){
            if(head == queue[i]){
                dloc = i;
                break;
            }
        }

        for(int i = dloc; i>=0; i--){
            System.out.print(queue[i] + "-->");
        }

        System.out.print("0-->");

        for(int i=dloc+1; i<size; i++){
            System.out.print(queue[i] + "-->");
        }

        System.out.println();

        sum=head+max;
        System.out.println(" Movement of total cylinders " + sum);

    }

}
