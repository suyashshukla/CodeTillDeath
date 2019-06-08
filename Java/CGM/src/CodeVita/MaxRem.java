package CodeVita;

import java.util.*;

public class MaxRem {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Set<Integer> set = new HashSet<>();

        for(int i = 0;i<N;i++){
            set.add(sc.nextInt());
        }

        ArrayList<Integer> arrayList = new ArrayList<>(set);

        Collections.sort(arrayList);

        int ans;

        if(arrayList.size()>1)
        ans = arrayList.get(arrayList.size()-2) % arrayList.get(arrayList.size()-1);
        else
            ans = 0;

        System.out.println(ans);
    }
}
