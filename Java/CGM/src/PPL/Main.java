package PPL;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String args[]){

        Read r = new Read();
        Write w = new Write();

        System.out.print("Reading Starts : ");
        r.run();
        System.out.print("\t\t\t\t\t\t\t\t\t\tWriting Starts : ");
        w.run();

    }
}
