//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Level9.java
* Contains the level9 button from the button class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Level9 extends Button{
  
  //Constructor
  Level9(){
    super(320,320,64,64);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the level 9 button
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Level 9.png"));
    } catch(Exception e) { 
      System.out.println("error loading level 9 button");
    }
  }
  
}