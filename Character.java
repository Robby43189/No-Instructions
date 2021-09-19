//Graphics, Image IO, Math, and Arraylist imports
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.util.ArrayList;
import java.lang.Math;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.*;
import javax.sound.sampled.*;
class Character{
  
  //Variables
  int x;
  int y;
  Map map;
  BufferedImage sprite;
  int keys;
  boolean floaty = false;
  boolean bottle = false;
  boolean key = false;
  boolean filledBottle = false;
  boolean lookingL = false;
  
  //Constructor
  Character(Map map){
    this.x = 48;
    this.y = 48;
    this.map = map;
    loadSprite();
  }
  
  
  public int checkCollision(int newX,int newY){
    
    //1 Go
    //2 Stop
    //3 Force user to glide
    //4 Go but don't change tile
    //5 Walk but dies
    int tileX = newX/48;
    int tileY = newY/48;
    
    if(tileX >=0 && tileX <= 23 && tileY >=0 && tileY <= 15) {
      for (int i = 0; i < map.itemList.length; i++) {
        for (int j = 0; j < map.itemList[i].length; j++) {
          if ((map.itemList[i][j]) instanceof Items && newY == map.itemList[i][j].y && newX == map.itemList[i][j].x) {
            if ((map.itemList[i][j]) instanceof Floaty) {
              floaty = true;
            } else if ((map.itemList[i][j]) instanceof WaterBottle) {
              bottle = true;
            } else if ((map.itemList[i][j]) instanceof Key) {
              key = true;
              for (int g =0; g < map.tileList.length; g++) {
                for (int h =0; h < map.tileList.length; h++) {
                  if (map.tileList[g][h] instanceof PathTile || map.tileList[g][h] instanceof WaterTile || map.tileList[g][h] instanceof PathTile || map.tileList[g][h] instanceof GrassTile || map.tileList[g][h] instanceof LavaTile || map.tileList[g][h] instanceof SandTile) {
                    if (map.tileList[g][h].changed != true) {
                      key = false;
                    }
                  } else if (map.tileList[g][h] instanceof StoneTile) {
                    if (map.tileList[g][h].cracked < 2) {
                      key = false;
                    }
                  }
                }
              }
              
            }
            map.itemList[i][j].pickedUp = true;
            map.itemList[i][j].loadSprite();
          }
        }
      }
      if ((map.tileList[(newY/48)][(newX/48)]) instanceof StoneTile && map.tileList[(newY/48)][(newX/48)].cracked < 1){
        map.tileList[(newY/48)][(newX/48)].cracked = 1;
        return 1;
      } else if ((map.tileList[(newY/48)][(newX/48)]) instanceof StoneTile && map.tileList[(newY/48)][(newX/48)].cracked == 1){
        map.tileList[(newY/48)][(newX/48)].cracked = 2;
        map.tileList[(newY/48)][(newX/48)].changed = true;
        map.tileList[(newY/48)][(newX/48)].loadSprite();
        return 1;
      } else if ((map.tileList[(newY/48)][(newX/48)]) instanceof GrassTile){
        map.tileList[(newY/48)][(newX/48)].changed = true;
        return 1;
      } else if (map.tileList[(newY/48)][(newX/48)].changed != true) {
        if((map.tileList[(newY/48)][(newX/48)]) instanceof PathTile){
          map.tileList[(newY/48)][(newX/48)].changed = true;
          map.tileList[(newY/48)][(newX/48)].loadSprite();
          return 1;
        } else if ((map.tileList[(newY/48)][(newX/48)]) instanceof IceTile){
          map.tileList[(newY/48)][(newX/48)].changed = true;
          map.tileList[(newY/48)][(newX/48)].loadSprite();
          return 3;
        } else if ((map.tileList[(newY/48)][(newX/48)]) instanceof WaterTile){
          if (floaty == true) {
            if (bottle == true && filledBottle == false) {
              filledBottle = true;
            }
            map.tileList[(newY/48)][(newX/48)].changed = true;
            map.tileList[(newY/48)][(newX/48)].loadSprite();
            return 1;
          } else {
            return 5;
          }
        } else if ((map.tileList[(newY/48)][(newX/48)]) instanceof LavaTile){
          if (bottle == true && filledBottle == true) {
            map.tileList[(newY/48)][(newX/48)].changed = true;
            map.tileList[(newY/48)][(newX/48)].loadSprite();
            return 1;
          } else {
            return 5;
          }
        } else if ((map.tileList[(newY/48)][(newX/48)]) instanceof SandTile){
          if (bottle == true && filledBottle == true) {
            filledBottle = false;
          }
          map.tileList[(newY/48)][(newX/48)].changed = true;
          return 1;
        } else {
          return 2;
        }
      } else {
        return 2;
      }
    } else {
      return 2;
    }
  }
  
  public void draw(Graphics g){
    g.drawImage(sprite,x,y,48,48,null);
  }
  
  public static void playSound(String fileName) throws LineUnavailableException, UnsupportedAudioFileException, IOException{
    File url = new File(fileName);
    Clip clip = AudioSystem.getClip();
    
    AudioInputStream ais = AudioSystem.
      getAudioInputStream( url );
    clip.open(ais);
    clip.start();
  }
  
  void loadSprite(){
    if (lookingL == true) {
      try{
        sprite = ImageIO.read(new File("CharacterL.png"));
      } catch(Exception e) { 
        System.out.println("error loading slime");
      }
    } else {
      try{
        sprite = ImageIO.read(new File("CharacterR.png"));
      } catch(Exception e) { 
        System.out.println("error loading slime");
      }
    }
  }
  
}