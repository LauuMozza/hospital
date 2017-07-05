package hospital_bd;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
 

public class fondo implements Border{
    public BufferedImage back;
 
    public fondo(){
        try {
            URL imagePath = new URL(getClass().getResource("../Imagenes/blank.png").toString());
            back = ImageIO.read(imagePath);
        } catch (Exception ex) {            
        }
    }

  @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if(back !=null);{
      
     g.drawImage(back, 0, 0,width,height, null);
 
    
    }};
 
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }
 
    public boolean isBorderOpaque() {
        return false;
    }
 
}
