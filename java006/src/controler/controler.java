package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.counterView;

public class controler implements ActionListener{
    counterView ctv;

    public controler (counterView ctv) {
        this.ctv =ctv;
    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Up")){
            ctv.increase();
        }
        else if (e.getActionCommand().equals("Down")) {
            ctv.decrease();
        }
    }

   
    
}
