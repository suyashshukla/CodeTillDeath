package Codechef;

import java.io.*;

public class IO {

    public static void main(String args[]) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("D:\\Suyash\\intnship.txt"));

        FileReader fr = new FileReader("D:\\Suyash\\intnship.txt");
        BufferedReader br = new BufferedReader(fr);

        File newFile = new File("D:\\Suyash\\utkarsh.doc");
        FileOutputStream fileOutputStream = new FileOutputStream(newFile);

        fileOutputStream.write(52);

        FileWriter fw = new FileWriter(newFile);
        fw.write(br.readLine());

        BufferedWriter bw = new BufferedWriter(fw);

        bw.newLine();
        bw.write("Suyash Shukal");
        bw.close();


        FileOutputStream fO = new FileOutputStream("D:\\Suyash\\checking.txt");

        PrintStream printStream = new PrintStream(fO);

        printStream.println("Utkasrh Mishra IT Third year");

        printStream.close();

        fw.close();
    }
}
