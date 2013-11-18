import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PuzzleWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PuzzleWorld extends World
{

    /**
     * Constructor for objects of class PuzzleWorld.
     * 
     */
    public PuzzleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("start_screen_background.jpg");
        init();
    }
    
    public void init()
    {
       
        CommandButton btnStart=new StartButton();
        HTile ht  = new HTile();
        addObject(ht, 400, 525);
        addObject(btnStart,450,530);

        
        
    }
}
