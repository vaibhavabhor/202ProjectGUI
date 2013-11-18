import greenfoot.*; 
import java.util.*;

public class SplitImage extends Actor
{
    public static ArrayList coordiantesArray = null;
    public static ArrayList tempArray = new ArrayList();
    public static HashMap imageCoordinateMap = new HashMap();
    GreenfootImage image;
    int mouseX, mouseY, index;
    String name=null;
    
    public void split(GreenfootImage imageName, int i)
    {
    image = imageName;
    index = i;
    System.out.println("Inside Split" +image + i );
    
    }
    
    
    public SplitImage(Image imageName, int i)
    {
      
        image = imageName.getImage();
      //  name = imageName;
        index = i;
        image.scale(75,75);
        setImage(image);
    }
    
    public SplitImage()
    {
    }

    public void act() 
    {
        World pw = getWorld();
        
        if(Greenfoot.mouseDragged(this))
        { 
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY(); 
            setLocation(mouseX, mouseY);
            System.out.println("Inside act");
        }

        if(Greenfoot.mouseDragEnded(image))
        {
            int finalX = mouseX;
            int finalY = mouseY;
            coordiantesArray = new ArrayList();
            coordiantesArray.add(finalX);
            coordiantesArray.add(finalY);
            coordiantesArray.add(name);
            coordiantesArray.add(index);
        }

    }    
}
