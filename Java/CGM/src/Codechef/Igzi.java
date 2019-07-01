

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Igzi {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        while (T != 0) {

            String input = br.readLine();

            int N = Integer.parseInt(input.split(" ")[0]);
            int Q = Integer.parseInt(input.split(" ")[1]);

            String[] strings = new String[N];

            for(int i = 0;i<N;i++){
                strings[i] = String.valueOf(i);
            }


            String str = Arrays.toString(strings);

            int sum = 0;

            while (Q != 0) {

                String query = br.readLine();

                String[] arr = query.split(" ");


                if (arr[0].equals("1")) {
                    int change = Integer.parseInt(arr[1]);
                    change = change + sum;

                    strings[change] = "0";
                    str = Arrays.toString(strings);
                }
                else if (arr[0].equals("2")) {
                    int start = Integer.parseInt(arr[1]) + sum;
                    int end = Integer.parseInt(arr[2]) + sum;

                    String subString = str.substring(start,end+1);

                    char []subArray = subString.toCharArray();

                    Arrays.sort(subArray);

                    char max = subArray[subArray.length-1];
                    System.out.println(max);

                    sum = sum + max%48;

                    sum = sum % N;

                }

                Q--;
            }
            T--;
        }

    }
}
