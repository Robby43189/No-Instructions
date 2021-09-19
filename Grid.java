import java.awt.Rectangle;
import java.awt.Graphics;
import java.util.ArrayList;

/**
* Grid.java
* Holds the grid for the map
* @author Tommy Wei, Robert Jin
* @version, Sep 19
*/
class Grid{
  
  //Variables
  static ArrayList<Rectangle> rectList = new ArrayList<Rectangle>();
  
  //Constructor
  Grid(){
    makeTiles();
  }
  
  /**
   * makeTiles
   * Initializes the map
   * @param void 
   * @return void
   */
  public void makeTiles(){
    int tempX = 0;
    int tempY = 0;
    int tSize = 48;
    
    for (int i =0; i <16;i++){
      for (int j =0;j <24;j++){
        Rectangle r = new Rectangle(tempX,tempY,tSize,tSize);
        rectList.add(r);
        tempX += tSize;
      }
      //Move down y axis
      tempX = 0;
      tempY += tSize;
    } 
    //Reset
    tempX = 0;
    tempY = 0;
  }
  
  /**
   * draw
   * Draws every rectangle onto jpanel
   * @param Graphics g to draw sprite
   * @return void
   */
  public void draw(Graphics g){
    for (int i=0;i<384;i++){
      g.drawRect((int)rectList.get(i).getX(),(int)rectList.get(i).getY(),(int)rectList.get(i).getWidth(),(int)rectList.get(i).getHeight());
    } 
  }
  
  
}