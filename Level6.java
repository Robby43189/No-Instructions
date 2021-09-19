//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Level6.java
* Contains the level6 button from the button class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Level6 extends Button{
  
  //Constructor
  Level6(){
    super(320,192,64,64);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the level 6 button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Level 6.png"));
    } catch(Exception e) { 
      System.out.println("error loading level 6 button");
    }
  }
  
}