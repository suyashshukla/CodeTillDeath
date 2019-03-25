package PPL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Read extends Thread {

    @Override
    public void run() {
        super.run();

        try {
sleep(10000);
            FileReader fr = new FileReader("D://PPL//thread.txt");

            Scanner sc = new Scanner(fr);
            System.out.println();
            while (sc.hasNext())
            System.out.println(sc.next()+" ");
        }
        catch (FileNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }


    }
}
