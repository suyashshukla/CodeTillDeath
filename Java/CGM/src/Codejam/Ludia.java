package Codejam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ludia {

    public static void main(String args[])throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int T = Integer.parseInt(br.readLine());

while(T!=0){

    int N = Integer.parseInt(br.readLine());

    String S = br.readLine();

    S = S.replaceAll("S","@");
    S = S.replaceAll("E","#");

    S = S.replaceAll("@","E");
    S = S.replaceAll("#","S");

    System.out.println(S);

    T--;
}
    }
}
