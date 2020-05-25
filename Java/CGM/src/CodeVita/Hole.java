package CodeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Hole {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String holes = br.readLine();

        int M = Integer.parseInt(br.readLine());

        String balls = br.readLine();

        ArrayList<String> holeList = new ArrayList<>(Arrays.asList(holes.split(" ")));

        ArrayList<String> ballList = new ArrayList<>(Arrays.asList(balls.split(" ")));

        int filled[] = new int[ballList.size()];

        for (int i = 0; i < ballList.size(); i++) {
            filled[i] = i + 1;
        }

        boolean flag = false;

        for (int i = 0;i<ballList.size();i++) {

            int ball = Integer.parseInt(ballList.get(i));

            for (int j = holeList.size()-1; j>=0; j--) {

                if (filled[j] == 0)
                    continue;

                int hole = Integer.parseInt(holeList.get(j));

                if (ball <= hole) {
                    flag = true;
                    ballList.set(i, String.valueOf(j + 1));
                    filled[j]--;
                    break;
                }

            }

            if (!flag) {
                ballList.set(i, String.valueOf(0));
            }
            flag = false;
        }


        for (int i = 0; i < ballList.size(); i++) {
            System.out.print(ballList.get(i) + " ");
        }

    }
}
