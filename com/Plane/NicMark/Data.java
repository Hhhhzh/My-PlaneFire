package com.Plane.NicMark;

import javax.swing.*;
import java.net.URL;

public class Data {
    public static URL planeurl = Data.class.getResource("/resoure/plane.png");
    public static ImageIcon plane = new ImageIcon(planeurl);
    public static URL Monsterurl = Data.class.getResource("/resoure/Monster.png");
    public static ImageIcon monster = new ImageIcon(Monsterurl);
    public static URL bullurl = Data.class.getResource("/resoure/bull.png");
    public static ImageIcon bull = new ImageIcon(bullurl);
}
