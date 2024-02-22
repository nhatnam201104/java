package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.controllerColor;
import model.modelColor;

public class viewColor extends JFrame {
    private JLabel label;
    private JButton btn_1;
    private JButton btn_2;
    private JButton btn_3;
    private JButton btn_4;
    private JButton btn_5;
    private JButton btn_6;
    private JPanel panel;
    private JPanel gridpanel;
    private controllerColor control;
    public Font font =new Font("Arial",Font.BOLD,20);
    public viewColor()
    {
        this.setSize(700, 900);
        init();
        this.setVisible(true);
    }
    
    public void init() {
        // tao khung
        panel =new JPanel(new BorderLayout());
        gridpanel =new JPanel(new GridLayout(2,3));

        // tao nut
        btn_1 =new JButton("red color");
        btn_2 =new JButton("yellow color");
        btn_3 =new JButton("green color");
        btn_4 =new JButton("red background");
        btn_5 =new JButton("yellow background");
        btn_6 =new JButton("green background");
        label =new JLabel("Text",JLabel.CENTER);

        // them nut
        gridpanel.add(btn_1);
        gridpanel.add(btn_2);
        gridpanel.add(btn_3);
        gridpanel.add(btn_4);
        gridpanel.add(btn_5);
        gridpanel.add(btn_6);
        panel.add (label,BorderLayout.NORTH);
        panel.add (gridpanel,BorderLayout.CENTER);
        this.add(panel);
        ///tao font
        btn_1.setFont(font);
        btn_1.setForeground(Color.red);
        btn_2.setFont(font);
        btn_2.setForeground(Color.yellow);
        btn_3.setFont(font);
        btn_3.setForeground (Color.green);
        btn_4.setFont(font);
        btn_4.setBackground(Color.red);
        btn_5.setFont(font);
        btn_5.setBackground(Color.yellow);
        btn_6.setFont(font);
        btn_6.setBackground(Color.GREEN);
        label.setFont(font);
        // them su kien
        ActionListener Ac =new controllerColor(this);
        btn_1.addActionListener(Ac);
        btn_2.addActionListener(Ac);
        btn_3.addActionListener(Ac);
        btn_4.addActionListener(Ac);
        btn_5.addActionListener(Ac);
        btn_6.addActionListener(Ac);

    }
    public void changeColor (Color color) {
        label.setForeground(color);
    }
    public void changeBackground (Color color) {
        System.out.println("J");
        label.setBackground(color);
        



    }

}