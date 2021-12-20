import java.awt.*;  
import java.applet.*;  
  
 //<applet code="Question4.class" width=400 height=400></applet>
 public class Question4 extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture = getImage(getCodeBase(), "bikash.jpg");
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 30,30, this);  
  }  
      
  }  


 
  