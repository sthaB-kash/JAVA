/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingPractice;
import javax.swing.*;
/**
 *
 * @author dell
 */
public class swingExample {
    public static void demo() {
        JFrame f = new JFrame();
        JButton btn = new JButton("Click me");
        btn.setBounds(100,100,120,30);
        f.add(btn);
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        //using association
        demo();
        //using inheritance
        Test example = new Test();
    }
    
}

//through inheritance
class Test extends JFrame {
    Test() {
        JButton btn = new JButton("Click me");
        btn.setBounds(100,100,120,30);
        add(btn);
        setSize(200,200);
        setLayout(null);
        setVisible(true);
    }
}
