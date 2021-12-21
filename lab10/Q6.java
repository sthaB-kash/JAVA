/*
 Write a GUI program to calculate the sum and difference of two numbers
input by the users as shown as below window.
 */
package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q6 extends JFrame implements ActionListener {
     JFrame window;
     JTextField num1, num2, rel;
     JButton addBtn , subBtn;
     
     
     Q6(){
        Gui();
     }
     void Gui(){
        window = new JFrame("Java Calculator Progaram");
        window.setSize(250, 400);
    
        num1 = new JTextField();
        num2 = new JTextField();
        rel = new JTextField();
        
        addBtn = new JButton("ADD");
        subBtn = new JButton("SUB");
        addBtn.addActionListener(this);
        subBtn.addActionListener((ActionListener) this);
        JPanel btns = new JPanel();
        btns.setSize(200, 100);
        btns.add(addBtn);
        btns.add(subBtn);

        window.setVisible(true);
        JPanel panel = new JPanel();
        panel.setSize(1600,1600);
        GridLayout layout = new GridLayout(0,2);
        layout.setHgap(10);
        layout.setVgap(10);
        panel.setLayout(layout);
        panel.add(new JLabel("First Number"));
        panel.add(num1);
        panel.add(new JLabel("Second Number"));
        panel.add(num2);
        panel.add(new JLabel("Result"));
        panel.add(rel);
        
        JPanel main = new JPanel();
//        main.setLayout(new FlowLayout());
        main.add(new JLabel("Calcularor"));
        main.add(panel);
        main.add(btns);
        window.add(main);
        
        
     }
     public static void main (String args[]){
         new Q6();
     }
     
     public void actionPerformed(ActionEvent e){
         if(e.getSource() == addBtn) {
             int sum = Integer.parseInt(num1.getText())+ Integer.parseInt(num2.getText());
             rel.setText(" "+sum);
         }else if(e.getSource() == subBtn) {
             int dif = Integer.parseInt(num1.getText())- Integer.parseInt(num2.getText());
             rel.setText(" "+dif);
         }
     }

     
     
     
    
}
