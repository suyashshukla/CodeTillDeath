package HackWithInfy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


    public class Solution {

    static int widestGap(int n, List<Integer> start, List<Integer> finish) {

        List<Integer> reference = new ArrayList<>(start);



        Collections.sort(start);

        int max = start.get(0)-1;
        int gap = max;

        int s,e,range;

        System.out.println(start);
        System.out.println(finish);
        System.out.println(reference);
        for(int i = 0;i<start.size();i++){

            s = start.get(i);
            e = finish.get(reference.indexOf(s));
            reference.set(reference.indexOf(s),-1);


            if(s==2)
                System.out.println(e);




        }


        return max;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int startCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> start = IntStream.range(0, startCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int finishCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> finish = IntStream.range(0, finishCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = widestGap(n, start, finish);

        System.out.println(result);
    }
}
