

import java.applet.*;
import java.awt.*;
//<applet code="QuestionTwo.class" width=400 height=400></applet>
public class QuestionTwo extends Applet {
    public void paint(Graphics g)
    {
  	
        g.setColor(Color.red);
        // Oval for face outline
        //g.drawOval(80, 70, 150, 150);
        g.fillOval(80, 70, 150, 150);
        // Ovals for eyes
        // with black color filled
        g.setColor(Color.white);
        g.fillOval(120, 120, 20, 15);
        g.fillOval(170, 120, 20, 15);
  
        // Arc for the smile
        g.drawArc(130, 160, 50, 20, 180, 180);
    }
}
