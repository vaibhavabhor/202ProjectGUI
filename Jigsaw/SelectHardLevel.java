import greenfoot.*; 
import java.util.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectHardLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectHardLevel extends Level
{
    int mouseX, mouseY;
    List modeScreen,modeBtn,Htile,modeKnb;
    World pw;

    public SelectHardLevel(World world)
    {
        super(world);
        SelectModeButton.matrix =  new HashMap();
        pw = world;
        int cntX =0;
        int cntY =0;
        int i=0;
        for (int x = 0; x < 4; x++) {  

            for (int y = 0; y < 4; y++) {  
                
                Canvas chunkgrid = new Canvas();
                GreenfootImage imggrid = new GreenfootImage("3x3grid.jpg");
                imggrid.scale(90,70);
                chunkgrid.setImage(imggrid); 
                pw.addObject(chunkgrid,94+cntX,77+cntY);
                cntX=cntX+92;
                int midX = imggrid.getWidth();
                int midY = imggrid.getHeight();
                String imageName = "img"+ i +".jpg";
                System.out.println("Image Name ::" + imageName+ "   mid points :: " + midX + "  " + midY);
                SelectModeButton.matrix.put(i,imageName);
                i++;
            }
            cntY = cntY+72;
            cntX=0;
        }
    }

    public void act() 
    {

    }    
}
