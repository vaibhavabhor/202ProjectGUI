import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ModeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ModeScreen extends Actor
{
    /**
     * Act - do whatever the ModeScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mouseX,prevMouseX = 0,prevMouseY = 0, mouseY, index;
    World pw = getWorld();
    Actor knob;
    public void act() 
    {
        if(Greenfoot.mousePressed(this)) 
        {
         MouseInfo mouse = Greenfoot.getMouseInfo();  
         mouseX=mouse.getX();  
         mouseY=mouse.getY(); 
         System.out.println("X cordiante in screen is"+mouseX + "Y coordiante is"+ mouseY );
         
         if(mouseX > 466 
         && mouseX < 480
         && mouseY > 240
         && mouseY < 260)
         {
         System.out.println("Condition Satified!");
         knob = getOneObjectAtOffset(100,100,ModeKnob.class);
         /////knob.setLocation(460,250);
         //knob.setLocation();
         }
        }
    }    
}
