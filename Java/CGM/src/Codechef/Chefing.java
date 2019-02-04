package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chefing {

    public static void main(String args[])throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T!=0){

            int n = Integer.parseInt(br.readLine());

            String str[] = new String[n];

            String complete = "";
            String reference = "";

            for(int i = 0;i<n;i++){

                str[i] = br.readLine();

                complete = complete + str[i];

            }


            for(int i = 97;i<=122;i++){
                for(int j = 0 ;j<complete.length();j++){
                    if(i==complete.charAt(j)) {
                        reference = reference + (char) i;
                        break;
                    }
                }
            }

            int count = 0;
            int occur = 0;

            for(int i = 0;i<reference.length();i++){
                for(int j = 0;j<str.length;j++){
                    if(str[j].contains(reference.charAt(i)+"")){
                        occur++;
                    }
                }
                if(occur==n) {
                    count++;
                }

                occur = 0;
            }


            System.out.println(count);


T--;
        }




    }
}
