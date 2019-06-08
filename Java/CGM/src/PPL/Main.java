package PPL;

import java.util.concurrent.Semaphore;

public class Main {

    static int s = 0;

    public static void main(String []args){

        Read r = new Read();
        Write w = new Write();

        System.out.println("Writing Starts..");
        w.run();

        System.out.println("Reading Starts..");
        r.run();

    }
}
