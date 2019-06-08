package PPL;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Write extends Thread {

    @Override
    public void run() {
        super.run();

        try {
            FileWriter fw = new FileWriter("D://PPL//thread.txt");

            fw.write("\nI am writing on this file "+new Date().toString()+"\n");
            fw.close();
            Main.s = 1;
            System.out.println("Writing Ends!");

        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}
