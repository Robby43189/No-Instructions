//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Level5.java
* Contains the level5 button from the button class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Level5 extends Button{
  
  //Constructor
  Level5(){
    super(192,192,64,64);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the level 5 button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Level 5.png"));
    } catch(Exception e) { 
      System.out.println("error loading level 5 button");
    }
  }
  
}