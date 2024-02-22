package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.viewLastbtn;

public class controlerLastbtn implements ActionListener {
    private viewLastbtn vw;

    public controlerLastbtn(viewLastbtn vw) {
        this.vw = vw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // int sr = e.getActionCommand();
        // System.out.println("Ban da bam nut"+e);
        vw.changeText(e.getActionCommand());
    }
}
