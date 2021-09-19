//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* StoneTile.java
* Contains the stone path styled tile class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class StoneTile extends Tile{
  
  int cracked = 0;
  //Constructor
  StoneTile(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the stone tile
   * @param void
   * @return void
   */
  void loadSprite(){
    if (changed == true) {
      try{
      sprite = ImageIO.read(new File("Stone Cracked.png"));
    } catch(Exception e) { 
      System.out.println("error loading cracked stone");
    }
    } else {
    try{
      sprite = ImageIO.read(new File("Stone.png"));
    } catch(Exception e) { 
      System.out.println("error loading stone");
    }
    }
  }
  
}