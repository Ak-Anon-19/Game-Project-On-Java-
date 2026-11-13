package Game_Project;

import javax.swing.JFrame;
public class GameWindow extends  JFrame {
    GameWindow(){
        

        setTitle("IICT Defender");
         setSize(1000,600);
         
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         GamePanel gamePanel = new GamePanel();
         add(gamePanel);
         
         setLocationRelativeTo(null);
         setVisible(true);
    }
}
