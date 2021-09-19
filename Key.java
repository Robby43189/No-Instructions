//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Key.java
* Contains the key item class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Key extends Items{
  
  //Constructor
  Key(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the Key 
   * @param void
   * @return void
   */
  void loadSprite(){
    if (pickedUp == false) {
    try{
      sprite = ImageIO.read(new File("Key.png"));
    } catch(Exception e) { 
      System.out.println("error loading key");
    }
    } else {
      try{
      sprite = ImageIO.read(new File("Key Icon.png"));
      x = 0;
      y = 600;
    } catch(Exception e) {
      System.out.println("error loading key icon");
    }
    }
  }
  
}