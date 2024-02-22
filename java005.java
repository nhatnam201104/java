import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class java005 extends JFrame {
    java005() {
        this.setLayout(new GridLayout(3, 4));
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    void create() {
        JButton btn;
        int cnt = 7;
        for (int i = 1; i <= 12; i++) {
            System.out.println(cnt);
            switch (i) {
                case 4:
                    btn = new JButton("x");
                    this.add(btn);
                    cnt -= 6;
                    break;
                case 8:
                    btn = new JButton("-");
                    this.add(btn);
                    cnt -= 6;
                    break;
                case 12:
                    btn = new JButton("+");
                    this.add(btn);
                    cnt -= 6;
                    break;

                default:
                    btn = new JButton(cnt++ + "");
                    this.add(btn);
                    break;
            }
        }
    }
    public static void main(String[] args) {
        java005 jv=new java005();
        jv.create();
    }
}
