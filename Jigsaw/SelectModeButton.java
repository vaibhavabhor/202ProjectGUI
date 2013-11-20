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
        modeFlag = true;
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
                        EasyLevel.modeFlag = false;
                        System.out.println("Its easy level!");
                    //    navigate(pw);
                       Actor easy = new EasyLevel(pw);
                    pw.addObject(easy,890,140);
                    }  
                    else if(mouseX > 668 
                    && mouseX < 680)
                    {
                        EasyLevel.modeFlag = true;
                        System.out.println("Its hard level!");
                     //   navigate(pw);
                         Actor hard = new HardLevel(pw);
                          pw.addObject(hard,890,140);
                    }
                }
            }
        } 
    }

    public void navigate(World pw)
    {
        matrix =  new HashMap();
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
        pw.addObject(new ImageContainerBoard(),650,100);

        pw.addObject(new LeftImage(),320,535);
        pw.addObject(new MiddleImage(),500,535);
        //pw.addObject(new RightImage(),480,535); 

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

    }

}
