import java.awt.event.*; 
import java.util.*;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class LabMenuListener implements ActionListener {
   private MyWorld  world;
   Random r = new Random();
   public LabMenuListener (MyWorld  w){
      world = w;
   }
   public void actionPerformed(ActionEvent e) {
      JMenuItem menuItem = (JMenuItem)(e.getSource());
      String text = menuItem.getText();
      
      // Actions associated to main manu options
      if (text.equals("My scenario")) {  // here you define Etapa2's configuration
    	  double mass = 1.0;
          double radius = 0.1;
    	 Ball b1 = new Ball(mass,radius,1,0);
         Ball b2 = new Ball(mass,radius,2,0);
         FixedHook h1  = new FixedHook(0,.2);
         Spring s1 = new Spring(.5,1);
         Spring s2 = new Spring(.5,1);
         Block bloque1 = new Block(mass,.2,3,0,1,world);
         world.addElement(b1);
         world.addElement(b2);
         world.addElement(h1);
         world.addElement(s1);
         world.addElement(s2);
         world.addElement(bloque1);
         s1.attachAend(h1);
         s1.attachBend(b1);
         s2.attachAend(b2);
         s2.attachBend(bloque1);
      }
      if (text.equals("Ball")) 
    	  world.addElement(new Ball(0.1 + r.nextDouble() *3,0.05 + r.nextDouble() *0.2,0.1 + r.nextDouble()*3 , 0));     
      if (text.equals("Fixed Hook"))  // ; same as nothing
    	  world.addElement(new FixedHook(0.1 + r.nextDouble() *3,0.1 + r.nextDouble() *0.3));  
      if (text.equals("Spring")) 
    	  world.addElement(new Spring(0.1 + r.nextDouble() *3,0.1 + r.nextDouble() *0.5));  

      // Actions associated to MyWorld submenu
      if (text.equals("Start"))
    	  world.start();
      if (text.equals("Stop"))
    	  world.stop();
      if (text.equals("Delta time")) {
         String data = JOptionPane.showInputDialog("Enter delta t [s]", "0.0001");
         if (data == null) 
            data = "0.0001";
         world.setDelta_t(Double.parseDouble(data));
      }
      if (text.equals("View Refresh time")) {
         String data = JOptionPane.showInputDialog("Enter refresh time [s]", "0.01");
         if (data == null) 
            data = "0.01";
         world.setRefreshPeriod(Double.parseDouble(data));
      }
   }
}
