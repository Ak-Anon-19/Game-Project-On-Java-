package Game_Project;

import javax.swing.JFrame;

public class Game extends JFrame{

     Game(){
         setTitle("IICT Defender");
         setSize(1000,600);
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
     }
    



    public static void main(String[] args) {
        Game game = new Game();
    }
}
