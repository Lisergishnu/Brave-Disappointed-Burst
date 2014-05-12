import java.awt.event.*; 
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class LabMenuListener implements ActionListener {
   private MyWorld  world;
   public LabMenuListener (MyWorld  w){
      world = w;
   }
   public void actionPerformed(ActionEvent e) {
      JMenuItem menuItem = (JMenuItem)(e.getSource());
      String text = menuItem.getText();
      
      // Actions associated to main manu options
      if (text.equals("My scenario")) {  // here you define Etapa2's configuration
       // to be coded
      }
      if (text.equals("Ball")) {
        // nothing by now       
      }
      if (text.equals("Fixed Hook")) ; // ; same as nothing
      if (text.equals("Spring")) ;

      // Actions associated to MyWorld submenu
      if (text.equals("Start"))  world.start();
      if (text.equals("Stop"))    world.stop();
      if (text.equals("Delta time")) {
         String data = JOptionPane.showInputDialog("Enter delta t [s]", "0.0001");
         if (data == null) 
            data = "0.0001";
         world.setDelta_t(Double.parseDouble(data));
      }
      if (text.equals("View Refresh time")) {
         String data = JOptionPane.showInputDialog("Enter refresh time [s]", "0.1");
         if (data == null) 
            data = "0.1";
         world.setRefreshPeriod(Double.parseDouble(data));
      }
   }
}
