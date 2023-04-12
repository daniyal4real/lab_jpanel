/**
*  Program: GUIFrame.java
*  Project: Treasure Hunt
*  Class:   Java
*  @author  Zheng
*  @since   3/7/2022
*/
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionListener;   //add this for the listener
import java.awt.event.ActionEvent; 

public class GUIFrame extends JPanel {
   
   /************ panels and controls *************/
   
   // 3 sub-panels 
   private JPanel topSubPanel = new JPanel();
   private JPanel centerSubPanel = new JPanel();
   private JPanel bottomSubPanel = new JPanel();

   // labels for panels
   private JLabel lTitle = new JLabel("Where is the treasure?");
  
  
   // Task 1: add 6 buttons with the following text on them:
   // Fire, Mountain, River, Storm, Bandits, Magic Door
   //*To be implemented!*
    JButton fire = new JButton("Fire");
    JButton mountain = new JButton("Mountain");
    JButton river = new JButton("River");
    JButton storm = new JButton("Storm");
    JButton bandits = new JButton("Bandits");
    JButton magicDoor = new JButton("Magic Door");

   // Task 2: add 3 labels with the following text on them:
   //GOLD, GEM, SECRET CODE
   //*To be implemented!*   
    JLabel gold = new JLabel("GOLD");
    JLabel gem = new JLabel("GEM");
    JLabel secretCode = new JLabel("SECRET CODE");

   // declare ActionListener object
   private GUIListener listener = new GUIListener();  
   
      
  /**
  * Constructor holds everything.
  */
   public GUIFrame() {
      
      /************* set up layout **********/ 
    
      setLayout(new BorderLayout()); //Border panel layout
      
      // set Dimension(width, height)
      setPreferredSize(new Dimension(500, 400));
           
      topSubPanel.setBackground(Color.white);         //top color
      centerSubPanel.setBackground(Color.lightGray);  //center color
      bottomSubPanel.setBackground(Color.white);      //bottom color
     
      /************* set up top panel **********/ 
      topSubPanel.add(lTitle); 
      add(topSubPanel, BorderLayout.NORTH);
     
      /************* set up center panel **********/  
      
      // Task 3: Disable all buttons except for Fire Button
      //*To be implemented!*
      fire.setEnabled(true);
      mountain.setEnabled(false);
      river.setEnabled(false);
      storm.setEnabled(false);
      bandits.setEnabled(false);
      magicDoor.setEnabled(false);
      // Task 4: Add listener to all buttons
      //*To be implemented!*             
      fire.addActionListener(listener);
      mountain.addActionListener(listener);
      river.addActionListener(listener);
      storm.addActionListener(listener);
      bandits.addActionListener(listener);
      magicDoor.addActionListener(listener);


      // Task 5: Add all buttons to the center panel 
      //*To be implemented!*            
       centerSubPanel.add(fire);
       centerSubPanel.add(mountain);
       centerSubPanel.add(river);
       centerSubPanel.add(storm);
       centerSubPanel.add(bandits);
       centerSubPanel.add(magicDoor);
      //add the center sub-panel to Center of main panel
      add(centerSubPanel, BorderLayout.CENTER);
     
     /************* set up bottom panel **********/  
      
      // Task 6: Set the Gem, Gold, and Secret Code labels' visibility to false
      //*To be implemented!*      
       gold.setVisible(false);
       gem.setVisible(false);
       secretCode.setVisible(false);
      // Task 7: Add the Gem, Gold, and Secret Code labels to the bottom panel
      //*To be implemented!*      
       bottomSubPanel.add(gold);
       bottomSubPanel.add(gem);
       bottomSubPanel.add(secretCode);
      //add bottomSubPanel sub-panel to South area of main panel      
      add(bottomSubPanel, BorderLayout.SOUTH);   
        
   } //close Panel constructor
 
 
   /**
   *  Private ActionListener class.
   *  A nested class implementing ActionListener
   */
   private class GUIListener implements ActionListener {
   
      /**
      * ActionPerformed method.
      * @param event what button is clicked.
      */ 
      public void actionPerformed(ActionEvent event) {
             
         
         // Task 8: If each button is clicked, enable the next one
         // if Fire Button is clicked, enable Mountain Button
         // if Mountain Button is clicked, enable River Button 
         // if River Button is clicked, enable Storm Button 
         // if Storm Button is clicked, enable Bandits Button 
         // if Bandits Button is clicked, enable Magic Door Button
        if (event.getActionCommand().equals("Fire")) {
            mountain.setEnabled(true);
        }
        if (event.getActionCommand().equals("Mountain")) {
            river.setEnabled(true);
        }
        if (event.getActionCommand().equals("River")) {
            storm.setEnabled(true);
        }
        if (event.getActionCommand().equals("Storm")) {
            bandits.setEnabled(true);
        }
        if (event.getActionCommand().equals("Bandits")) {
            magicDoor.setEnabled(true);
        }
        
         // Task 9: if Magic Door is clicked, 
         // Set all treasure labels' visibility to true
         //*To be implemented!*
          if (event.getActionCommand().equals("Magic Door")) {
              gold.setVisible(true);
              gem.setVisible(true);
              secretCode.setVisible(true);
          }


      } //actionEvent method
   } // end listener class
   

} //end class
