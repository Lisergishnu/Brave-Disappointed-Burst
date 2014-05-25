import java.awt.*;
import java.awt.geom.*;

public class BallView {
   private Color color = Color.BLUE;
   private Ellipse2D.Double shape = null;
   private Ball ball;
   private float width = 64;
   private float height = 64;
   
   public BallView (Ball b){
      ball = b;
      shape = new Ellipse2D.Double(b.getPosition(), 0, width, height);
   }
   public boolean contains (double x, double y){
      return shape.contains(x, y);
   }
   public void setSelected (){
      color = Color.RED;
   }
   public void setReleased() {
      color = Color.BLUE;
   }
   public void updateView(Graphics2D g) {
      double radius = ball.getRadius();
      shape.setFrame(ball.getPosition()-radius, -radius, 2*radius, 2*radius);
      g.setColor(color);
      g.fill(shape);
   }
}