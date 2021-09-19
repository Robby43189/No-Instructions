//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* WallTile.java
* Contains the wall styled tile class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class WallTile extends Tile{
  
  //Constructor
  WallTile(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the wall tile
   * @param void
   * @return void
   */
  void loadSprite(){                     
    try{
      sprite = ImageIO.read(new File("Wall.png"));
    } catch(Exception e) { 
      System.out.println("error loading wall");
    }
  }
  
}