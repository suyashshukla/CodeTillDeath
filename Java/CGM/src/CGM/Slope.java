package CGM;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Slope extends Component {

    Graphics2D graphic;

    static int p[][];
    static int pt[][];
    static int index;

    public void paint(Graphics G){

        graphic = (Graphics2D)G;

        graphic.setColor(Color.BLACK);

        for(int i = 0 ; i<100;i++){
                graphic.drawLine(pt[i][0],pt[i][0],pt[i][1],pt[i][1]);

        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        p = new int[2][2];
        pt= new int[100][2];
        int t[] = new int [2];

        System.out.println("Line Points : ");

        //Input data
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                p[i][j] = sc.nextInt();
            }
        }

        int x1 = p[0][0];
        int x2 = p[1][0];

        int y1 = p[0][1];
        int y2 = p[1][1];

        //Slope Calculation
        double m = (y2-y1)/(x2-x1);


int xind = 0; int yind = 0;
        //Points Calculation
        for(int i = 1;i<=x2;i++) {

            yind = 0;

            int y = (int)m*(i-x1);

            pt[xind][yind++] = i;
            pt[xind++][yind] = y;

        }

        int frameWidth = 300;
        int frameHeight = 300;

        JFrame frame = new JFrame();
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
        frame.getContentPane().add(new Slope());

    }


}
