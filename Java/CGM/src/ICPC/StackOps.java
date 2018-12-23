package ICPC;

import java.util.Scanner;
import java.util.Stack;

public class StackOps {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){

            int N = sc.nextInt();

            int ops;
            boolean flag = true;
            Stack<Integer> stack = new Stack<>();

            for(int i = 0;i<N;i++) {

                ops = sc.nextInt();

                try {

                    switch (ops) {
                        case 1:
                            stack.push(i);
                            break;
                        case 0:
                            stack.pop();
                            break;
                    }
                }

                catch (Exception e){
                    flag = false;
                }

            }

            if(flag)
                System.out.println("Valid");
            else
                System.out.println("Invalid");

            T--;
            }

            }
        }

