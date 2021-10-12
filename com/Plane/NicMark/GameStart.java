package com.Plane.NicMark;

import javax.swing.*;

public class GameStart {
    public static void main(String[] args) {
        JFrame frame = new JFrame("NicMark`s PlaneFire");
        frame.setBounds(5,5,500,900);
        frame.setResizable(false);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GamePanel());
        frame.setVisible(true);
    }
}
