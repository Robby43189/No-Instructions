//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* SandTile.java
* Contains the sand styled tile class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class SandTile extends Tile{
  
  //Constructor
  SandTile(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the sand tile
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Sand.png"));
    } catch(Exception e) { 
      System.out.println("error loading sand");
    }
  }
  
}