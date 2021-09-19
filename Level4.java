//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Level4.java
* Contains the level4 button from the button class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Level4 extends Button{
  
  //Constructor
  Level4(){
    super(64,192,64,64);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the level 4 button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Level 4.png"));
    } catch(Exception e) { 
      System.out.println("error loading level 4 button");
    }
  }
  
}