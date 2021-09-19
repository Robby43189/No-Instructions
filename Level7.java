//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Level7.java
* Contains the level7 button from the button class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Level7 extends Button{
  
  //Constructor
  Level7(){
    super(64,320,64,64);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the level 7 button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Level 7.png"));
    } catch(Exception e) { 
      System.out.println("error loading level 7 button");
    }
  }
  
}