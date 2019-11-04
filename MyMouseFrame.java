import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class MyMouseFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyMouseFrame extends JFrame
{
    public JPanel mp;
    public JLabel ml;
    public MyMouseFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MouseListener & MouseMotionListener");
        this.setSize(300,400);
        
        mp = new JPanel();
        mp.setBackground(Color.CYAN);
        this.add(mp);
        
        ml = new JLabel("NoMouseEvent");
        mp.add(ml);

        setVisible(true);
    }
}
