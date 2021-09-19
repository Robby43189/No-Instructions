//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Level8.java
* Contains the level8 button from the button class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Level8 extends Button{
  
  //Constructor
  Level8(){
    super(192,320,64,64);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the level 8 button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Level 8.png"));
    } catch(Exception e) { 
      System.out.println("error loading level 8 button");
    }
  }
  
}