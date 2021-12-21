/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingPractice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public class addnum extends JFrame implements ActionListener{
    JLabel lbl;
    JTextField txt1, txt2;
    JButton addBtn;
    addnum() {
        txt1 = new JTextField();
        txt2 = new JTextField( );
        JLabel num1 = new JLabel("N1");
        num1.setBounds(50, 100, 50, 30);
        add(num1);
        txt1.setBounds(100,100, 100, 30);
        add(txt1);
        JLabel num2 = new JLabel("N2");
        num2.setBounds(50, 200, 50, 30);
        add(num2);
        txt2.setBounds(100, 200, 100, 30);
        
        add(txt2);
        addBtn = new JButton("Add");
        addBtn.setBounds(150, 290, 100, 50);
        addBtn.addActionListener(this);
        add(addBtn);
         lbl = new JLabel();
        lbl.setBounds(50, 280, 100, 20);
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
            lbl.setText("Result:" +String.valueOf(a+b));
            
    }
       
    }
    public static void main (String mainp[]) {
        new addnum();
    }
    
}
