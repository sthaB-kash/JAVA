/*
Write a awt program to create a frame and add two buttons, a
label on a frame and set background color of a frame
 */
package lab6;

import java.awt.*;
import javax.swing.*;
class Q1 extends JFrame{
    Q1() {
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        b1.setBounds(200,200, 100, 50);
        b2.setBounds(350, 200, 100, 50);
        add(b1);
        add(b2);
        JLabel lbl = new JLabel("this is label");
        lbl.setBounds(30, 30, 100, 20);
        add(lbl);
        setBackground(Color.blue);
//        this.setBackground(Color.red);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main (String args[]){
        new Q1();
    }
    
}
