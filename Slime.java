//File IO and Image IO imports
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

/**
* Slime.java
* Contains the basic enemy class of enemies
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Slime extends Enemy{
  
  int moveDirection = 0;
  
  //Constructor
  Slime(Map map){
    super(1, 48, 48,map);
    loadSprite();
  }
  
  public void move(){
    
    //0 is up
    //1 is down
    
    if(moveDirection == 0){
      if((map.tileList[y/48][x/48]) instanceof WallTile){
        moveDirection = 1;
        y += moveSpeed;
      }else{
        y -= moveSpeed;
      }
    }else{
      if ((map.tileList[(y/48)+1][x/48]) instanceof WallTile){
        moveDirection = 0;
        y -= moveSpeed;
      }else{
        y += moveSpeed;
      }
    }
  }
  
  /**
   * loadSprite
   * loads the sprite png of the slime enemy
   * @param void
   * @return void
   */
  void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Enemy (Basic).png"));
    } catch(Exception e) { 
      System.out.println("error loading slime");
    }
  }
  
}