package CodeVita;

import java.util.ArrayList;
import java.util.Scanner;

public class Number {


  private static Long largest(ArrayList<Long> list){

        if(list.size()==1)
            return list.get(0);
        else{
            list.add(((list.get(0)*(list.get(1))) + list.get(0) + list.get(1))% 1000000007);
            list.remove(0);
            list.remove(0);
            return largest(list);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //int T = sc.nextInt();

        System.out.println(1+2*3);

//        while (T != 0) {
//
//            int N = sc.nextInt();
//
//            ArrayList<Long> arrayList = new ArrayList<>();
//
//            for(int i = 1;i<=N;i++){
//                arrayList.add((long)i);
//            }
//
//            System.out.println(largest(arrayList));
//
//
//
////            Long sum = new Long("0");
////            Long a = new Long("1");
////            Long b = new Long("2");
////
////            Long modulo = new Long("1000000007");
////
////            Long ten = new Long("39916799");
////            Long hundred = new Long("229730821");
////            Long thousand = new Long("61123213");
////            Long tenThousand = new Long("39193487");
////            Long lakh = new Long("755072380");
////
////            Long num = new Long(String.valueOf(N));
////
////
////            if (N >= 10 && N < 100) {
////                a = ten;
////                b = new Long("10").add(Long.ONE);
////            } else if (N >= 100 && N < 1000) {
////                a = hundred;
////                b = new Long("100").add(Long.ONE);
////            } else if (N >= 1000 && N < 10000) {
////                a = thousand;
////                b = new Long("1000").add(Long.ONE);
////            } else if (N >= 10000 && N < 100000) {
////                a = tenThousand;
////                b = new Long("10000").add(Long.ONE);
////
////            } else if (N >= 100000) {
////                a = lakh;
////                b = new Long("100000").add(Long.ONE);
////            }
////
////
////        for (int i = b.intValue(); i <= N; i++) {
////            b = new Long(String.valueOf(i));
////            sum = sum.add(a.multiply(b))
////                    .add(a)
////                    .add(b);
////
////            if (sum.compareTo(modulo) > 0)
////                sum = sum.mod(modulo);
////
////            a = sum;
////            sum = new Long("0");
////        }
////
////        sum = a.mod(modulo);
////
////        System.out.println(sum);
////
//        T--;
//    }
//

}

}
