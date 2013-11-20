import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Level extends Actor
{
    List modeScreen,modeBtn,Htile,modeKnb;
    World pw =null;
    public Level(World world)
    {
        pw = world;
        SelectModeButton.matrix = new HashMap();
        modeScreen =  pw.getObjects(ModeScreen.class);
        modeBtn =  pw.getObjects(SelectModeButton.class);
        Htile = pw.getObjects(HTile.class);
        modeKnb = pw.getObjects(ModeKnob.class);
        pw.removeObjects(modeScreen);
        pw.removeObjects(modeBtn);
        pw.removeObjects(Htile);
        pw.removeObjects(modeKnb);
        GreenfootImage img = new GreenfootImage("game_screen_background.jpg");
        pw.setBackground(img);
        pw.addObject(new Dashboard(),890,140);
        pw.addObject(new LeftButton(),100,535);
        pw.addObject(new RightButton(),650,535);
        pw.addObject(new MessageBoard(),650,350);
        pw.addObject(new Timer(), 650, 350);
        pw.addObject(new ImageContainerBoard(),650,100);
        pw.addObject(new LeftImage(),320,535);
        pw.addObject(new MiddleImage(),500,535);
    }
}
