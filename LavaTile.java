//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* LavaTile.java
* Contains the lava styled tile class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class LavaTile extends Tile{
  
  //Constructor
  LavaTile(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the lava tile
   * @param void
   * @return void
   */
  void loadSprite(){
    if (changed == true) {
      try{
        sprite = ImageIO.read(new File("Cooled.png"));
      } catch(Exception e) { 
        System.out.println("error loading cracked stone");
      }
    }
    else {
      try{
        sprite = ImageIO.read(new File("Lava.png"));
      } catch(Exception e) { 
        System.out.println("error loading lava");
      }
    }
  }
  
}