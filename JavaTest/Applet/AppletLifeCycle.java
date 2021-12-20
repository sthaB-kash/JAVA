import java.applet.Applet;
import java.awt.Graphics;
// <applet code="AppletLifeCycle.claas" width="200" height="200"></applet> 
public class AppletLifeCycle extends Applet {
    public void init() {
        System.out.println("I'm init()");
    }
    public void start() {
        System.out.println("I'm start()");
    }
    public void paint(Graphics g) {
        System.out.println("I'm paint()");
    }
    public void stop() {
        System.out.println("I'm stop()");
    }
    public void distroy() {
        System.out.println("I'm distroy()");
    }
}