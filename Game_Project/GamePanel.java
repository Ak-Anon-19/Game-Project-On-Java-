package Game_Project;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Image;


public class GamePanel extends JPanel {
    private Image background;
    GamePanel(){
        
    ImageIcon icon = new ImageIcon("E:\\Java\\Game_Project\\Images\\ground.jpeg");
    System.out.println(icon.getIconWidth());
    System.out.println("Width: " + icon.getIconWidth());
System.out.println("Height: " + icon.getIconHeight());
System.out.println("Image Loaded: " + (icon.getIconWidth() > 0));
                background = icon.getImage();

    }
   
    @Override 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background, 0, 0,getWidth(),getHeight(),this);
    }
    
}
