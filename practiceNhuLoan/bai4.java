package practiceNhuLoan;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class bai4 extends JFrame {
    bai4 ()
    {
        init ();
        this.setVisible(true);
    }
    void init ()
    {
        this.setSize(400,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        BorderLayout layout =new BorderLayout();
        JButton btn1 =new JButton("top");
        JButton btn2 =new JButton("left");
        JButton btn3 =new JButton("right");
        JButton btn4 =new JButton("center");
        JButton btn5 =new JButton("bottom");
        this.setLayout(layout);
        this.add (btn1,BorderLayout.NORTH );
        this.add (btn2,BorderLayout.WEST );
        this.add (btn3,BorderLayout.EAST );
        this.add (btn4,BorderLayout.CENTER );
        this.add (btn5,BorderLayout.SOUTH );

    }
    public static void main(String[] args) {
        bai4 test =new bai4();
    }
}
