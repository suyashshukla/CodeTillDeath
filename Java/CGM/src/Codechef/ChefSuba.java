package Codechef;

import java.util.*;

class ChefSuba {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n, k, p, c = 0, x = 0, max = 0, temp;

        String s;

        n = sc.nextInt();
        k = sc.nextInt();
        p = sc.nextInt();

        int y = k;

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        s = sc.next();
        s = s.trim();

        for (int i = 0; i < p; i++) {

            switch (s.charAt(i)) {

                case '?':

                    while (x < y && y <= n) {

                        for (int j = x; j < y; j++) {

                            if (a[j] == 1)
                                c++;
                        }

                        if (c > max)
                            max = c;

                        c = 0;

                        x++;
                        y++;

                    }
                    System.out.println(max);
                    max = 0;
                    x = 0;
                    y = k;

                    break;


                case '!':

                    temp = a[n - 1];

                    for (int l = n - 1; l > 0; l--)
                        a[l] = a[l - 1];

                    a[0] = temp;

                    break;

            }
        }
    }
}

    
        
        