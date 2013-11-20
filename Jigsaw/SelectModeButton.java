import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class SelectModeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectModeButton extends CommandButton
{
    /**
     * Act - do whatever the SelectModeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mouseX, mouseY;
    List modeScreen,modeBtn,modeKnb,Htile;
    public static HashMap matrix =  null;
    public static Boolean modeFlag = false;

    public void act() 
    {
        World pw = getWorld();
        modeScreen =  pw.getObjects(ModeScreen.class);
        modeBtn =  pw.getObjects(SelectModeButton.class);
        modeKnb = pw.getObjects(ModeKnob.class);
        Htile = pw.getObjects(HTile.class);

        // Add your action code here.
        if(Greenfoot.mousePressed(this))
        {
            //ModeKnob knob = modeKnb[0];

            for (Object obj : modeKnb)  
            {  
                ModeKnob knob = (ModeKnob) obj; // sub-casting  
                mouseX = knob.getX();
                mouseY = knob.getY();
                System.out.println("Knob cooridnates are "+ mouseX + " and "+ mouseY );
                // change location of 'ps'  

                if (mouseY > 240
                && mouseY < 260)
                {
                    if(mouseX > 466 
                    && mouseX < 480)
                    {
                        System.out.println("Its easy level!");
                        Level easy = LevelFactory.selectLevel(LevelTypeEnum.EASY,pw);
                        pw.addObject(easy,890,140);
                        modeFlag=false;
                    }  
                    else if(mouseX > 668 
                    && mouseX < 680)
                    {
                        System.out.println("Its hard level!");
                        Level hard = LevelFactory.selectLevel(LevelTypeEnum.HARD,pw);
                        pw.addObject(hard,890,140);
                        modeFlag = true;
                    }
                }
            }
        } 
    }
}

