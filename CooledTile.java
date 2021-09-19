//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* CooledTile.java
* Contains the cooled lava styled tile class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class CooledTile extends Tile{
  
  //Constructor
  CooledTile(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the cooled lava tile
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Cooled.png"));
    } catch(Exception e) { 
      System.out.println("error loading cooled lava");
    }
  }
  
}