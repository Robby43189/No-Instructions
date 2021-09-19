 import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Font;

/**
* Stage.java
* This class is to hold all information pertaining to each stage in the game
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/
class Stage{
//Variables
  ArrayList<Enemy> enemies = new ArrayList<Enemy>();
  Map map; 
  Grid grid;
  Character mainChar;
  int stageCounter = 1;
  int gameEnd = 0;

  //Constructor 
  Stage(int buttonClicked){
    map = new Map(buttonClicked); //Initializes the map based on stage chosen
    grid = new Grid(); //Makes a grid of rectangles
    mainChar = new Character(map);
    //Enemy slime = new Slime(map);
    //enemies.add(slime);
  }
  
  /**
   * drawMap
   * Draws the entire map and towers onto the Jpanel. Also check boolean to draw tower range
   * @param Graphics g to draw sprites
   * @return void
   */
  public void drawMap(Graphics g){
    map.draw(g); //Draw map
    grid.draw(g); //Draw grid
  }
  
  public void drawChar(Graphics g){
    mainChar.draw(g);
    for (int i=0;i<enemies.size();i++){
      enemies.get(i).draw(g);
    }
  }
  
  /**
   * drawStageText
   * Draws the health of player and the wave they are on.
   * @param Graphics g to draw sprites
   * @return void
   */
  public void drawStageText(Graphics g){
    g.setFont(new Font("Impact", Font.BOLD, 32)); 
    if (gameEnd == 1){
      g.setFont(new Font("Impact", Font.BOLD, 100)); 
      g.drawString("You win!",350,350);
    } else if (gameEnd == 2){
      g.setFont(new Font("Impact", Font.BOLD, 100)); 
      g.drawString("You Lose",350,350);
    }
  }
  
}