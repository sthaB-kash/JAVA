import java.applet.Applet;  
import java.awt.*;
import java.awt.Graphics;  

public class Question3 extends Applet{  
  
public void paint(Graphics g){ 
String n=getParameter("name");
String pr=getParameter("program");
String c=getParameter("college");
g.drawString(n,50,50);
g.drawString(pr,50,60);
g.drawString(c,50,70);

}  
  
}