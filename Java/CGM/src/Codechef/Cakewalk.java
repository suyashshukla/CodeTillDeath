package Codechef;


        import java.util.Scanner;

public class Cakewalk {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int count = 0;

            for(int i = 0;i<10;i++){
                for(int j = 0;j<10;j++){
                    int num = sc.nextInt();

                    if(num<=30)
                        count++;
                }
            }

            if(count>=60)
                System.out.println("yes");
            else
                System.out.println("no");

            T--;
        }

    }

}
