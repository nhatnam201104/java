package practiceNhuLoan;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class bai3 extends JFrame {
    JButton btn ;
    public bai3() {
        init();
        this.setVisible(true);
    }

    void init() {
        this.setSize(500, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(3, 3,5,10);
        this.setLayout(layout);
        // create component
        for (int i = 1; i <= 8; i++) {
            btn = new JButton("Press " + i);
            this.add(btn);
        }
     



    }
    public static void main(String[] args) {
        bai3 test =new bai3();
    }
}