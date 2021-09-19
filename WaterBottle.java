//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* WaterBottle.java
* Contains the water bottle class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class WaterBottle extends Items{
  boolean filled;
  //Constructor
  WaterBottle(int x,int y,int length,int height, int filled){
    super(x,y,length,height);
    if (filled == 0) {
      this.filled = false;
    } else {
      this.filled = true;
    }
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the water bottle
   * @param void
   * @return void
   */
  void loadSprite(){
    if (pickedUp == false && filled == false) {
    try{
      sprite = ImageIO.read(new File("Empty Bottle.png"));
    } catch(Exception e) { 
      System.out.println("error loading empty bottle");
    }
    } else if (pickedUp == true && filled == false) {
      try{
      sprite = ImageIO.read(new File("Empty Bottle Icon.png"));
      x = 48;
      y = 600;
      System.out.println(x);
      System.out.println(y);
    } catch(Exception e) {
      System.out.println("error loading empty bottle icon");
    }
    } else if (pickedUp == true && filled == true) {
      try{
      sprite = ImageIO.read(new File("Bottle Icon.png"));
      x = 48;
      y = 600;
      System.out.println(x);
      System.out.println(y);
    } catch(Exception e) { 
      System.out.println("error loading full bottle icon");
    }
    } else {
      try {
      sprite = ImageIO.read(new File("Full Bottle.png"));
    } catch(Exception e) { 
      System.out.println("error loading full bottle");
    }
    }
  }
  
}