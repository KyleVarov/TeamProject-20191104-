import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MyMouseListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMouseListener extends MouseMotionAdapter implements MouseListener
{

<<<<<<< HEAD
    //Point mousePosition = MouseInfo.getPointerInfo().getLocation();
    
=======
>>>>>>> d82c6506e0b00d0c3069ad7e37fd34aa75ee09ad
    public void mousePressed(MouseEvent e){
        MyMouseFrame mmf = (MyMouseFrame)e.getSource();

        int x = e.getX();
        int y = e.getY();
        mmf.ml.setText("MousePressed" + "(" + x + ", " + y + ")");
    }

    public void mouseClicked(MouseEvent e){

    }

    public void mouseReleased(MouseEvent e){
        MyMouseFrame mmf = (MyMouseFrame)e.getSource();
        int x = e.getX();
        int y = e.getY();
        mmf.ml.setText("MouseReleased" + "(" + x + ", " + y + ")");
    }

    public void mouseEntered(MouseEvent e){
        MyMouseFrame mmf = (MyMouseFrame)e.getSource();
        mmf.mp.setBackground(Color.CYAN);
    }

    public void mouseExited(MouseEvent e){
        MyMouseFrame mmf = (MyMouseFrame)e.getSource();
        mmf.mp.setBackground(Color.YELLOW);
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
