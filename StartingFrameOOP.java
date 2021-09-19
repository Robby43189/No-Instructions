import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.File;

class StartingFrameOOP extends JFrame { 
  
  //Variables
  static JFrame frame;
  static ArrayList<Button> buttonList = new ArrayList<Button>();
  static BufferedImage sprite;
  
  //Constructor
  public static class StartingFrame {
    StartingFrame() {
      frame = new JFrame("No Instructions");
      JPanel startPanel = new StartingPanel();
      ButtonMouseListener mouseListener = new ButtonMouseListener(buttonList);
      startPanel.addMouseListener(mouseListener);
      frame.getContentPane().add(startPanel);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,500);
      frame.setUndecorated(false);
      frame.setVisible(true);
      frame.setResizable(false);
    }
    
    //Starting panel
    public static class StartingPanel extends JPanel {
      
      //Constructor
      StartingPanel(){
        loadSprite();
      }
      
        public void paintComponent(Graphics g) {          
          setDoubleBuffered(true);  
          g.drawImage(sprite,0,0,500,500,null);
          g.setFont(new Font("Impact", Font.BOLD, 56));
          g.drawString("No Instructions", 100,100);
          for (int i=0;i < buttonList.size();i++){
            buttonList.get(i).draw(g);
          }
      }
    }
  }
  
  public static class LevelSelectFrame {
    LevelSelectFrame() {
      frame = new JFrame("Level Select");
      JPanel selectionPanel = new SelectionPanel();
      ButtonMouseListener mouseListener = new ButtonMouseListener(buttonList);
      selectionPanel.addMouseListener(mouseListener);
      frame.getContentPane().add(selectionPanel);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(448,448);
      frame.setUndecorated(false);
      frame.setVisible(true);
      frame.setResizable(false);
    }
    
    //Starting panel
    public static class SelectionPanel extends JPanel {
      
      //Constructor
      SelectionPanel(){
        loadSprite();
      }
      
        public void paintComponent(Graphics g) {
          for (int i=0;i < buttonList.size();i++){
            buttonList.get(i).draw(g);
          }
      }
    }
  }
  public static void main(String[] args) { 
    
    //Initialize variables
    StartButton startButton = new StartButton(); 
    QuitButton quitButton = new QuitButton();
    int level = 1;
    
    //Adds the buttons to array list 
    buttonList.add(startButton);
    buttonList.add(quitButton);
        
    StartingFrame startFrame = new StartingFrame(); //Makes the starting frame
    
    //stalls until start button is clicked
    while(buttonList.get(0).getClicked() == false){
      System.out.println(""); //Need empty print system so the while loop will run
      //Checks if exit button was clicked
      if (buttonList.get(1).getClicked() == true){
        frame.dispose();
        System.exit(0); //Quit program
      }
    }
    buttonList.get(0).setClicked(false);
    frame.dispose();
    buttonList.clear();
    Level1 level1Button = new Level1(); 
    Level2 level2Button = new Level2();
    Level3 level3Button = new Level3();
    Level4 level4Button = new Level4();
    Level5 level5Button = new Level5();
    Level6 level6Button = new Level6();
    Level7 level7Button = new Level7();
    Level8 level8Button = new Level8();
    Level9 level9Button = new Level9();
    buttonList.add(level1Button);
    buttonList.add(level2Button);
    buttonList.add(level3Button);
    buttonList.add(level4Button);
    buttonList.add(level5Button);
    buttonList.add(level6Button);
    buttonList.add(level7Button);
    buttonList.add(level8Button);
    buttonList.add(level9Button);
    LevelSelectFrame selectionFrame = new LevelSelectFrame();
    while(buttonList.get(0).getClicked() == false && buttonList.get(1).getClicked() == false && buttonList.get(2).getClicked() == false && buttonList.get(3).getClicked() == false && buttonList.get(4).getClicked() == false && buttonList.get(5).getClicked() == false && buttonList.get(6).getClicked() == false && buttonList.get(7).getClicked() == false && buttonList.get(8).getClicked() == false){
      System.out.println(""); //Need empty print system so the while loop will run
    }
    int buttonClicked = 0;
    if (buttonList.get(0).getClicked() == true) {
      buttonClicked = 1;
    } else if (buttonList.get(1).getClicked() == true) {
      buttonClicked = 2;
    } else if (buttonList.get(2).getClicked() == true) {
      buttonClicked = 3;
    } else if (buttonList.get(3).getClicked() == true) {
      buttonClicked = 4;
    } else if (buttonList.get(4).getClicked() == true) {
      buttonClicked = 5;
    } else if (buttonList.get(5).getClicked() == true) {
      buttonClicked = 6;
    } else if (buttonList.get(6).getClicked() == true) {
      buttonClicked = 7;
    } else if (buttonList.get(7).getClicked() == true) {
      buttonClicked = 8;
    } else if (buttonList.get(8).getClicked() == true) {
      buttonClicked = 9;
    }
    frame.dispose();
    new GameFrameOOP(buttonClicked); //Makes actual game frame
  }
   
  public static void loadSprite(){
    try{
      sprite = ImageIO.read(new File("Backdrop.png"));
    } catch(Exception e) { 
      System.out.println("error loading backdrop");
    }
  }

}