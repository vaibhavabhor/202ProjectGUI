import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ModeKnob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ModeKnob extends Actor
{
    int mouseX,prevMouseX = 0,prevMouseY = 0, mouseY, index;
    /**
     * Act - do whatever the ModeKnob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
              
         if(Greenfoot.mouseDragged(this))
        { 
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY(); 
            
            //if(!(Math.abs(prevMouseY-mouseY) > 2))
            //{
                if (mouseX > 470 
                    && mouseX < 680
                    && mouseY >240
                    && mouseY < 260 )
                    {
            setLocation(mouseX, mouseY);
            //}
             System.out.println("X cordiante is"+mouseX + "Y coordiante is"+ mouseY );
            }
            if(prevMouseX != 0 )
                prevMouseX = mouseX;
            if(prevMouseY != 0 )
                prevMouseY = mouseY;
        }
    }    
}
