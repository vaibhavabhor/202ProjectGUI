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
    public static HashMap matrix =  new HashMap();
    public static Boolean modeFlag = false;

    public void act() 
    {

        if(Greenfoot.mousePressed(this))
        {
            World pw = getWorld();
            modeFlag = true;
            List modeScreen =  pw.getObjects(ModeScreen.class);
            List modeBtn =  pw.getObjects(SelectModeButton.class);
            List modeKnb=pw.getObjects(ModeKnob.class);
            List Htile=pw.getObjects(HTile.class);

            pw.removeObjects(modeScreen);
            pw.removeObjects(modeBtn);
            pw.removeObjects(Htile);
            pw.removeObjects(modeKnb);
            List startScreen =  pw.getObjects(StartScreen.class);
            List startBtn =  pw.getObjects(CommandButton.class);
            pw.removeObjects(startScreen);
            pw.removeObjects(startBtn);
            GreenfootImage img = new GreenfootImage("game_screen_background.jpg");
            pw.setBackground(img);
            pw.addObject(new ImageContainer(),400,525);
            pw.addObject(new Dashboard(),890,140);
            pw.addObject(new LeftButton(),100,535);
            pw.addObject(new RightButton(),650,535);
            pw.addObject(new MessageBoard(),650,350);
            pw.addObject(new ImageContainerBoard(),650,100);
            pw.addObject(new LeftImage(),320,535);
            pw.addObject(new MiddleImage(),500,535);
          //  pw.addObject(new RightImage(),480,535);
            int cntX =0;
            int cntY =0;
            int i=0;
            for (int x = 0; x < 3; x++) {  

                for (int y = 0; y < 3; y++) {  
                    Canvas chunkgrid = new Canvas();
                    GreenfootImage imggrid = new GreenfootImage("3x3grid.jpg");
                    chunkgrid.setImage(imggrid); 
                    pw.addObject(chunkgrid,105+cntX,99+cntY);
                    cntX=cntX+121;
                    int midX = imggrid.getWidth();
                    int midY = imggrid.getHeight();
                    String imageName = "img"+ i +".jpg";
                    System.out.println("Image Name ::" + imageName+ "   mid points :: " + midX + "  " + midY);
                    matrix.put(i,imageName);
                    i++;
                }
                cntY = cntY+121;
                cntX=0;

            }

           
            //             pw.addObject(new Canvas(),105,99);
            //             pw.addObject(new Canvas(),230,99);
            //             pw.addObject(new Canvas(),355,99);
            //             pw.addObject(new Canvas(),105,205);
            //             pw.addObject(new Canvas(),230,206);
            //             pw.addObject(new Canvas(),355,206);
            //             pw.addObject(new Canvas(),104,309);
            //             pw.addObject(new Canvas(),230,310);
            //             pw.addObject(new Canvas(),354,310);
        }   
    }
}
