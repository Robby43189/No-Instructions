//Graphics and Image IO imports
import java.awt.image.BufferedImage; 
import java.awt.Graphics;

/**
* Button.java
* Contains the graphical button class
* @author Tommy Wei, Robert Jin
* @version 7.0, June 8
*/
abstract class Button{  
  
  //Variables
  private int x;
  private int y;
  private int length;
  private int height;
  private boolean clicked = false;
  BufferedImage sprite;
  
  //Constructor
  Button(int x,int y,int length,int height){
    this.x = x;
    this.y = y;
    this.length = length;
    this.height = height;
  }
  
  /**
   * setClicked
   * Stores a boolean value of whether or not the button was clicked
   * @param one boolean value of clicked
   * @return void
   */
  public void setClicked(boolean clicked){
    this.clicked = clicked;
  }
  
  /**
   * getX
   * Returns the x coordinate of the button
   * @param void
   * @return one integer of x position
   */
  public int getX(){
    return x;
  }
  
  /**
   * getY
   * Returns the y coordinate of the button
   * @param void
   * @return one integer of y position
   */
  public int getY(){
    return y;
  }
  
  /**
   * getLength
   * Returns the length of the button
   * @param void
   * @return one integer of length
   */
  public int getLength(){
    return length;
  }
  
  /**
   * getHeight
   * Returns the height of the button
   * @param void
   * @return one integer of height
   */
  public int getHeight(){
    return height;
  }
  
  /**
   * getClicked
   * Returns whether or not the button was clicked
   * @param void
   * @return one boolean value of clicked
   */
  public boolean getClicked(){
    return clicked;
  }
  
  /**
   * draw
   * Draws the button onto the jpanel
   * @param Graphics g to draw sprite
   * @return void
   */
  public void draw(Graphics g){
     g.drawImage(sprite,x,y,length,height,null);
  }
}