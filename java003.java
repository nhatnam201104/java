import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class java003 extends JFrame {
    java003() {
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    void CreateCaculate() {
        JPanel wrapper = new JPanel(new BorderLayout());
        JPanel head = new JPanel();
        JPanel tail = new JPanel(new BorderLayout());
        JPanel north = new JPanel(new FlowLayout());
        JPanel center = new JPanel(new GridLayout(3, 4));
        JPanel south = new JPanel(new FlowLayout());
        // head
        JTextField text = new JTextField(150);
        head.add(text);
        // tail
        // north;
        JButton n[] = new JButton[4];
        n[0] = new JButton("AC");
        n[1] = new JButton("+/-");
        n[2] = new JButton("%");
        n[3] = new JButton("/");
        for (int i = 0; i < 4; i++) {
            north.add(n[i]);
        }

        // center
        JButton btn;
        int cnt = 7;
        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 4:
                    btn = new JButton("x");
                    center.add(btn);
                    cnt -= 6;
                    break;
                case 8:
                    btn = new JButton("-");
                    center.add(btn);
                    cnt -= 6;
                    break;
                case 12:
                    btn = new JButton("+");
                    center.add(btn);
                    cnt -= 6;
                    break;

                default:
                    btn = new JButton(cnt++ + "");
                    center.add(btn);
                    break;
            }
        }
        // south
        n[0] = new JButton(0 + "");
        n[1] = new JButton("1/x");
        n[2] = new JButton(",");
        n[3] = new JButton("=");
        for (int i = 0; i < 4; i++) {
            south.add(n[i]);
        }

        // tail

        tail.add(north, BorderLayout.NORTH);
        tail.add(center, BorderLayout.CENTER);
        tail.add(south, BorderLayout.SOUTH);

        wrapper.add(head, BorderLayout.NORTH);
        wrapper.add(tail, BorderLayout.CENTER);
        this.add(wrapper);
    }
    public static void main(String[] args) {
        java003 jv =new java003();
        jv.CreateCaculate();
    }
}

