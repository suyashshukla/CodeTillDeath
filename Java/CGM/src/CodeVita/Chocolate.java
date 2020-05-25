//package CodeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Chocolate {

    public static void main(String []args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int P = Integer.parseInt(br.readLine());
        int Q = Integer.parseInt(br.readLine());

        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = P;i<=Q;i++){
            for(int j = R;j<=S;j++){

                int length = i;
                int breadth = j;

                while(length>1 && breadth>1){
                    int min = min(length,breadth);

                    if(length==breadth){
                        count++;
                        length=0;
                        breadth=0;
                        continue;
                    }

                    if(min==length){
                        breadth = breadth - min;
                    }
                    else{
                        length = length - min;
                    }
                    count++;
                }

                if(length>1)
                    count = count + length;
                else if(breadth>1)
                    count = count + breadth;

            }
        }

        System.out.println(count);

    }

    public static int min(int a,int b){
        return a<b?a:b;
    }

    public static int max(int a,int b){
        return a>=b?a:b;
    }

}
