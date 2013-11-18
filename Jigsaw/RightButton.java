import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class RightButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightButton extends CommandButton
{
    /**
     * Act - do whatever the RightButton wants to do. This method is called whenever
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
          pw.removeObjects(leftImage);
          pw.removeObjects(middleImage);
          pw.removeObjects(rightImage);
          pw.addObject(new MiddleImage(), 320,535);
          pw.addObject(new RightImage(),500,535);// Add your action code here.
        } 
    }    
}
