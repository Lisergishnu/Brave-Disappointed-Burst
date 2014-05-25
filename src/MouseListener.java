import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.*;
import java.awt.geom.Point2D;

public class MouseListener extends MouseAdapter {
   private MyWorld world;
   private PhysicsElement currentElement;
   private final double TOLERANCE = 0.2;
   public MouseListener (MyWorld w){
      world = w;
   } 
   public void mouseMoved(MouseEvent e) {
      Point2D.Double p = new Point2D.Double(0,0); // Change mouse coordenates from
      MyWorldView.SPACE_INVERSE_TRANSFORM.transform(e.getPoint(),p);// pixels to meters.
      PhysicsElement newElement = world.find(p.getX(), p.getY()); 
      if (newElement == currentElement) return;
      if (currentElement != null) {
         currentElement.setReleased();
         currentElement = null;
      }
      if (newElement != null) { 
         currentElement = newElement;
         currentElement.setSelected();
         
		   if (currentElement instanceof Ball) {
		      System.out.println("BallSelected");
		   }    
		   else if (currentElement instanceof FixedHook){
			  System.out.println("FixedHook Selected");
		   }
		   else if (currentElement instanceof Spring){	   
		      System.out.println("Spring Selected");
		   }
      }
      
      world.repaintView();
   }
   
   public void mouseDragged(MouseEvent e) {
	   if (currentElement instanceof Ball) {
		      System.out.println("Dragging Ball");
		   }    
		   else if (currentElement instanceof FixedHook){
			  System.out.println("Dragging FixedHook");
		   }
		   else if (currentElement instanceof Spring){	   
		      System.out.println("Dragging Spring");
		   }
   }
   
   public void mouseReleased(MouseEvent e) {
      if (currentElement == null) return;
      else if (currentElement instanceof Spring) {
         Point2D.Double p= new Point2D.Double(0,0);
         MyWorldView.SPACE_INVERSE_TRANSFORM.transform(e.getPoint(),p);

          // we dragged a spring, so we look for and attachable element near by  
         SpringAttachable element = world.findSpringAttachable(p.getX(), p.getY());
         if (element != null) {
            // we dragged a spring and it is near an attachable element,
            // so we hook it to a spring end.
            Spring spring = (Spring) currentElement;
            double a=spring.getAendPosition();
            if (a==p.getX())
               spring.attachAend(element);
            double b=spring.getBendPosition();
            if (b==p.getX())
               spring.attachBend(element);
          }
      }    
      else {
      }
	  System.out.println("Mouse released.");
      currentElement.setReleased();
      currentElement = null;
      world.repaintView();
   }
}