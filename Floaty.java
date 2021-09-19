//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Floaty.java
* Contains the water float class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Floaty extends Items{
  
  //Constructor
  Floaty(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the Floaty 
   * @param void
   * @return void
   */
  void loadSprite(){
    if (pickedUp == false) {
    try{
      sprite = ImageIO.read(new File("Floaty.png"));
    } catch(Exception e) { 
      System.out.println("error loading floaty");
    }
    } else {
      try{
      sprite = ImageIO.read(new File("Floaty Ring.png"));
      x = 0;
      y=600;
    } catch(Exception e) {
      System.out.println("error loading floaty ring");
    }
    }
  }
  
}