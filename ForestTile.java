//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* ForestTile.java
* Contains the forest styled tile class
* @author Tommy Wei, Robert Jin
* @version 7.0, June 7
*/
class ForestTile extends Tile{
  
  //Constructor
  ForestTile(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the forest tile
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Tile (Forest).png"));
    } catch(Exception e) { 
      System.out.println("error loading forest");
    }
  }
  
}