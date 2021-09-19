//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* StartButton.java
* Contains the start button from the button class
* @author Tommy Wei, Robert Jin
* @version 7.0, June 7
*/
class StartButton extends Button{
  
  //Constructor
  StartButton(){
    super(125,150,250,100);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the start button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Start.png"));
    } catch(Exception e) { 
      System.out.println("error loading start button");
    }
  }
  
}