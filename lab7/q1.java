/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

 
import javax.swing.*;
import java.awt.*;
 
import java.awt.event.*;
public class q1 extends JFrame implements ActionListener{
     private JFrame mainFrame;
   private JLabel headerLabel;
//   private JLabel actions;
   private JPanel cPanel;
   private JLabel msglabel;
   JTextField name, email, country, state, phone;
   JPasswordField pw, cpw;
   JButton submitBtn, clearBtn;
   public q1(){
      prepareGUI();
   }
   public static void main(String[] args){
      q1 form = new q1();  
      form.showForm();       
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Registration Form");
      mainFrame.setSize(800,700);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("Registration From in Windows Form",JLabel.CENTER );
      headerLabel.setForeground(Color.blue);
      headerLabel.setFont(new Font("Calibri",Font.BOLD,28));
//      actions = new JLabel("",JLabel.CENTER);        
//      actions.setSize(350,50);
//      
       
      cPanel = new JPanel();
      cPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(cPanel);
//      mainFrame.add(actions);
      mainFrame.setVisible(true);  
   }
   private void showForm(){
             
      submitBtn = new JButton("Submit");
      submitBtn.addActionListener(this);
      clearBtn = new JButton("Clear");
      clearBtn.addActionListener(this);
      JPanel btns = new JPanel();
      btns.setSize(200,100);
      btns.add(submitBtn);
      btns.add(clearBtn);
      JPanel panel = new JPanel();
//      panel.setBackground(Color.darkGray);
      panel.setSize(600,600);
      GridLayout layout = new GridLayout(0,2);
      layout.setHgap(10);
      layout.setVgap(10);
      name = new JTextField();
      email = new JTextField();
      pw = new JPasswordField();
      cpw = new JPasswordField();
      country = new JTextField();
      state = new JTextField();
      phone = new JTextField();
      phone.setSize(300, 50);
      panel.setLayout(layout); 
       
      panel.add(new JLabel("Username:"));
      panel.add(name);
      panel.add(new JLabel("Email-ID:")); 
      panel.add(email);
      panel.add(new JLabel("Create Password:")); 
      panel.add(pw);
      panel.add(new JLabel("Confirm Password:")); 
      panel.add(cpw);
      panel.add(new JLabel("Country:")); 
      panel.add(country);
      panel.add(new JLabel("State:")); 
      panel.add(state);
      panel.add(new JLabel("Phone no:")); 
      panel.add(phone);
      cPanel.add(panel);
      mainFrame.add(btns); 
      mainFrame.setVisible(true);  
   }
   public void actionPerformed (ActionEvent e) {
         
        if(e.getSource() == submitBtn){
            System.out.println("Name: " + name.getText());
            System.out.println("Email-id: " + email.getText());
            //getPasword return array of characters
            char [] password = pw.getPassword();    
            System.out.println("Password: " + password);
            System.out.println("C.PW: " + cpw.getPassword());
            System.out.println("Country: " + country.getText());
            System.out.println("State: " + state.getText());
            System.out.println("Phone no: " + phone.getText());
            
        }else if(e.getSource()== clearBtn){
            name.setText("");
            email.setText("");
            pw.setText("");
            cpw.setText("");
            state.setText("");
            country.setText("");
            phone.setText("");
        }
    }
}
