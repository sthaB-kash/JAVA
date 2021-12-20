import java.awt.*;  
import java.applet.*;  
//<applet code="Question5.class" width=400 height=400></applet>
public class Question5 extends Applet {  
  
  Image picture;  
  
  public void init() {  
    picture =getImage(getDocumentBase(),"bikash.jpg");  
  }  
    
  public void paint(Graphics g) {  
    for(int i=100;i<500;i++){  
      try{g.drawImage(picture, i,30, this); Thread.sleep(600);}catch(Exception e){}  
    }  
  }  
}


 