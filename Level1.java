//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Level1.java
* Contains the level1 button from the button class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Level1 extends Button{
  
  //Constructor
  Level1(){
    super(64,64,64,64);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the level 1 button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Level 1.png"));
    } catch(Exception e) { 
      System.out.println("error loading level 1 button");
    }
  }
  
}