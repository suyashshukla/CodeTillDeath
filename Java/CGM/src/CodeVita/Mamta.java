package CodeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Mamta {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int Q = Integer.parseInt(br.readLine());

        Map<Character,Map<Integer,Integer>> alphaMap = new HashMap<>();

        Map<Character,Integer> map = new HashMap<>();

        for(char ch = 'a';ch<='z';ch++){
            alphaMap.put(ch,new HashMap<>());
            map.put(ch,0);
        }

            for(int i=0;i<N;i++){

                char ch =s.charAt(i);

                map.put(ch,map.get(ch)+1);

                Map<Integer,Integer> charMap = alphaMap.get(ch);

                charMap.put(i,map.get(ch));

                alphaMap.put(ch,charMap);

            }

        int query;

        for(int i = 0;i<Q;i++){

            query = Integer.parseInt(br.readLine());

            char ch = s.charAt(query-1);

            Map<Integer,Integer> dataMap = alphaMap.get(ch);

            int count = dataMap.get(query-1);

            if(i!=Q-1)
            System.out.println(count-1);
            else
            System.out.print(count-1);

        }
    }
}
