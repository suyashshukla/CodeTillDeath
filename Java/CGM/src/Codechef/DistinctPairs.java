package Codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctPairs {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();


        ArrayList<String> arrayList = new ArrayList<>();

        int count = N+M-1;

        String pairs = "";

            for(int i = 0;i<N;i++){
                for(int j = 0;j<M;j++){

                    String p = "[".concat(String.valueOf(i+j)).concat("]");

                    if(!pairs.contains(p)) {
                        pairs = pairs.concat(p);
                        arrayList.add(i+" "+j);
                        count--;
                    }

                    if(count==0)
                        break;

                }
            }

            for(String str : arrayList)
                System.out.println(str);


    }
}
