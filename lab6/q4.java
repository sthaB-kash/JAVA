/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import javax.swing.*;
import java.awt.event.*;
public class q4 extends JFrame  {
    
    JTextField username, password;
    JButton loginBtn, cancelBtn;
    JCheckBox showHide;
    
    q4() {
        username = new JTextField();
        password = new JTextField();
        JLabel usernameLbl = new JLabel("Username:");
        JLabel passwordLbl = new JLabel("Password");
        showHide = new JCheckBox("show password", false);
        loginBtn = new JButton("Loing");
        cancelBtn = new JButton("Cancel");
        usernameLbl.setBounds(100,100,100,50);
        username.setBounds( 250, 100, 100, 30);
        passwordLbl.setBounds(100, 180, 100, 50);
        password.setBounds(250, 180, 100, 30);
        showHide.setBounds(250, 160, 100, 20);
        
        cancelBtn.setBounds(100, 300, 100, 20);
        loginBtn.setBounds(280, 300, 70, 20);
        
        add(usernameLbl);
        add(username);
        add(passwordLbl);
        add(password);
        add(showHide);
        add(loginBtn);
        add(cancelBtn);
        
        setSize(600,600);
        setTitle("Login Form");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
    public static void main(String args[]){
        new q4();
    }
}
