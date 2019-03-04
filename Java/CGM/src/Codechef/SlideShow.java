package Codechef;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class SlideShow {

    public static void main(String args[]) throws IOException {


        FileReader fr = new FileReader("D://hashcode//e.txt");

        FileWriter fw = new FileWriter("D://hashcode//e_in.txt");


        Scanner sc = new Scanner(fr);

        int T = sc.nextInt();


        ArrayList<Set<String>> hList = new ArrayList<>();
        ArrayList<Integer> hIndex = new ArrayList<>();

        ArrayList<Set<String>> vList = new ArrayList<>();
        ArrayList<Integer> vIndex = new ArrayList<>();

        boolean flag = true;
        boolean invert = false;


        int index = 0, vCount, hCount;
        int vSize, hSize, occur, slides;

        while (index != T) {

            char ch = sc.next().charAt(0);

            int N = sc.nextInt();


            Set<String> set = new HashSet<>();

            for (int i = 0; i < N; i++) {

                String in = sc.next();

                set.add(in);

            }

            if (ch == 'H') {
                hList.add(set);
                hIndex.add(index);
            } else {
                vList.add(set);
                vIndex.add(index);
            }

            index++;
        }

        hSize = hList.size();
        vSize = vList.size();

        occur = (int) Math.ceil((double) hSize / Math.ceil((double) vSize / 2));

        occur = occur - 1;

        if (hSize==vSize)
            flag = false;

        Calendar calendar = Calendar.getInstance();

        if(vSize == 2*hSize){
            invert = true;
        }

        slides = hSize + (int) Math.ceil((double) vSize / 2);

        vCount = 0;
        hCount = 0;

        fw.write(slides + "\n");

        for (int i = 0; i < slides; i++) {
            if (!invert) {
                if (flag) {
                    if (i % occur != 0)
                        fw.write(hIndex.get(hCount++) + "\n");

                    else
                        fw.write(vIndex.get(vCount++) + " " + vIndex.get(vCount++) + "\n");
                } else {
                    if ((i + 1) % 3 == 0)
                        fw.write(vIndex.get(vCount++) + " " + vIndex.get(vCount++) + "\n");

                    else
                        fw.write(hIndex.get(hCount++) + "\n");
                }
            }
            else{
                if (i%2==0)
                    fw.write(hIndex.get(hCount++) + "\n");

                else
                    fw.write(vIndex.get(vCount++) + " " + vIndex.get(vCount++) + "\n");
            }
        }


            fw.close();

        }

    }
