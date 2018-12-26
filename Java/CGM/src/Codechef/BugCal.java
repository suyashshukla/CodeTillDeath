package Codechef;

        import java.util.Scanner;

public class BugCal {

    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            String a = sc.next();
            String b = sc.next();

            char maxLengthNumber = a.length()>b.length()?'a':'b';

            if (maxLengthNumber == 'a') {

                while(b.length()!=a.length()){
                    b = "0".concat(b);
                }

            }

            else{
                while(a.length()!=b.length()){
                    a = "0".concat(a);
                }
            }

            String ans = "";

            for(int i = a.length()-1;i>=0;i--) {

                int num = (a.charAt(i) + b.charAt(i)) % 48;

                ans = String.valueOf(num % 10).concat(ans);

            }

            System.out.println(ans);

            T--;


        }


    }

}
