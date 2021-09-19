import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.util.ArrayList;
import java.lang.Math;

/**
* Enemy.java
* Contains the abstract enemy class
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
public class Enemy{
  //Variables
  int moveSpeed;
  int x;
  int y;
  Map map;
  BufferedImage sprite;
  
  //Constructor
  Enemy(int moveSpeed, int x, int y,Map map){
    this.x = x;
    this.y = y;
    this.moveSpeed = moveSpeed;
    this.map = map;
  }
  

  public void move(){
  }

  public void draw(Graphics g){
    g.drawImage(sprite,x,y,48,48,null);
  }
  
}