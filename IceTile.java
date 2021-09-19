//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
 * IceTile.java
 * Contains the ice styled tile class
 * @author Tommy Wei, Robert Jin
 * @version Sept 19
 */
class IceTile extends Tile{
  
  //Constructor
  IceTile(int x,int y,int length,int height){
    super(x,y,length,height);
    loadSprite();
  }
  
  /**
   * loadSprite
   * loads the sprite png of the ice tile
   * @param void
   * @return void
   */
  void loadSprite(){
    if (changed == true) {
      try{
        sprite = ImageIO.read(new File("Ice Cracked.png"));
      } catch(Exception e) { 
        System.out.println("error loading cracked ice");
      } 
    }else {
        try{
          sprite = ImageIO.read(new File("Ice.png"));
        } catch(Exception e) { 
          System.out.println("error loading ice");
        }
      }
    }
    
  }