package PPL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Read extends Thread {

    @Override
    public void run() {
        super.run();

        try {
            while(Main.s!=1);
            FileReader fr = new FileReader("D://PPL//thread.txt");

            Scanner sc = new Scanner(fr);
            while (sc.hasNext())
            System.out.print(sc.next()+" ");

            System.out.println();
            System.out.println("Reading Ends!");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
