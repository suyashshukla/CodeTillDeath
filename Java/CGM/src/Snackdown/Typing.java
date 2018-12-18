package Snackdown;

import java.util.ArrayList;
import java.util.Scanner;

public class Typing {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        String l = "df";
        String r = "jk";
        char hand = ' ';

        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> wTime = new ArrayList<>();

        while(T!=0){

            int N = sc.nextInt();

            String arr[] = new String[N];
            int time = 0;
            int total = 0;
            String word = "";
            words.clear();
            wTime.clear();

            for(int i = 0;i<N;i++)
                arr[i] = sc.next();



            for(int i = 0;i<N;i++){
                String str = arr[i];

                if(words.indexOf(str)>=0){
                    total = total + wTime.get(words.indexOf(str))/2;
                    time = 0;
                    word = "";
                    continue;
                }


                for(int j = 0;j<str.length();j++){
                    char ch = str.charAt(j);



//First Character Operation
                    if(j==0) {
                        if(l.contains(ch+""))
                            hand = 'l';
                        else
                            hand = 'r';

                        time = time + 2;
                        word = word + ch;
                    }


                    //Rest Character Operations
                    else{
                        if(hand=='l'){
                            if(l.contains(ch+"")) {
                                time = time + 4;
                            }
                            else {
                                time = time + 2;
                                hand = 'r';
                            }

                            word = word + ch;
                        }
                        else{
                            if(l.contains(ch+"")) {
                                time = time + 2;
                                hand = 'l';
                            }
                            else {
                                time = time + 4;
                            }

                            word = word + ch;
                        }
                    }

                    //Last Character Operation

                    if(j==str.length()-1){
                        words.add(word);
                        wTime.add(time);
                        total = total + time;
                        word = "";
                        time = 0; 
                    }
                }
            }



            System.out.println(total);
            T--;
        }




    }

}
