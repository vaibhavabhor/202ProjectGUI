import greenfoot.*;  
import java.util.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Image extends Actor
{
    public static ArrayList coordiantesArray = null;
    public static ArrayList tempArray = new ArrayList();
    public static HashMap imageCoordinateMap = new HashMap();
    GreenfootImage image;
    int mouseX, mouseY, index;
    String name=null;

    public Image()
    {
        GreenfootImage img = getImage();
        img.scale(130,130);
        setImage(img);
        
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
           
        }  

//         if(Greenfoot.mouseDragEnded(this))
//         {
//             int finalX = mouseX;
//             int finalY = mouseY;
//             String nameCanvas= null;
//             coordiantesArray = new ArrayList();
//             coordiantesArray.add(finalX);
//             coordiantesArray.add(finalY);
//             coordiantesArray.add(name);
//             coordiantesArray.add(index);
//             String name = (String) Canvas.splitImagesMap.get(this.getImage());
//             System.out.println("name :: " + name + "  " + this.getImage());
//             List list = pw.getObjects(Canvas.class);
//             List matrixList = pw.getObjectsAt(finalX, finalY, Canvas.class);
//             Actor canvas = (Actor) matrixList.get(0);
//             for(int i =0;i<list.size();i++)
//             {
//                 Actor canvasAll = (Actor) list.get(i);
//                 if(canvas.equals(canvasAll))
//                 {
//                     System.out.println("Found");
//                     nameCanvas = (String)SelectModeButton.matrix.get(i);
//                     break;
//                 }
//             
//             }
//             
//             System.out.println("kal::: "+ Canvas.splitImagesMap.get(this.getImage()) + "kal:: "+ nameCanvas);
//             
//            if(nameCanvas.equals(Canvas.splitImagesMap.get(this.getImage())))
//            {
//                   System.out.println("matching");
//            }
//            else
//            {
//              //  this.setLocation(666,100);
//                System.out.println("not matching");
//            }
//                
//                
//        }
       
} 

}   

