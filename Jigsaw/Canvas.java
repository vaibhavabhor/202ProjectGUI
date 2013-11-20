import greenfoot.*;  
import javax.imageio.ImageIO;  
import java.awt.image.BufferedImage;  
import java.io.*;  
import java.awt.*;  
import java.util.*;

public class Canvas extends Actor
{
    public static HashMap splitImagesMap = null;
    public static ArrayList splitImagesList = null;
    public static String split_flag = "false";


    public Canvas()
    {     
        splitImagesMap = new HashMap();
        splitImagesList =  new ArrayList();
    }  

    public void act() 
    {
        World pw = getWorld();

        if(SelectModeButton.modeFlag==false){

            if(isTouching(LeftImage.class))
            {
                splitImageIntoChunks("panda.jpg",3);
                split_flag = "true";
                notifyImageBoard(9);
                removeTouching(LeftImage.class);
            }

            else if(isTouching(MiddleImage.class))
            {
                splitImageIntoChunks("penguin.jpg",3);
                split_flag = "true";
                notifyImageBoard(9);
                removeTouching(MiddleImage.class);
            }

            else if(isTouching(RightImage.class))
            {
                splitImageIntoChunks("minion.jpg",3);
                split_flag = "true";
                notifyImageBoard(9);
                removeTouching(RightImage.class);
            }
        }

        else if(SelectModeButton.modeFlag==true)
        {
            if(isTouching(LeftImage.class))
            {
                System.out.println("Left Image Split");
                splitImageIntoChunks("panda.jpg",4);
                split_flag = "true";
                notifyImageBoard(16);
                removeTouching(LeftImage.class);
            }

            else if(isTouching(MiddleImage.class))
            {
                System.out.println("Middle Image Split");
                splitImageIntoChunks("penguin.jpg",4);
                split_flag = "true";
                notifyImageBoard(16);
                removeTouching(MiddleImage.class);
            }

            else if(isTouching(RightImage.class))
            {
                System.out.println("Right Image Split");
                splitImageIntoChunks("minion.jpg",4);
                split_flag = "true";
                notifyImageBoard(16);
                removeTouching(RightImage.class);
            }
        }

    }   

    public void splitImageIntoChunks(String imageName, int pieces)
    {
        try{

            File file = new File("images/" + imageName); // I have bear.jpg in my working directory  
            FileInputStream fis = new FileInputStream(file);  
            BufferedImage image = ImageIO.read(fis); //reading the image file  

            int rows = pieces; //You should decide the values for rows and cols variables  
            int cols = pieces;  
            int chunks = rows * cols;  

            int chunkWidth = image.getWidth() / cols; // determines the chunk width and height  
            int chunkHeight = image.getHeight() / rows;  
            int count = 0;  
            BufferedImage imgs[] = new BufferedImage[chunks]; //Image array to hold image chunks  
            for (int x = 0; x < rows; x++) {  

                for (int y = 0; y < cols; y++) {  
                    //Initialize the image array with image chunks  
                    imgs[count] = new BufferedImage(chunkWidth, chunkHeight, image.getType());  
                    // draws the image chunk  
                    Graphics2D gr = imgs[count++].createGraphics();  
                    gr.drawImage(image, 0, 0, chunkWidth, chunkHeight, chunkWidth * y, chunkHeight * x, chunkWidth * y + chunkWidth, chunkHeight * x + chunkHeight, null);  
                    gr.dispose();  
                }

            }  
            System.out.println("Splitting done");  

            //writing mini images into image files  
            for (int i = 0; i < imgs.length; i++) {  
                ImageIO.write(imgs[i], "jpg", new File("img" + i + ".jpg"));  

            }  
            System.out.println("Image split into chunks");  
        }catch(Exception e)
        {
            System.out.println("Exception ocurred:"+e);  
        }
    }  

    public void notifyImageBoard(int displayPieces)
    {
        int cnt=0;
        World w = getWorld();
       
        for (int i=0;i<displayPieces;i++)
        {
            SplitImageDrag chunk = new SplitImageDrag();
            GreenfootImage img = new GreenfootImage("img"+i+".jpg");
            chunk.setImage(img); 
            w.addObject(chunk,700+cnt,100);
            cnt=cnt+10;
            String splitImageName  = "img"+i+".jpg";
            splitImagesMap.put(chunk.getImage(),splitImageName);
            System.out.println("kalyani :: " + chunk.getImage());
        }

        System.out.println("splitImages:: " + splitImagesMap.size());
    }
}

