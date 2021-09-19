//Mouse imports
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
* ButtonMouseListener.java
* Checks for button clicks in the starting frame of the game
* @author Tommy Wei, Robert Jin
* @version Sept 19
*/

class ButtonMouseListener implements MouseListener {
  
  //Variables
  ArrayList<Button> buttonList = new ArrayList<Button>();
  
  //Constructor
  ButtonMouseListener(ArrayList<Button> buttons){
    this.buttonList = buttons;
  }
  
  /**
   * mouseClicked
   * Takes in the mouse clicked information to activate buttons when clicked
   * @param Mouse information 
   * @return void
   */
  public void mouseClicked(MouseEvent e) {
    for (int i = 0; i < buttonList.size(); i++) {
      if((e.getX() >= buttonList.get(i).getX()) && (e.getX() <= (buttonList.get(i).getX()+buttonList.get(i).getLength()))){ //Check X axis
        if((e.getY() >= buttonList.get(i).getY()) && (e.getY() <= (buttonList.get(i).getY()+buttonList.get(i).getHeight()))){ //Check Y axis
          buttonList.get(i).setClicked(true);
        }
      }
    
    }
  }
      
  public void mousePressed(MouseEvent e) {
  }
    
  public void mouseReleased(MouseEvent e) {
  }
    
  public void mouseEntered(MouseEvent e) {
  }
    
  public void mouseExited(MouseEvent e) {
  }
      
} //end of mouselistener