package CGM;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Scaling extends Component {

    Graphics2D graphic;

    static int p[][];
    static int pt[][];

    public void paint(Graphics G){

        graphic = (Graphics2D)G;

        int x1 = p[0][0];
        int x2 = p[1][0];
        int x3 = p[2][0];

        int y1 = p[0][1];
        int y2 = p[1][1];
        int y3 = p[2][1];

        int x1s = pt[0][0];
        int x2s = pt[1][0];
        int x3s = pt[2][0];

        int y1s = pt[0][1];
        int y2s = pt[1][1];
        int y3s = pt[2][1];


        //Original Triangle


        graphic.setColor(Color.BLACK);

        graphic.drawLine(x1,y1,x2,y2);
        graphic.drawLine(x2,y2,x3,y3);
        graphic.drawLine(x3,y3,x1,y1);

        //Transalation Line

        graphic.setColor(Color.RED);

        graphic.drawLine(x1s+50,y1s+50,x2s+50,y2s+50);
        graphic.drawLine(x2s+50,y2s+50,x3s+50,y3s+50);
        graphic.drawLine(x3s+50,y3s+50,x1s+50,y1s+50);


    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        p = new int[3][2];
        pt= new int[3][2];

        System.out.println("Triangle Points : ");

        //Input data
        for(int i = 0;i<3;i++){
            for(int j = 0;j<2;j++){
                p[i][j] = sc.nextInt();
            }
        }

        System.out.println("Scaling Factors : ");

        //Input Scaling Factor
        int sx = sc.nextInt();
        int sy = sc.nextInt();

        //Scaling
        for(int i = 0;i<3;i++){

            pt[i][0] = sx * p[i][0];
            pt[i][1] = sy * p[i][1];

        }

        int frameWidth = 300;
        int frameHeight = 300;

        JFrame frame = new JFrame();
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
        frame.getContentPane().add(new Scaling());

    }


}
