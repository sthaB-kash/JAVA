/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingPractice;
import java.awt.*;
import javax.swing.*;
public class swingDemo extends JFrame {
    public static void main(String args[]) {
        JFrame f;
        JButton btn1, btn2, btn3;
        JLabel l;
        //create frame with title panel
        f = new JFrame("Panel");
        l = new JLabel("panel label");//create label
        btn1 = new JButton("Button 1"); // create button
        btn2 = new JButton ("Button 2");
        btn3 = new JButton("Button 3");
        JPanel p = new JPanel(); //create panel
        // now add buttons and labels on panel
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(l);
        //set the background color of the panel to red
        p.setBackground(Color.red);
         
        // now add the panel to the frame 
        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
