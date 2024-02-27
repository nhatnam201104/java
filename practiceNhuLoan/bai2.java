package practiceNhuLoan;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
    
import java.awt.*;
import java.awt.FlowLayout;

public class bai2 extends JFrame {

    public bai2() {
        init();
        this.setVisible(true);

    }

    public void init() {
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create component
        JLabel label1 = new JLabel("Enter your name");
        JLabel label2 = new JLabel("Enter your city");
        JTextField text = new JTextField(20);
        JTextField text2 = new JTextField(20);
        JButton btn1 = new JButton("Clear");
        JButton btn2 = new JButton("Submit");
        JButton btn3 = new JButton("Exit");
        JPanel container1 = new JPanel(new FlowLayout());
        JPanel container2 = new JPanel(new FlowLayout());
        JPanel container3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel wrapper =new JPanel(new FlowLayout());
        container1.add(label1);
        container1.add(text);
        container2.add(label2);
        container2.add(text2);
        container3.add(btn1);
        container3.add(btn2);
        container3.add(btn3);
        wrapper.add(container1);
        wrapper.add(container2);
        wrapper.add(container3);
        this.add(wrapper);  
    }

    public static void main(String[] args) {
        bai2 test = new bai2();
    }
}
