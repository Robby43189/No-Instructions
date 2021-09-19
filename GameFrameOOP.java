import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;

/**
* GameFrameOOP.java
* Class main frame
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/

class GameFrameOOP extends JFrame { 
  //Variables
  static GameAreaPanelOOP gamePanel;
  
  //Constructor
  GameFrameOOP(int buttonClicked) { 
    super("No Instructions");
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1152,792);
    this.setResizable(false);
    
    //Set up the game panel (where we put our graphics)
    gamePanel = new GameAreaPanelOOP(buttonClicked);
    this.add(gamePanel);
    this.setFocusable(false);  //we will focus on the JPanel
    this.setVisible(true);    
  } 

}