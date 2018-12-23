package Codechef;

import java.util.Scanner;

public class VideoGame {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int H = sc.nextInt();

        int box[] = new int[N];

        for(int i = 0;i<N;i++)
            box[i] = sc.nextInt();

        int ops = -1;

        int pos = 0;

        boolean hasBox = false;

        while (ops!=0) {
            ops = sc.nextInt();

            switch (ops) {

                case 1://Move Left
                    if (pos != 0)
                        pos--;
                    break;
                case 2://Move Right
                    if (pos + 1 < N)
                        pos++;
                    break;
                case 3://Pick Up
                    if (box[pos] != 0 && !hasBox) {
                        box[pos]--;
                        hasBox = true;
                    }
                    break;
                case 4://Drop
                    if (box[pos] != H && hasBox) {
                        box[pos]++;
                        hasBox = false;
                    }
                    break;

            }

        }

for(int i : box)
    System.out.print(i+" ");
            }

}
