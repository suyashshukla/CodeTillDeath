package CGM;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MidPointCircle extends Component {

    Graphics2D graphic;

    static int xp[];
    static int yp[];
    static int index;

    public void paint(Graphics G){

        graphic = (Graphics2D)G;

        graphic.setColor(Color.BLACK);

        for(int i = 0 ;i<index;i++){

            System.out.println(xp[i]+ " : "+yp[i]);

            graphic.drawLine(xp[i]+100,yp[i]+100,xp[i]+100,yp[i]+100);

        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Radius");
        int r = sc.nextInt();

        double po = 1-r;

        double x = 0;
        double y = r;

        double pk;

        xp = new int[(8*r)+4];
        yp = new int[(8*r)+4];

        xp[0] = 0;
        yp[0] = r;

        xp[1] = r;
        yp[1] = 0;

        xp[2] = 0;
        yp[2] = -r;

        xp[3] = -r;
        yp[3] = 0;

        index = 4;


        pk = po;

        while(x!=y){

            System.out.println(x+" : "+y+" : "+pk);


            if(pk<0) {
                x = x + 1;
                y = y - 1;
                pk = pk + (2 * x) + 1;
            }
            else {
                x = x + 1;
                pk = pk + (2 * (x - y)) + 1;
            }

            int pointx = (int)x;
            int pointy = (int)y;

            //First Quadrant

            xp[index] = pointx;
            yp[index] = pointy;

            xp[index+1] = pointy;
            yp[index+1] = pointx;

            //Fourth Quadrant

            pointy = -pointy;

            xp[index+2] = pointx;
            yp[index+2] = pointy;

            xp[index+3] = pointy;
            yp[index+3] = pointx;

            //Third Quadrant
            pointx = -pointx;

            xp[index+4] = pointx;
            yp[index+4] = pointy;

            xp[index+5] = pointy;
            yp[index+5] = pointx;

            //Second Quadarnt

            pointy = -pointy;

            xp[index+6] = pointx;
            yp[index+6] = pointy;

            xp[index+7] = pointy;
            yp[index+7] = pointx;

            index+=8;

        }

        int frameWidth = 200;
        int frameHeight = 200;

        JFrame frame = new JFrame();
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
        frame.getContentPane().add(new MidPointCircle());

    }


}
