package CodeVita;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            int N = sc.nextInt();

            String[] arr = new String[N];


            for(int i = 0;i<N;i++){

                arr[i] = sc.next();

            }

            String str = "";

            int combinations = (N * (N - 1)) / 2;

            ArrayList<String> sequence = new ArrayList<>();


            int index = 0;

            while (index < N) {

                for (int i = index + 1; i < N; i++) {

                    str = arr[index] + arr[i];
                    sequence.add(str);
                }
                index++;
            }

            int count = 0;

            for (String string : sequence) {
                if (string.contains("a") &&
                        string.contains("e") &&
                        string.contains("i") &&
                        string.contains("o") &&
                        string.contains("u")) {
                    count++;
                }
            }


            System.out.println(count);

            T--;

        }


    }
}
