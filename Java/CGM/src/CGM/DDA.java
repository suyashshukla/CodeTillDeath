package CGM;

import java.awt.*;
import javax.swing.*;
import java.util.*;

class DDA extends Component{

    Graphics2D graphic;

    static int x[];
    static int y[];
    static int index;

    public void paint(Graphics g){

        graphic = (Graphics2D)g;

        graphic.setColor(Color.BLACK);

        for(int i = 0 ;i<index;i++){

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

        double dy = (y2-y1);
        double dx = (x2-x1);

        System.out.println(dx+" "+dy);

        double m = dy/dx;

        int step=0;
        boolean dec=true;

        if(dx>=dy){
            step = Math.abs((int)dx);
            dec = true;
        }
        else if(dx<dy){
            dec = false;
            step = Math.abs((int)dy);
        }



        int xrr[] = new int[step+2];

        int yrr[] = new int[step+2];

        System.out.println(step);

        double xk,yk,xi = 0,yi=0;

        index = 0;

        xrr[index] = (int)x1;
        yrr[index++] = (int)y1;

        while(Math.round(x1)!=x2 || Math.round(y1)!=y2){

            if(dec) {
                xi = 1;
                yi = m;
            }

            else{
                xi = 1/m;
                yi = 1;
            }

if(dx<0 && dy<0){
    xk = x1 - xi;
    yk = y1 - yi;
}
else {
    xk = x1 + xi;
    yk = y1 + yi;
}


            xrr[index] = (int)Math.round(xk);
            yrr[index] = (int)Math.round(yk);

            System.out.println(xrr[index]+" , "+yrr[index]);
            x1 = xk;
            y1 = yk;
            index++;

        }

        xrr[index] = (int)x2;
        yrr[index] = (int)y2;


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
    