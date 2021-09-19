//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* PathTile.java
* Contains the dirt path styled tile class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class PathTile extends Tile{
  
  //Constructor
  PathTile(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the path tile
   * @param void
   * @return void
   */
  void loadSprite(){
    if (changed == true) {
      try{
        sprite = ImageIO.read(new File("Dirt Touched.png"));
      } catch(Exception e) { 
        System.out.println("error loading cracked touched dirt");
      } 
    } else {
      try{
        sprite = ImageIO.read(new File("Dirt.png"));
      } catch(Exception e) { 
        System.out.println("error loading path");
      }
    }
  }
  
}