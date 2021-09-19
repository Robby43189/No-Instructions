//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* WaterTile.java
* Contains the water styled tile class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class WaterTile extends Tile{
  
  //Constructor
  WaterTile(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the water tile
   * @param void
   * @return void
   */
  void loadSprite(){
    if (changed == true) {
      try{
      sprite = ImageIO.read(new File("Water (1).png"));
    } catch(Exception e) { 
      System.out.println("error loading changed water");
    }
    } else {
    try{
      sprite = ImageIO.read(new File("Water.png"));
    } catch(Exception e) { 
      System.out.println("error loading water");
    }
    }
  }
  
}