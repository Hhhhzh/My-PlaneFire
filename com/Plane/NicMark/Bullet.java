package com.Plane.NicMark;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Bullet extends Component {
    int[] planeX = new int [400];
    int[] planeY = new int [700];
    int[] fireY  = new int [900];
    int fireX=planeX[0];
    public void init(){
        planeX[0] = 175;
        planeY[0] = 700;
        fireX=planeX[0];
        fireY[0] = planeY[0]-25;
    }

    protected void paintComponent(Graphics g){
        Data.bull.paintIcon(this, g, fireX, fireY[0]);
    }
    public void actionPerformed(ActionEvent e){

    }
}
