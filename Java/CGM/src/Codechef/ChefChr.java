package Codechef;

import java.util.Scanner;

public class ChefChr {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {
            int count = 0;
            int index = 0;

            String str = sc.next();

            for (int i = 0; i < str.length() - 3; i++) {
                String chef = str.substring(i, i + 4);

                if (chef.indexOf('c') >= 0 &&
                        chef.indexOf('h') >= 0 &&
                        chef.indexOf('e') >= 0 &&
                        chef.indexOf('f') >= 0) {
                    count++;
                }

            }
            if (count != 0)
                System.out.println("lovely " + count);
            else
                System.out.println("normal");


            T--;
        }

    }
}
