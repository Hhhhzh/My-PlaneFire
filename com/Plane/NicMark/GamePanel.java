package com.Plane.NicMark;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

public class GamePanel extends JPanel implements KeyListener, ActionListener {
    boolean isStart = false;
    boolean fire = false;
    int[] planeX = new int [400];
    int[] planeY = new int [700];
    int[] fireY  = new int [900];
    int[] fireX= new int [100];
    int[] firenum = new int[100];
    int j = 1;
    int i =0;
    String fx = "R";

    Timer timer = new Timer(2000,this);
   java.util.List<Bullet> bullets = new ArrayList<Bullet>();
    public GamePanel(){init();this.setFocusable(true);this.addKeyListener(this);timer.start();}
    public void init(){
        planeX[0] = 175;
        planeY[0] = 700;
        fireX[0]=planeX[0];
        Arrays.fill(firenum,planeY[0]);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        this.setForeground(Color.WHITE);
        g.fillRect(0,0,500,900);
        Data.plane.paintIcon(this,g,planeX[0],planeY[0]);


        if(isStart==false){
            g.setColor(Color.black);
            g.setFont(new Font("微软雅黑",Font.BOLD,20));
            g.drawString("按下空格开始游戏",100,200);
        }
        for (int i = 0; i < firenum.length; i++) {
            Data.bull.paintIcon(this, g, fireX[i], firenum[i]);
        }



    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode==KeyEvent.VK_SPACE){
            isStart = !isStart;
            repaint();
        }
        if(keyCode==KeyEvent.VK_RIGHT){
            fx = "R";
        }else if(keyCode==KeyEvent.VK_LEFT){
            fx = "L";
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {}



    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart == true) {
            if (fx.equals("R")) {
                planeX[0] = planeX[0] + 25;
            } else if (fx.equals("L")) {
                planeX[0] = planeX[0] - 25;
            }
            for (int i = j; i >0 ; i--) {
                firenum[i-1] = firenum[i] - 25;
                j++;
            }fireX[j] = planeX[0];

            repaint();
            timer.start();
        }
    }
}
