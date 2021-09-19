//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Level2.java
* Contains the level2 button from the button class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Level2 extends Button{
  
  //Constructor
  Level2(){
    super(192,64,64,64);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the level 2 button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Level 2.png"));
    } catch(Exception e) { 
      System.out.println("error loading level 2 button");
    }
  }
  
}