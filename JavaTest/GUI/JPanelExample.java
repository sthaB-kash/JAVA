//add components such as label button, panel then panel to frame

import java.awt.*;
import javax.swing.*;

class SwingDemo extends JFrame {
    public static void main(String args[]){
        JFrame f = new JFrame("This is frame name");
        JButton btn1, btn2, btn3;
        btn1 = new JButton("btn 1");
        btn2 = new JButton("btn 2");
        btn3 = new JButton("btn 3");

        JLabel l = new JLabel("label");

        JPanel p = new JPanel();
        p.add(l);
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.setBackground(Color.blue);

        f.add(p);
        p.add(new JButton("new button"));
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}