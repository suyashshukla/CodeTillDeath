package TCS;

import java.util.Scanner;

public class Roman {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        String ref = "IVXLCDM";

        int i = 0;
        int sum = 0;

        if(num.contains("L") ||
                num.contains("C") ||
                num.contains("D") ||
                num.contains("M") ||
                num.contains("I") ||
                num.contains("V") ||
                num.contains("X")) {

            while (i < num.length() - 1) {

                char ch = num.charAt(i);
                char x = num.charAt(i + 1);

                if (ref.indexOf(x) <= ref.indexOf(ch)) {
                    sum = sum + getValue(ch);
                    i++;
                }
                else{
                    sum = sum + getValue(x) - getValue(ch);
                    i+=2;
                }
            }

            System.out.println(sum);

        }
        else{
            System.out.println("Invalid Input");
        }


    }

    public static int getValue(char ch) {

        int value;

        switch (ch) {

            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            default:
                value = -1;
                break;
        }

        return value;
    }
}
