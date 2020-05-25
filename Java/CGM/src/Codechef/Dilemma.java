package Codechef;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dilemma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            String binary = sc.next();

            char[] ch = binary.toCharArray();

            for (int i = 0; i < ch.length - 1; i++) {

                char x = ch[i];
                char next = ch[i+1];

                if (x == '0')
                    continue;

                next = next == '1' ? '0' : '1';

                ch[i + 1] = next;
            }

            char check = ch[ch.length-1];

            if (check=='1') {
                System.out.println("WIN");
            } else
                System.out.println("LOSE");

            T--;
        }


    }


}


