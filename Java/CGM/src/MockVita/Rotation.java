package MockVita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Rotation {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        int length = S.length();

        int q = Integer.parseInt(bufferedReader.readLine());

        String rotated;
        int subString = q;
        String fcs = "";

        boolean anagram = false;
        int m;

        while (q != 0) {

            String input = bufferedReader.readLine();

            char ch = input.trim().charAt(0);

            m = Integer.parseInt(input.trim().substring(1).trim());

            if (ch == 'R') {
                m = length - m;
            }

            m = Math.abs(m%length);

            rotated = S.substring(m).concat(S.substring(0, m));

            fcs = fcs.concat(String.valueOf(rotated.charAt(0)));

            q--;
        }

        int index = 0;

        char[] ch = fcs.toCharArray();
        Arrays.sort(ch);
        fcs = new String(ch);

        while (index + subString <= length) {
            String sub = S.substring(index, index + subString);
            ch = sub.toCharArray();
            Arrays.sort(ch);
            sub = new String(ch);

            if (sub.equals(fcs)) {
                anagram = true;
                break;
            }
            index++;
        }

        System.out.print(anagram ? "YES" : "NO");

    }
}
