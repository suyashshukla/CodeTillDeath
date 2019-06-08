package PPL;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        ArrayList<String> combo = new ArrayList<>();

        combo.add("012");
        combo.add("345");
        combo.add("678");
        combo.add("048");
        combo.add("246");
        combo.add("036");
        combo.add("147");
        combo.add("258");

        String X = "";
        String Y = "";

        int index = 0;

        boolean flag = false;

        for(int i = 0;i<3;i++){

            if(flag)
                break;
            for(int j = 0;j<3;j++){

                if(arr[i][j]==0) {
                    Y = Y.concat(index + "").concat("");
                }
                else if(arr[i][j]==1){
                    X = X.concat(index + "").concat("");
                }

                index++;

                if(combo.contains(X)) {
                    System.out.println("X");
                    flag = true;
                    break;
                }
                    if(combo.contains(Y)) {
                        System.out.println("Y");
                        flag = true;
                        break;
                    }
                }

            }

        System.out.println();
        }
    }

