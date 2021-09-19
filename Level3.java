//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Level3.java
* Contains the level3 button from the button class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Level3 extends Button{
  
  //Constructor
  Level3(){
    super(320,64,64,64);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the level 3 button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Level 3.png"));
    } catch(Exception e) { 
      System.out.println("error loading level 3 button");
    }
  }
  
}