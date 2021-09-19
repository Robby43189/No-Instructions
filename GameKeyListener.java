import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import javax.sound.sampled.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;

class GameKeyListener implements KeyListener {
  
  //Variables
  Character[] mainChar = new Character[1];
    
  //Constructor
  GameKeyListener(Character mainChar) {
    this.mainChar[0] = mainChar;
  }
    
  /**
   * keyTyped
   * Takes in the key typed information and performs corresponding actions
   * @param keyEvent e to detect which key is pressed 
   * @return void
   */
  public void keyTyped(KeyEvent e) {
    if(e.getKeyChar() == 'w' ){
      if ((mainChar[0].checkCollision(mainChar[0].x,mainChar[0].y-48)) == 1){
        mainChar[0].y -= 48;
        /*try {
            mainChar[0].playSound("move.wav");
          } catch (MalformedURLException ex) {
          } catch (LineUnavailableException ex) {
          } catch (UnsupportedAudioFileException ex) {
          } catch (IOException ex) {
          }*/
      }
    }else if(e.getKeyChar() == 'a' ){
      if ((mainChar[0].checkCollision(mainChar[0].x-48,mainChar[0].y)) == 1){
        mainChar[0].x -= 48;
        mainChar[0].lookingL = true;
        mainChar[0].loadSprite();
        /*try {
            mainChar[0].playSound("move.wav");
          } catch (MalformedURLException ex) {
          } catch (LineUnavailableException ex) {
          } catch (UnsupportedAudioFileException ex) {
          } catch (IOException ex) {
          }*/
      }
    }else if(e.getKeyChar() == 's' ){
      if ((mainChar[0].checkCollision(mainChar[0].x,mainChar[0].y+48)) == 1){
        mainChar[0].y += 48;
        /*try {
            mainChar[0].playSound("move.wav");
          } catch (MalformedURLException ex) {
          } catch (LineUnavailableException ex) {
          } catch (UnsupportedAudioFileException ex) {
          } catch (IOException ex) {
          }*/
      }
    }else if(e.getKeyChar() == 'd' ){
      if ((mainChar[0].checkCollision(mainChar[0].x+48,mainChar[0].y)) == 1){
        mainChar[0].x += 48;
        mainChar[0].lookingL = false;
        mainChar[0].loadSprite();
        /*try {
            mainChar[0].playSound("move.wav");
          } catch (MalformedURLException ex) {
          } catch (LineUnavailableException ex) {
          } catch (UnsupportedAudioFileException ex) {
          } catch (IOException ex) {
          }*/
      }
    }
  }

  public void keyPressed(KeyEvent e) {
  }   
  
  public void keyReleased(KeyEvent e) {
  }
      
      
  } //end of keyboard listener