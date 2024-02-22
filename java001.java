import javax.swing.JButton;
import javax.swing.JFrame;
public class java001 {
    JButton button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("hello");
        frame.setSize(400, 300);
        frame.setLocation(300,300);
        // int i=0;
        // while (true) {
        // System.out.println(i++);
        // }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}