package CGM;

import java.awt.*;
import javax.swing.*;
import java.util.*;

class Bressenhams extends Component{

    Graphics2D graphic;

    static int x[];
    static int y[];

    public void paint(Graphics g){

        graphic = (Graphics2D)g;

        graphic.setColor(Color.BLACK);

        for(int i = 0 ;i<x.length;i++){

            int xabs=0,yabs=0;
            xabs = Math.abs(x[i]);
            yabs = Math.abs(y[i]);
            graphic.drawLine(xabs,yabs,xabs,yabs);


        }

    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Starting Point");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("End Point");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double dy = Math.abs(y2-y1);
        double dx = Math.abs(x2-x1);

        System.out.println(dx+" "+dy);

        int step=0;
        double p;
        boolean dec=true;

        p = 2*dy - dx;

        if(dx>=dy){

            step = Math.abs((int)dx);
            dec = true;

        }
        else if(dx<dy){
            dec = false;
            step = Math.abs((int)dy);
        }

        int xrr[] = new int[step];

        int yrr[] = new int[step];

        System.out.println(step);

        double xk,yk,xi = 0,yi=0;

        int index = 0;

        while(x1!=x2 && y1!=y2){

            if(dec && p<0) {
                xi = 1;
                yi = 0;
            }

            else if(dec && p>=0){
                xi = 1;
                yi = 1;
            }

            else if(!dec && p<0){
                xi = 0;
                yi = 1;
            }

            else if(!dec && p>=0){
                xi = 1;
                yi = 1;
            }

            if(dec && x2<x1 || !dec && x2<x1){
                xk = x1 - xi;
                yk = y1 - yi;
            }
            else  {
                xk = x1 + xi;
                yk = y1 + yi;
            }


            xrr[index] = (int)Math.round(xk);
            yrr[index] = (int)Math.round(yk);

            System.out.println(xrr[index]+" , "+yrr[index]);
            x1 = xk;
            y1 = yk;

            double po = p;

            double px;

            if(p<0) {
                px = dec ? -2 * dx : 2 * dy;
                p = po + px;
            }

            else if(p>=0) {
                p = po + 2 * (dy - dx);
            }

            index++;

        }

        DDA.x = xrr;
        DDA.y = yrr;

        int frameWidth = 300;
        int frameHeight = 300;

        JFrame frame = new JFrame();
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
        frame.getContentPane().add(new DDA());

    }

}
