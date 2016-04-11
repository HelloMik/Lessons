package basic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel implements MouseListener, ActionListener {

	private int X, Y;
	private int R = 30;
//	private Image img;

    public Board() {

    	initBoard();
    }
    
    private void initBoard() {
        
//		loadImage();
//		int w = img.getWidth(this);
//		int h =  img.getHeight(this);
//		setPreferredSize(new Dimension(w, h));    

    	addMouseListener(this);
    }
    
    private void loadImage() {
//        ImageIcon ii = new ImageIcon("127.png");
//        img = ii.getImage();        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

//		Dimension size = getSize();
//		int x = ( (int)size.getWidth() - img.getWidth(null) ) / 2;
//		int y = ( (int)size.getHeight() - img.getHeight(null) ) / 2;
//		g.drawImage(img, x, y, null);
        
        drawScene(g);
    }

    private void drawScene(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.red);
        g2d.drawOval( X - R / 2, Y - R / 2, R, R );
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
    public void mousePressed(MouseEvent e) {
    	System.out.format("click at %d : %d\n", e.getX(), e.getY());
    	X = e.getX();
    	Y = e.getY();

//    	repaint();
    }
    
    public void mouseReleased(MouseEvent e) {
//    	System.out.println("Mouse released (# of clicks: " + e.getClickCount() + ")");
      }

      public void mouseEntered(MouseEvent e) {
//    	  System.out.println("Mouse entered");
      }

      public void mouseExited(MouseEvent e) {
//    	  System.out.println("Mouse exited");
      }

      public void mouseClicked(MouseEvent e) {
//    	  System.out.format("click at %d : %d", e.getX(), e.getY());
      }
      
}