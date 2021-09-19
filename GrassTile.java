//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* GrassTile.java
* Contains the grass styled tile class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class GrassTile extends Tile{
  
  //Constructor
  GrassTile(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the grass tile
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Grass.png"));
    } catch(Exception e) { 
      System.out.println("error loading grass");
    }
  }
  
}