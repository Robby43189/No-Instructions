//Jpanel imports for graphics
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
* GameAreaPanelOOP.java
* Class area panel of the game frame
* @author Tommy Wei, Robert Jin
* @version 7.0, June 12
*/

class GameAreaPanelOOP extends JPanel {
  
  //Variables
  Stage stage;
  int spawnTimer;
  
  //Constructor
  GameAreaPanelOOP(int buttonClicked) {
    stage = new Stage(buttonClicked);
    //Action listeners
    GameKeyListener keyListener = new GameKeyListener(stage.mainChar);
    this.addKeyListener(keyListener);
    
    //JPanel Stuff
    this.setFocusable(true);
    this.requestFocusInWindow(); 
    this.setSize(1152,768);

    //Start the game loop in a separate thread (allows simple frame rate control)
    //the alternate is to delete this and just call repaint() at the end of paintComponent()
    Thread t = new Thread(new Runnable() { public void run() { animate(); }}); //start the gameLoop 
    t.start();
    
  }
  
  /**
   * animate
   * Updates the game
   * @param void
   * @return void
   */
  public void animate() { 
    
    while(stage.gameEnd == 0){
      
      try{ Thread.sleep(10);} 
      catch (Exception exc){
        System.out.println("Thread Error");
      }
      
      //repaint request
      this.repaint();
    }    
  }
  
  /**
   * painComponent
   * Refreshes the screen and updates all graphics
   * @param Graphics g to draw all sprites
   * @return void
   */
  public void paintComponent(Graphics g) {   
    super.paintComponent(g); //required
    setDoubleBuffered(true); 
    
    stage.drawMap(g);
    stage.drawChar(g);
    
    //Draw text
    stage.drawStageText(g);
    
  }   
}
