package CodeVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class UEFA {

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> goal = new HashMap<>();

        while(T!=0){

            map.clear();
            goal.clear();

            for(int i = 0;i<12;i++) {

                String game = br.readLine();

                String []data = game.split(" ");

                String first = data[0];
                String last = data[4];

                Integer firstPoint = Integer.parseInt(data[1]);
                Integer lastPoint = Integer.parseInt(data[3]);

                if (!map.containsKey(first)) {
                    map.put(first, 0);
                    goal.put(first, 0);
                }


                if (!map.containsKey(last)) {
                    map.put(last, 0);
                    goal.put(last, 0);
                }

                if(firstPoint>lastPoint) {
                    map.put(first, map.get(first) + 3);
                }
                else if(firstPoint<lastPoint) {
                    map.put(last, map.get(last) + 3);
                }
                else {
                    map.put(first, map.get(first)+1);
                    map.put(last,map.get(last)+1);
                }

                goal.put(first,goal.get(first) + (firstPoint
                        - lastPoint));
                goal.put(last,goal.get(last) + (lastPoint
                        - firstPoint));

            }


            String winner = new UEFA().maxValue(map,goal);

            map.remove(winner);
            goal.remove(winner);

            String runner = new UEFA().maxValue(map,goal);

           System.out.println(winner+" "+runner);
            T--;
        }
    }

    String maxValue(Map<String, Integer> map, Map<String,Integer> goal){

        String maxString = "";
        int maximum = Collections.max(map.values());

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == maximum) {
                if(maxString.isEmpty() || goal.get(entry.getKey())>goal.get(maxString))
                    maxString = entry.getKey();
            }
        }


        return maxString;
    }
}
