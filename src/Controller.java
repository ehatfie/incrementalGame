import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.Timer;
import javax.swing.SwingUtilities;

public class Controller implements MouseListener {
    Model model;
    View view;

    Controller() throws IOException, Exception{
        model = new Model();
        view = new View(this);
        new Timer(10, view).start();
    }

    public void update(Graphics g){ model.update(g);}

    @Override
    public void mousePressed(MouseEvent e){

        if(SwingUtilities.isLeftMouseButton(e)){

        } else if(SwingUtilities.isRightMouseButton(e)){

        }
    }

    @Override
    public void mouseClicked(MouseEvent e){}

    @Override
    public void mouseReleased(MouseEvent e){}

    @Override
    public void mouseEntered(MouseEvent e){}

    @Override
    public void mouseExited(MouseEvent e){}

    // main
    public static void main(String[] args) throws Exception{
        Controller game = new Controller();
    }

}