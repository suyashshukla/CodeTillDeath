package Codechef;

        import java.util.Scanner;

public class DeputyChef {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        int T = sc.nextInt();


        while(T!=0)
        {

            int n = sc.nextInt();

            int a[] = new int[n];
            int d[] = new int[n];

            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0;i<n;i++){
                d[i] = sc.nextInt();
            }

            int defense = -1;

            if(d[0]>(a[n-1]+a[1])){

                if(d[n-1]>defense)
                defense = d[0];
            }

            if(d[n-1]>(a[n-2]+a[0])){

                if(d[n-1]>defense)
                defense = d[n-1];
            }

                for (int i = 1; i < n - 1; i++) {

                    if (d[i] > (a[i - 1] + a[i + 1])) {
                        if(d[i]>defense)
                        defense = d[i];
                    }
                }


            System.out.println(defense);

            T--;


        }





    }



}

