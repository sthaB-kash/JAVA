import java.awt.*;

class Example1 extends Frame {
    Example1(){
        Button btn = new Button("Click me");
        btn.setBounds(30,50, 180, 30); //setting button position
        //setBounds(x, y, width, height);
        add(btn); //adding btn to the frame
        setSize(400, 400); // frame size 300 width 300 height
        setLayout(null); // no layout means we are not setting any layout we are setting our own position of component 
                        // i.e. setBounts()
        setDefaultCloseOperation(super.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]){
        new Example1();
    }
}