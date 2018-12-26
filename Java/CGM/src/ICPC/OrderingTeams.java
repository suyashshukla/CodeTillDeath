package ICPC;

import java.util.Arrays;
import java.util.Scanner;

public class OrderingTeams {

    public static void colSort(int arr[][], int column){

        for(int i = 0;i<3;i++){
            for(int j = 0;j<2;j++){

                if(arr[j][column] < arr[j+1][column]){

                    for(int k = 0;k<3;k++){

                        int temp = arr[j][k];
                        arr[j][k] = arr[j+1][k];
                        arr[j+1][k] = temp;

                    }
                }

                else if(arr[j][column] == arr[j+1][column] && column!=2){

                    colSort(arr,column+1);

                }
            }
        }
    }

    public static void rowSort(int arr[][], int row){

        for(int i = 0;i<3;i++){
            for(int j = 0;j<2;j++){

                if(arr[row][j] < arr[row][j+1]){

                    for(int k = 0;k<3;k++){

                        int temp = arr[k][j];
                        arr[k][j] = arr[k][j+1];
                        arr[k][j+1] = temp;

                    }
                }

                else if(arr[row][j] == arr[row][j+1] && row!=2){

                    colSort(arr,row+1);

                }
            }
        }
    }



public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();


    while(T!=0){

        int num[][] = new int[3][3];

        boolean flag = true;

        String str;

        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
               num[i][j] = sc.nextInt();
            }
        }

               rowSort(num,0);
        colSort(num,0);


for(int i = 0;i<3;i++) {

        int x = num[0][i];
        int y = num[1][i];
        int z = num[2][i];


        if (x<y || x<z || y<z) {
            flag = false;
            break;
        }

    }

            if(flag) {
                for (int i = 0; i < 2; i++) {

                    if(num[i][0] == num[i+1][0] &&
                            num[i][1] == num[i+1][1] &&
                            num[i][2] == num[i+1][2]) {
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
