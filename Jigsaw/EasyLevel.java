import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class EasyLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasyLevel extends Actor implements IScreen
{
    /**
     * Act - do whatever the EasyLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int mouseX, mouseY;
    List modeScreen,modeBtn,Htile,modeKnb;
    public static HashMap matrix =  new HashMap();
    public static Boolean modeFlag = false;
    World pw;
        
    public EasyLevel(World world)
    {
        pw = world;
    }
    
    public void act() 
    {
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
      pw.addObject(new Canvas(),245,245);
      pw.addObject(new LeftButton(),100,535);
      pw.addObject(new RightButton(),650,535);
      pw.addObject(new MessageBoard(),650,350);

      Timer testTimer = new Timer();
      pw.addObject(testTimer, 650, 350);
      testTimer.start_timer();
      
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
        // Add your action code here.
    }    
}
