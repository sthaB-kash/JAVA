import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingEventHandlings implements ActionListener{
    JLabel l; JFrame f; JButton btn1,btn2;
    SwingEventHandlings(){
        f=new JFrame("An event example");
        //terminate the program when the user closes the application.
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //make two buttons
        btn1=new JButton("Alpha");
        btn1.setBounds(100,100,200,100);
        btn2=new JButton("Beta");
        btn2.setBounds(300,100,200,100); 
        btn1.addActionListener(this); 
        btn2.addActionListener(this);
        f.add(btn1);
        f.add(btn2);
        l=new JLabel("press a button");
        l.setBounds(300,200,200,100);
        f.add(l);
        f.setLayout(null);
        f.setSize(600,600);
        f.setVisible(true);
    }
    public static void main(String a[]){
        new SwingEventHandlings();
    }
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); 
        System.out.println(command); 
        if(command.equals("Alpha")){
            l.setText("alpha was pressed");
        }
        if(command.equals("Beta")){
            l.setText("Beta was pressed");
        }
    }
}
