package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Tweets {
    public static void main(String args[])throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String input = br.readLine();

int N = Integer.parseInt(input.split(" ")[0]);
int K = Integer.parseInt(input.split(" ")[1]);

boolean tweets[] = new boolean[N];

int open = 0;
int close = N;

Arrays.fill(tweets,false);

for(int i = 1;i<=K;i++){

    String s = br.readLine();
    s = s.trim();

    if(s.contains("CLICK")) {
        int index = (Integer.parseInt(s.split(" ")[1])-1);
        if(tweets[index]) {
            tweets[index] = false;
            open--;
            close++;
        }
        else {
            tweets[index] = true;
            open++;
            close--;
        }
        System.out.println(open);
    }

    else if (s.contains("CLOSE")){
        close = N;
        open = 0;
        Arrays.fill(tweets,false);
        System.out.println(open);
    }

}

    }

}
