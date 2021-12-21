
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MouseListenerExample extends JFrame implements MouseListener{
JLabel l;
MouseListenerExample(){
addMouseListener(this);

l=new JLabel();
l.setBounds(20,50,100,20);
add(l);
setSize(300,300);
setLayout(null);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
public void mouseClicked(MouseEvent e) {
l.setText("Mouse Clicked");
}

public void mouseEntered(MouseEvent e) {
l.setText("Mouse Entered");
}
public void mouseExited(MouseEvent e) {
l.setText("Mouse Exited");
}
public void mousePressed(MouseEvent e) {
l.setText("Mouse Pressed");
}
public void mouseReleased(MouseEvent e) {
l.setText("Mouse Released");
}
public static void main(String[] args) {
new MouseListenerExample();
}
}