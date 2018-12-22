package Codechef;

import java.util.Scanner;

public class TruthDare {

    public static void main(String args[]) {

        TruthDare truthDare = new TruthDare();

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            int tr = sc.nextInt();
            int truthRam[] = new int[tr];
            for (int i = 0; i < tr; i++)
                truthRam[i] = sc.nextInt();

            int dr = sc.nextInt();
            int dareRam[] = new int[dr];
            for (int i = 0; i < dr; i++)
                dareRam[i] = sc.nextInt();

            int ts = sc.nextInt();
            int truthShyam[] = new int[ts];
            for (int i = 0; i < ts; i++)
                truthShyam[i] = sc.nextInt();

            int ds = sc.nextInt();
            int dareShyam[] = new int[ds];
            for (int i = 0; i < ds; i++)
                dareShyam[i] = sc.nextInt();

            boolean flag = true;

            for (int i = 0; i < ts; i++) {
                int item = truthShyam[i];
                flag = truthDare.binarySearch(truthRam, item);
                if (!flag)
                    break;
            }

            if (flag) {
                for (int i = 0; i < ds; i++) {
                    int item = dareShyam[i];
                    flag = truthDare.binarySearch(dareRam, item);
                    if (!flag)
                        break;
                }
            }


            if (flag)
                System.out.println("yes");
            else
                System.out.println("no");

            T--;
        }


    }

    private boolean binarySearch(int arr[], int item) {
        boolean flag = false;

        for (int i : arr) {
            if (i == item) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}
