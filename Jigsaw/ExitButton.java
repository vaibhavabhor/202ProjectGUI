import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class exits the jigsaw game
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButton extends CommandButton
{
    /**
     * Act - do whatever the ExitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mouseClicked(this))
        {
         System.exit(0);
        }
    }    
}
