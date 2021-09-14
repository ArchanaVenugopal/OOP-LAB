import java.awt.*;
import java.applet.*;
public class line extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(100,10,250, 150);
        g.drawLine(100,150,150,10);
    }
}

