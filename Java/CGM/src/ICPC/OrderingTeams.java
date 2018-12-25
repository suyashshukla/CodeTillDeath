package ICPC;

import java.util.Arrays;
import java.util.Scanner;

public class OrderingTeams {


    public static void sort(int arr[][],int column){

        for(int i = 0 ;i<3;i++){
            for(int j = 0;j<2;j++){
                if(arr[j][column] > arr[j+1][column]){

                    for(int k = 0;k<3;k++) {
                        int temp = arr[j][k];
                        arr[j][k] = arr[j + 1][k];
                        arr[j + 1][k] = temp;
                    }
                }

                else if(arr[j][column] == arr[j+1][column]){
                }

            }
        }


    }

    public static void swap(){}


public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    while(T!=0){


        int x[][] = new int[3][3];
        int y[][] = new int[3][3];
        int z[][] = new int[3][3];

        boolean flag = true;

        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                int num = sc.nextInt();
                x[i][j] = num;
                y[i][j] = num;
                z[i][j] = num;
            }
        }

        if(x[0][0] == x[1][0] || x[1][0] == x[2][0] || x[0][0] == x[2][0]){

            if(x[0][1] == x[1][1] || x[1][1] == x[2][1] || x[0][1] == x[2][1]) {
                Arrays.sort(x, (o1, o2) -> Integer.compare(o1[2], o2[2]));
            }
            else{
                Arrays.sort(x, (o1, o2) -> Integer.compare(o1[1], o2[1]));
            }
        }
        else {
            Arrays.sort(x, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        }

        for(int i = 0;i<3;i++){
            System.arraycopy(x[i], 0, y[i], 0, 3);
        }

        Arrays.sort(y, (o1, o2) -> Integer.compare(o1[1],o2[1]));

        for(int i = 0;i<3;i++){
            flag = Arrays.equals(x[i],y[i]);
            if(!flag)
                break;
        }

        if(flag) {
            for (int i = 0; i < 3; i++) {
                System.arraycopy(y[i], 0, z[i], 0, 3);
            }
        }

        if(flag) {
            Arrays.sort(z, (o1, o2) -> Integer.compare(o1[2], o2[2]));


            for (int i = 0; i < 3; i++) {
                flag = Arrays.equals(y[i], z[i]);
                if (!flag)
                    break;
            }
        }

        if(flag) {
            for (int i = 0; i < 2; i++) {
                if (z[i][0] == z[i + 1][0] &&
                        z[i][1] == z[i + 1][1] &&
                        z[i][2] == z[i + 1][2]) {
                    flag = false;
                    break;
                }

            }
        }

        if(flag)
            System.out.println("yes");
        else
            System.out.println("no");



        T--;

    }
}

}
