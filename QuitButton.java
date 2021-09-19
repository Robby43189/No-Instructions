//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* QuitButton.java
* Contains the quit button from the button class
* @author Tommy Wei, Robert Jin
* @version 7.0, June 7
*/
class QuitButton extends Button{
  
  //Constructor
  QuitButton(){
    super(125,300,250,100);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the quit button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Quit.png"));
    } catch(Exception e) { 
      System.out.println("error loading quit button");
    }
  }
  
}