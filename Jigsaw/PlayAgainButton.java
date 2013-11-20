import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * this class redirects user back to the mode selection screen
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgainButton extends CommandButton
{
     List canvas;
    /**
     * Act - do whatever the PlayAgainButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
                if(Greenfoot.mousePressed(this))
        {
            //The following code will be part of the composite object 
            //for Mode Screen once it is implemented         
            World w = getWorld();
            List gameScreen =  w.getObjects(GameScreen.class);
            List btnList =  w.getObjects(CommandButton.class);
            List canvas =  w.getObjects(Canvas.class);
            List timer =  w.getObjects(Timer.class);
            List imageContainer=w.getObjects(ImageContainer.class);
            w.removeObjects(btnList);
            w.removeObjects(imageContainer);
            w.removeObjects(timer);
            w.removeObjects(canvas);
            w.addObject(new ModeScreen(),490,200);
            w.addObject(new SelectModeButton(),100,300);
            w.addObject(new ModeKnob(),470,250);
            w.addObject(new ImageContainer(),400,525);
            w.addObject(new LeftButton(),100,535);
            w.addObject(new RightButton(),650,535);

        }
    }    
}
