package Snackdown;

import java.util.*;

public class Queue {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T != 0) {

            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt();


            Map<Long, Long> map = new HashMap<>();
            Map<Long, Long> ans = new HashMap<>();

            long arr[] = new long[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] <= K)
                    map.put(arr[i], (long) 1);
                else
                    map.put(arr[i], (long) 0);
            }

            int t = L * (M + 1);

            int count = 0;

            long busy;

            long index = 0;

            long min = Long.MAX_VALUE;

            for (long l = 0; l <= K; l++) {
                map.computeIfAbsent(l, l1 -> (long) 0);

                if (map.get(l) == 1) {
                    count++;
                    busy = t + (count - 1) * L - index++;
                }
                else {
                    if(l%L!=0)
                        continue;
                    busy = t + count * L - index++;
                }
                ans.put(l, busy);

                if ((ans.get(l)).compareTo(min) < 0)
                    min = ans.get(l);
            }

            System.out.println(min);

            T--;

        }
    }
}
