// program to add or subtract two numbers based on the button clicked

import java.awt.event.*;
import javax.swing.*;

public class AddSubtract implements ActionListener {
    JTextField num1, num2;
    JLabel relLbl ;
    JButton addBtn, subBtn;

    AddSubtract(){
        JFrame f = new JFrame("This is frame name");
        JLabel titleLbl, num1Lbl, num2Lbl;
        titleLbl = new JLabel("Calculator");
        titleLbl.setBounds(0, 50, 100, 30);
        num1Lbl = new JLabel("Number 1:");
        num1Lbl.setBounds(0, 100, 100, 30);
        num2Lbl = new JLabel("Number 2:");
        num2Lbl.setBounds(0, 150, 100, 30);
        relLbl = new JLabel("Result: ");
        relLbl.setBounds(0, 200, 100, 30);

        //add text boxes
        num1 = new JTextField();
        num2 = new JTextField();
        num1.setBounds(100, 100, 200, 30);
        num2.setBounds(100, 150, 200, 30);

        addBtn = new JButton("Add");
        addBtn.setBounds(100, 200, 100, 30);
        subBtn = new JButton("Sub");
        subBtn.setBounds(200, 200, 100, 30);
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);

        JLabel dummy = new JLabel("");

        f.add(titleLbl);
        f.add(num1Lbl);
        f.add(num2Lbl);
        f.add(relLbl);
        f.add(num1);
        f.add(num2);
        f.add(addBtn);
        f.add(subBtn);
        f.add(dummy);

        f.setSize(500, 600);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if(cmd.equals("Add")){
                int sum = Integer.parseInt(num1.getText())+ Integer.parseInt(num2.getText());
            relLbl.setText("Result: " + sum);
        }else if(cmd.equals("Sub")){
            int dif = Integer.parseInt(num1.getText())- Integer.parseInt(num2.getText());
            relLbl.setText("Result: " + dif);
        }
        // if(e.getSource() == addBtn) {
        //      int sum = Integer.parseInt(num1.getText())+ Integer.parseInt(num2.getText());
        //      relLbl.setText(" "+sum);
        // }else if(e.getSource() == subBtn) {
        //     int dif = Integer.parseInt(num1.getText())- Integer.parseInt(num2.getText());
        //     relLbl.setText(" "+dif);
        // }
    };
    public static void main(String args[]){
        new AddSubtract();
    }
}