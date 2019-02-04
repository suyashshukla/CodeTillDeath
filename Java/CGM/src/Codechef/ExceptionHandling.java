package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {

    public static void main(String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true){

            try {
                System.out.println("_");
                String str = br.readLine();

                int num = Integer.parseInt(str);

                break;
            }
            catch (NumberFormatException e){
                System.out.println("Input isn't an Integer");
            }




        }





    }

}
