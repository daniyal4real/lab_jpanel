/**
*  Program: DriverTreasureHunt.java
*  Project: Treasure Hunt
*  Class:   Java
*  @author  Zheng
*  @since   3/7/2022
*/

import javax.swing.JFrame;

public class DriverTreasureHunt {
   /** main method.
   * @param args not used
   */
   public static void main(String[ ] args) {
      //setup basic JFrame
        
      JFrame frm = new JFrame("Treasure Hunt by Zheng");
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Add Panel object to Frame
      frm.getContentPane().add(new GUIFrame());
      //Display to screen
      frm.pack();
      frm.setVisible(true);
      
      
   }
}