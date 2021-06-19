/*
 Write a swing program in swing to check the entered number is
even or odd by clicking check button and use label to display the
message.
 */
package lab6;

 
import javax.swing.*;
import java.awt.event.*;
public class q3 extends JFrame implements ItemListener{
    JCheckBox check;
    JTextField txt1;
    JLabel lbl;
    q3() {
        txt1 = new JTextField();
        txt1.setBounds(100,100, 100, 50);
         
        add(txt1);
         
        check = new JCheckBox("check", false);
        check.setBounds(220,100, 100, 50);
        check.addItemListener(this);
        add(check);
        lbl = new JLabel();
        lbl.setBounds(200, 180, 100, 20);
        add(lbl);
        
        setSize(500,500);
        setTitle("Check odd or even");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public void itemStateChanged(ItemEvent e) {
        if(check.isSelected()) {
            if(Integer.parseInt(txt1.getText()) % 2 == 0)
                lbl.setText("even");
            else 
                lbl.setText("odd");
        }
    }
    public static void main (String args[]) {
        new q3();
    }
}
