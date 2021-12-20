import javax.swing.*;

public class Swing1 {
    Swing1(){
        JFrame f = new JFrame();
        f.setSize(400, 500);
        f.setLayout(null); // this is option even you don't set layout it works fine
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn = new JButton("click me");
        btn.setBounds(50, 50, 100, 30);
        f.add(btn);
    }

    public static void main(String args[]){
        Swing1 obj = new Swing1();
    }
}