import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class java002 extends JFrame {
    public java002() {
        this.setSize(600, 400);
        this.setTitle("flowLayout");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT,50,50);
        this.setLayout(layout);
    }

    void addBtn(int soluong) {
        for (int i = 0; i < soluong; i++) {
            JButton btn = new JButton(i + "");
            this.add(btn);
        }
    }
    
    public static void main(String[] args) {
        java002 flow = new java002();
        flow.addBtn(4);
        
    }
  
}
