package practiceNhuLoan;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class bai5 extends JFrame {
    bai5() {
        init();
        this.setVisible(true);
    }

    void init() {
        this.setSize(500, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create component

        JLabel label1 = new JLabel("Enter username");
        JLabel label2 = new JLabel("Enter password");
        JTextField text = new JTextField(30);
        JTextField text1 = new JTextField(30);
        JPanel container1 = new JPanel(new FlowLayout(1,30,20));
        JPanel container2 = new JPanel(new FlowLayout());
        JPanel container3 =new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel wrapper =new JPanel(new FlowLayout());
        JButton btn =new JButton("login");
        container1.add(label1);
        container1.add(text);
        container2.add(label2);
        container2.add(text1);
        container3.add (btn);
        wrapper.setBorder(BorderFactory.createTitledBorder("Login panel"));
        wrapper.add(container1);
        wrapper.add(container2);
        wrapper.add (container3);
        
        this.add(wrapper);
    }
    
    public static void main(String[] args) {
        bai5 test =new bai5();
    }
}
