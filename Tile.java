//Graphics and Image IO imports
import java.awt.image.BufferedImage; 
import java.awt.Graphics;

/**
* Tile.java
* Contains the abstract class for tiles 
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
abstract class Tile{
  
  //Variables
  int x;
  int y;
  int length;
  int height;
  BufferedImage sprite;
  boolean changed = false;
  int cracked;
  
  //Constructor
  Tile(int x,int y,int length,int height){
    this.x = x;
    this.y = y;
    this.length = length;
    this.height = height;
  }
  
  /**
   * draw
   * Draws the tile onto the jpanel
   * @param Graphics g to draw sprite
   * @return void
   */
  public void draw(Graphics g){
     g.drawImage(sprite,x,y,length,height,null);
  }
  abstract void loadSprite();
}