package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.modelColor;
import view.viewColor;

public class controllerColor implements ActionListener {
    private viewColor view;
    private modelColor model ;

    public controllerColor(viewColor view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model =new modelColor();
        String event = e.getActionCommand();
        String src[] = event.split(" ");
        if (src[1].equalsIgnoreCase("color")) {
            model.setForeground(src[0]);
            System.out.println(src[0]);
            view.changeColor(model.getForeground());

        } else if (src[1].equalsIgnoreCase("background")) {
            model.setBackground(src[0]);
            System.out.println(model.getBackground());
            view.changeBackground(model.getBackground());
        }

    }

}
