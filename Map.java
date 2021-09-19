//Graphics imports
import java.awt.Graphics;
import java.util.ArrayList;

/**
* Map.java
* Holds the map of tiles for all stages. 
* @author Tommy Wei, Robert Jin
* @version 7.0, June 12
*/

public class Map{
  //Variables
  Tile[][] tileList = new Tile[19][24];
  int[][] mapList = new int[16][24];
  Items [][] itemList = new Items[16][24];
  //Constructor
  Map(int mapChoice){
    mapList = (setMap(mapChoice));
    makeTiles(setMap(mapChoice));
    makeItems(setMap(mapChoice));
  }
  
  /**
   * setMap
   * Initializes the map based on the param choice
   * @param int for map choice
   * @return an integer 2d array of every tile on the map
   */
  public int[][] setMap(int mapChoice) {
    if (mapChoice == 1) {
      int[][] mapTemp =
       {
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,1,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,0,0},
        {0,1,0,0,1,7,7,1,1,1,2,1,1,1,0,0,1,7,1,0,0,1,0,0},
        {0,1,0,0,1,1,0,0,0,0,7,0,0,1,0,4,4,4,4,0,0,1,0,0},
        {0,1,1,0,0,1,1,0,0,0,7,1,1,1,0,4,4,4,4,0,0,1,0,0},
        {0,0,1,0,0,0,1,7,1,0,1,1,1,0,0,0,1,0,0,0,0,1,1,0},
        {0,1,1,0,0,0,1,7,1,1,0,0,1,0,0,0,1,1,1,0,0,0,0,0},
        {0,1,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,1,1,0,0,0},
        {0,1,1,1,0,0,1,1,1,1,0,0,1,0,0,1,7,1,1,1,1,0,0,0},
        {0,1,1,1,0,1,1,0,0,0,0,1,1,0,0,7,7,0,0,7,1,0,0,0},
        {0,1,1,1,0,1,1,1,0,0,0,1,0,0,0,1,0,1,7,2,7,7,7,0},
        {0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,7,0,0,7,0},
        {0,1,1,1,0,0,1,7,1,0,0,1,1,1,0,1,1,0,0,7,0,0,1,0},
        {0,1,1,1,0,0,1,1,1,0,0,0,0,7,1,1,1,0,0,7,0,0,0,0},
        {0,1,1,1,1,1,1,1,1,0,1,7,7,2,0,1,1,0,0,7,1,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {20, 14},
        {22, 12, 0},
        {22, 5},
      };
        return mapTemp;
    } else if (mapChoice == 2) {
      int[][] mapTemp =
       {
        {2,1,0,0,0,0,0,0,0,0,0,0},
        {2,1,1,1,0,0,0,1,1,1,1,0},
        {2,0,0,1,0,0,0,1,0,0,1,0},
        {2,1,1,1,0,1,1,1,0,0,1,0},
        {2,1,0,0,1,1,0,0,0,0,1,0},
        {2,1,1,1,1,0,0,0,0,0,1,0},
        {2,2,2,1,1,1,1,1,1,1,1,0},
        {2,2,2,1,0,0,0,0,0,0,0,0},
        {3,3,2,1,0,1,1,1,0,0,0,0},
        {3,3,2,1,1,1,2,1,1,1,1,0},
        {3,3,2,2,2,2,2,1,1,2,1,0},
        {3,3,3,3,3,3,2,2,2,2,1,0},      
      };
        return mapTemp;
    } else if (mapChoice == 3){
      int[][] mapTemp =
       {
        {3,1,0,3,3,3,3,0,0,0,0,0},
        {3,1,0,3,3,3,0,0,1,1,1,2},
        {3,1,0,0,0,0,0,1,1,0,1,2},
        {3,1,1,1,0,0,1,1,0,0,1,2},
        {0,0,0,1,0,0,1,0,0,0,1,2},
        {2,2,0,1,0,0,1,0,0,0,1,2},
        {3,2,0,1,0,0,1,0,0,0,1,2},
        {3,2,0,1,0,0,1,0,0,0,1,2},
        {2,2,0,1,0,0,1,0,0,0,1,2},
        {2,0,1,1,0,0,1,0,0,0,1,2},
        {0,0,1,0,0,0,1,0,0,0,1,2},
        {0,0,1,1,1,1,1,0,0,0,1,2},      
      };
      return mapTemp;
    } else {
      int[][] mapTemp =
       {
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0},      
      };
      return mapTemp;
    }
  }
  
  /**
   * makeTiles
   * initializes every tile of the chosen map into the tileList
   * @param void
   * @return void
   */
  public void makeTiles(int[][]map){
    int tempX = 0;
    int tempY = 0;
    int tSize = 48;
    
    try{
    for (int i =0; i <16;i++){
      for (int j =0;j <24;j++){
        if (map[i][j] == 1){
          PathTile t = new PathTile(tempX,tempY,tSize,tSize);
          tileList[i][j]=(t);
        }else if (map[i][j] == 2){
          GrassTile t = new GrassTile(tempX,tempY,tSize,tSize);
          tileList[i][j]=(t);
        }else if (map[i][j] == 3){
          IceTile t = new IceTile(tempX,tempY,tSize,tSize);
          tileList[i][j]=(t);
        }else if (map[i][j] == 6){
          SandTile t = new SandTile(tempX,tempY,tSize,tSize);
          tileList[i][j]=(t);
        }else if (map[i][j] == 4){
          WaterTile t = new WaterTile(tempX,tempY,tSize,tSize);
          tileList[i][j]=(t);
        }else if (map[i][j] == 5){
          LavaTile t = new LavaTile(tempX,tempY,tSize,tSize);
          tileList[i][j]=(t);
        }else if (map[i][j] == 7){
          StoneTile t = new StoneTile(tempX,tempY,tSize,tSize);
          tileList[i][j]=(t);
        }else if (map[i][j] == 0){
          WallTile t = new WallTile(tempX,tempY,tSize,tSize);
          tileList[i][j]=(t);
        }else{
          WallTile t = new WallTile(tempX,tempY,tSize,tSize);
          tileList[i][j]=(t);
        }
        tempX += tSize;
      }
      //Move down y axis
      tempX = 0;
      tempY += tSize;
    } 
    //Reset
    tempX = 0;
    tempY = 0;
    }catch(Exception e){
      System.out.println("Error making sprites");
    }
    tileList[1][1].changed = true;
    tileList[1][1].loadSprite();
  }
    
  public void makeItems(int[][]map){
    int tempX;
    int tempY;
    int tSize = 48;
    
    try{
      for (int i = 0; i < map[16].length/2; i+=2){
        Floaty f = new Floaty(map[16][i]*tSize,map[16][i+1]*tSize,tSize,tSize);
        itemList[0][i] = f;
      }
      for (int i = 0; i < map[17].length/3; i+=3){
        WaterBottle w = new WaterBottle(map[17][i]*tSize,map[17][i+1]*tSize,tSize,tSize, map[17][i+2]);
        itemList[1][i] = w;
      }
      for (int i = 0; i < map[18].length/2; i+=2){
        Key k = new Key(map[18][i]*tSize,map[18][i+1]*tSize,tSize,tSize);
        itemList[2][i] = k;
      }
    }catch(Exception e){
      System.out.println("Error making sprites");
    }
  }
  
  /**
   * draw
   * Draws every tile in the map onto jpanel
   * @param Graphics g to draw sprite
   * @return void
   */
  public void draw(Graphics g){
    
    try{
      for (int i=0;i<16;i++){
        for (int j=0;j<24;j++){
          tileList[i][j].draw(g); 
        }
      }
      for (int x = 0; x < itemList.length; x++) {
        for (int y = 0; y < itemList[x].length; y++) {
          if (itemList[x][y] != null) {
            itemList[x][y].draw(g);
          }
        }
      }
    }catch(Exception e){
      System.out.println("There was an error loading the map");
    }
  }
}