
import java.awt.*;
import java.awt.event.*;

public class ClickEventExample extends Frame implements ActionListener {
    TextField tf;
    ClickEventExample(){
        tf = new TextField("Greeting....s");
        tf.setBounds(50, 100, 80, 20);
        Button btn = new Button("click me");
        btn.setBounds(50, 200, 80, 20);
        btn.addActionListener(this);
        add(btn);
        add(tf);
        setSize(300, 400);
        setVisible(true);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Hello Bikash");
    }

    public static void main(String args[]){
        ClickEventExample obj = new ClickEventExample();
    }
}