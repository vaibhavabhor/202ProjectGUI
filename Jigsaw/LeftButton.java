import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class LeftButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftButton extends CommandButton
{
    /**
     * Act - do whatever the LeftButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        World pw = getWorld();
        
        if(Greenfoot.mousePressed(this) && SelectModeButton.modeFlag==true)
        {
          List leftImage = pw.getObjects(LeftImage.class);
          List rightImage = pw.getObjects(RightImage.class);
          List middleImage = pw.getObjects(MiddleImage.class);
          pw.removeObjects(rightImage);
          pw.removeObjects(middleImage);
          pw.removeObjects(leftImage);
          pw.addObject(new LeftImage(),320,535);
          pw.addObject(new MiddleImage(),500,535);
          
        } 
    }    
}
