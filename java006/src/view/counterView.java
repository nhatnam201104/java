package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controler.controler;
import model.countModel;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class counterView extends JFrame {
    private JButton btnUp;
    private JButton btnDown;
    private JLabel label;
    private JPanel panel;
    private countModel cmd;

    public counterView() {
        this.cmd = new countModel();
        init();
        this.setVisible(true);

    }

    public void init() {
        /// tao khung
        this.setSize(700, 400);
        this.setTitle("Counter");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // tao cac nut
        panel = new JPanel(new BorderLayout());
        btnUp = new JButton("Up");
        btnDown = new JButton("Down");
        label = new JLabel(cmd.getCount() + "", JLabel.CENTER);

        // Them cac nut
        panel.add(btnUp, BorderLayout.EAST);
        panel.add(label, BorderLayout.CENTER);
        panel.add(btnDown, BorderLayout.WEST);
        this.add(panel);

        // Them su kien
        ActionListener ac = new controler(this);
        btnUp.addActionListener(ac);
        btnDown.addActionListener(ac);
    }

    public void increase() {
        this.cmd.increase();
        this.label.setText(this.cmd.getCount() + "");
    }

    public void decrease() {
        this.cmd.decrease();
        this.label.setText(this.cmd.getCount() + "");
    }
}
