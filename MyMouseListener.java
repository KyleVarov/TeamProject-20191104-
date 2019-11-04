import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MyMouseListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMouseListener extends MouseAdapter
{
    JLabel ml = new JLabel("NoMouseEvent");
 
    //Point mousePosition = MouseInfo.getPointerInfo().getLocation();
    public void mousePressed(MouseEvent e){
        MyMouseFrame mmf = (MyMouseFrame)e.getSource();
        int x = e.getX();
        int y = e.getY();
        mmf.ml.setText("MousePressed" + "(" + x + ", " + y + ")");
    }
    
    public void mouseReleased(MouseEvent e){
        MyMouseFrame mmf = (MyMouseFrame)e.getSource();
        int x = e.getX();
        int y = e.getY();
        mmf.ml.setText("MouseReleased" + "(" + x + ", " + y + ")");
    }
    public void mouseMoved(MouseEvent e){
        MyMouseFrame mmf = (MyMouseFrame)e.getSource();
        int x = e.getX();
        int y = e.getY();
        mmf.ml.setText("MouseMoved" + "(" + x + ", " + y + ")");
    }
    public void mouseDragged(MouseEvent e){
        MyMouseFrame mmf = (MyMouseFrame)e.getSource();
        int x = e.getX();
        int y = e.getY();
        mmf.ml.setText("MouseDragged" + "(" + x + ", " + y + ")");
    }
}
