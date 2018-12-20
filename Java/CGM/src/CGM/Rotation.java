package CGM;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Rotation extends Component {

    Graphics2D graphic;

    static int p[][];
    static int pt[][];

    public void paint(Graphics G){

        graphic = (Graphics2D)G;


        //Original Line

        graphic.setColor(Color.BLACK);

        graphic.drawLine(p[0][0]+150,p[0][1]+150,p[1][0]+150,p[1][1]+150);

        //Rotated Line

        graphic.setColor(Color.RED);

        graphic.drawLine(pt[0][0]+150,pt[0][1]+150,pt[1][0]+150,pt[1][1]+150);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        p = new int[2][2];
        pt= new int[2][2];
        double theta;

        int tx,ty;

        System.out.println("Line Points : ");

        //Input data
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                p[i][j] = sc.nextInt();
            }
        }

        tx=p[0][0];
        ty=p[0][1];

        System.out.println("Rotation Angle : ");

        //Input Rotation Factor
        theta = sc.nextDouble();

        theta = Math.toRadians(theta);

        double cos = Math.cos(theta);
        double sin = Math.sin(theta);

        //Translation to Origin
        pt[0][0] = p[0][0] - tx;
        pt[0][1] = p[0][1] - ty;
        pt[1][0] = p[1][0] - tx;
        pt[1][1] = p[1][1] - ty;

        new Rotation().print();
        new Rotation().printT();

        //Rotation
        int x = pt[1][0];
        int y = pt[1][1];

            pt[1][0] = (int)(x*cos - y*sin);
            pt[1][1] = (int)(x*sin + y*cos);

        new Rotation().print();
        new Rotation().printT();

        //Back Translation
        pt[0][0] = pt[0][0] + tx;
        pt[0][1] = pt[0][1] + ty;
        pt[1][0] = pt[1][0] + tx;
        pt[1][1] = pt[1][1] + ty;

        new Rotation().print();
        new Rotation().printT();

        int frameWidth = 300;
        int frameHeight = 300;

        JFrame frame = new JFrame();
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
        frame.getContentPane().add(new Rotation());

    }


    public void print() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(p[i][j] + " ");
            }
        }
    }

        public void printT(){
            for(int i = 0;i<2;i++){
                for(int j = 0;j<2;j++){
                    System.out.print(pt[i][j]+" ");
                }
            }
        }
    }


