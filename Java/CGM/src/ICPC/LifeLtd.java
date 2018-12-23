package ICPC;

import java.util.Scanner;

public class LifeLtd {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        char logo[][] = new char[3][3];

        while (T != 0) {

            for (int i = 0; i < 3; i++) {
                String str = sc.next();
                for (int j = 0; j < 3; j++) {
                    logo[i][j] = str.charAt(j);
                }
            }

            int x, y;
            boolean flag = false;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    x = i;
                    y = j;

                    if (logo[x][y] == 'l' && x + 1 < 3 && y + 1 < 3) {
                        if (logo[x + 1][y] == 'l' && logo[x + 1][y + 1] == 'l') {
                            flag = true;
                            break;
                        }
                    }
                }
            }

            if (flag)
                System.out.println("yes");
            else
                System.out.println("no");

            T--;
        }


    }

}
