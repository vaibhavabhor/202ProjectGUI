import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftImage extends Image
{
     int mouseX, mouseY, index;
    /**
     * Act - do whatever the LeftImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseDragged(this))
        { 
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY(); 
            setLocation(mouseX, mouseY);
        }
    }    
}
