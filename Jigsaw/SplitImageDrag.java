import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class SplitImageDrag extends Image
{
    public static ArrayList coordiantesArray = null;
    public static ArrayList tempArray = new ArrayList();
    public static HashMap imageCoordinateMap = new HashMap();
    public static Boolean correct = false; //this is final flag. it will true only if all images are place correctly.
    GreenfootImage image;
    int mouseX, mouseY, index;
    String nameCanvas = null;
    String name = null;
    public static ArrayList<String> nameImage = null; 
    public static int noOfSplitImages = 0;
    
    public SplitImageDrag()
    {
        nameImage = new ArrayList<String>();
        noOfSplitImages = Canvas.splitImagesMap.size() ;
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

        if(Greenfoot.mouseDragEnded(this))
        {
            int finalX = mouseX;
            int finalY = mouseY;
            coordiantesArray = new ArrayList();
            coordiantesArray.add(finalX);
            coordiantesArray.add(finalY);
            coordiantesArray.add(name);
            coordiantesArray.add(index);
            String name = (String) Canvas.splitImagesMap.get(this.getImage());
            System.out.println("name :: " + name + "  " + this.getImage());
            List list = pw.getObjects(Canvas.class);
            List matrixList = pw.getObjectsAt(finalX, finalY, Canvas.class);
            
            if(!matrixList.isEmpty()){
            
            Actor canvas = (Actor) matrixList.get(0);
            System.out.println("Size :: " + list.size() + "  " + matrixList.size());
            
            for(int i =0;i<list.size();i++)
            {
                Actor canvasAll = (Actor) list.get(i);
            
                if(canvas.equals(canvasAll))
                {
                    System.out.println("Found");
                    nameCanvas = (String)SelectModeButton.matrix.get(i);
                    break;
                }
            
            }
            
           System.out.println("kal split image name::: "+ Canvas.splitImagesMap.get(this.getImage()) + "kal canvas name:: "+ nameCanvas);
            
           if(nameCanvas.equals(Canvas.splitImagesMap.get(this.getImage())))
           {
               if(nameImage.contains(name)){
                   System.out.println("same image");
                
              }
              else
              {
                  
                System.out.println("matching");

                correct = true;
                nameImage.add(name);
                
              }
           }           
           else
           {
               correct = false;
               System.out.println("not matching");
           }
           // this is final flag. it will true only if all images are place correctly.
            System.out.println("Final Flag :: " + correct);
            System.out.println("noOfSplitImages :: " + noOfSplitImages);
            System.out.println("nameImage.size() :: " + nameImage.size());
            
            if(nameImage.size() == noOfSplitImages)
            {
                    Canvas.split_flag = "false";
            }
            
           }
       }
       
    }  
}
