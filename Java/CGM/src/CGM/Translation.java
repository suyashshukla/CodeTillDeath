package CGM;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Translation extends Component {

    Graphics2D graphic;

    static int p[][];
    static int pt[][];
    static int index;

    public void paint(Graphics G){

        graphic = (Graphics2D)G;

        graphic.setColor(Color.BLACK);

        //Original Line

       graphic.drawLine(p[0][0],p[0][1],p[1][0],p[1][1]);

        //Transalation Line

        graphic.setColor(Color.CYAN);

        graphic.drawLine(pt[0][0],pt[0][1],pt[1][0],pt[1][1]);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        p = new int[2][2];
        pt= new int[2][2];
        int t[] = new int [2];

        System.out.println("Line Points : ");

        //Input data
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
               p[i][j] = sc.nextInt();
            }
        }

        //Input Translation Factor
        for(int i = 0;i<2;i++){
            t[i] = sc.nextInt();
        }

        //Translation
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                pt[i][j] = p[i][j] + t[j];
            }
        }

        int frameWidth = 300;
        int frameHeight = 300;

        JFrame frame = new JFrame();
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
        frame.getContentPane().add(new Translation());

    }


}
