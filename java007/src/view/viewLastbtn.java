package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controler.controlerLastbtn;
import model.modelLastbtn;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class viewLastbtn extends JFrame {
    JButton btn[];
    JLabel label;
    JTextArea textArea;
    JPanel panel;
    JPanel btnGrid;
    modelLastbtn index;
    Font font=new Font("Arial",Font.BOLD,25) ;
  
    public viewLastbtn() {
        index = new modelLastbtn();
        init();
        this.setVisible(true);
    }

    public void init() {

        // tao khung
        this.setTitle("Last button index");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        panel = new JPanel(new BorderLayout());
        btnGrid = new JPanel(new GridLayout(2,2));
        // tao nut
        btn =new JButton[4];
        for (int i = 0; i < 4; i++) {
            btn[i] = new JButton((i + 1) + "");
            btn[i].setFont(font);

        }
        textArea = new JTextArea("");
        textArea.setFont(font);
        label = new JLabel("Title",JLabel.CENTER);
        label.setFont(font);

        // them nut
        for (int i=0;i<4;i++) {
            btnGrid.add (btn[i]);
        }
        panel.add (label,BorderLayout.NORTH);
        panel.add (btnGrid,BorderLayout.CENTER);
        panel.add (textArea,BorderLayout.SOUTH);
        this.add (panel);

        // them su kien
        ActionListener ac =new controlerLastbtn (this);
        for (int i=0;i<4;i++) {
            btn[i].addActionListener(ac);
            
        }

        
    }
    public void changeText (String s) {
        textArea.setText(s);
    }
}
