/*
 Write a swing program to add two numbers from two textfields
and show the result in a label when the button is clicked.
 */
package lab6;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class q2 extends JFrame implements ActionListener{
    JLabel lbl;
    JTextField txt1, txt2;
    JButton addBtn;
    q2() {
        txt1 = new JTextField();
        txt2 = new JTextField( );
        txt1.setBounds(100,100, 100, 50);
        txt2.setBounds(250, 100, 100, 50);
        add(txt1);
        add(txt2);
        addBtn = new JButton("Add");
        addBtn.setBounds(250, 200, 100, 50);
        addBtn.addActionListener(this);
        add(addBtn);
         lbl = new JLabel();
        lbl.setBounds(200, 180, 100, 20);
        add(lbl);
        setBackground(Color.blue);
//        this.setBackground(Color.red);
        setSize(500,500);
        setTitle("Add two numbers");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public void actionPerformed (ActionEvent e) {
        int a = Integer.parseInt(txt1.getText());
        int b = Integer.parseInt(txt2.getText());
        if(e.getSource().equals(addBtn)){
            lbl.setText(String.valueOf(a+b));
            
    }
       
    }
    public static void main (String mainp[]) {
        new q2();
    }
}
