import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class StartButton extends CommandButton
{
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            World pw = getWorld();
            List startScreen =  pw.getObjects(StartScreen.class);
            List startBtn =  pw.getObjects(CommandButton.class);
            List Htile=pw.getObjects(HTile.class);
            pw.removeObjects(startScreen);
            pw.removeObjects(startBtn);
            pw.removeObjects(Htile);
            GreenfootImage img = new GreenfootImage("game_screen_background.jpg");
            pw.setBackground(img);
            pw.addObject(new ModeScreen(),490,200);
            pw.addObject(new SelectModeButton(),100,300);
            pw.addObject(new ModeKnob(),470,250);
            pw.addObject(new ImageContainer(),400,525);
            pw.addObject(new LeftButton(),100,535);
            pw.addObject(new RightButton(),650,535);

            /*
             *   pw.addObject(new Dashboard(),890,140);
            pw.addObject(new Canvas(),245,245);
            pw.addObject(new LeftButton(),100,535);
            pw.addObject(new RightButton(),650,535);

            pw.addObject(new ImageContainer(),400,525);
            pw.addObject(new Dashboard(),890,140);
            pw.addObject(new Canvas(),245,245);
            pw.addObject(new LeftButton(),100,535);
            pw.addObject(new RightButton(),650,535);

            pw.addObject(new MessageBoard(),650,350);
            pw.addObject(new ImageContainerBoard(),650,100);

            pw.addObject(new LeftImage(),220,535);
            pw.addObject(new MiddleImage(),350,535);
            pw.addObject(new RightImage(),480,535);*/
            // pw.addObject(new Level2(),241,524);
            //pw.addObject(new Level3(),381,524);
        }   
    }
}

