import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    long initialTime = System.currentTimeMillis();
    public static int elapsedTime = 0, secs = 0;

    public Timer()
    {
    updateImage();
    }

    public void act()
    {
    start_timer();
    }

    public void start_timer()
    {
        if(Canvas.split_flag == "true"){
        elapsedTime = (int) (System.currentTimeMillis() - initialTime);
        updateImage();
    
        }
        else if(SplitImageDrag.correct = true && SplitImageDrag.size <= 0)
        {
            updateBlankImage();
        }
    }
public void updateImage()
    {
    int millis = elapsedTime % 1000;
    secs = (elapsedTime / 1000) % 60;
    // System.out.println("Inside timer: " + secs);
    int mins = elapsedTime / 60000;
   
    String millisText = String.format("%02d", millis);
    String secsText = String.format("%02d", secs);
    String minsText = "" + mins;
    String text = minsText + ":" + secsText + ":" + millisText;
    GreenfootImage img = new GreenfootImage(text, 20, Color.white, null);
    setImage(img);
//setImage(new GreenfootImage("" + ((60000 - elapsedTime) / 1000), 24, Color.black, new Color(0, 0, 0, 0)));
}

    private void updateBlankImage()
    {
    int millis = 0;
    int sec = 0;
    int mins = 0;
    String millisText = String.format("%02d", millis);
    String secsText = String.format("%02d", sec);
    String minsText = "" + mins;
    String text = minsText + ":" + secsText + ":" + millisText;
    GreenfootImage img = new GreenfootImage(text, 20, Color.white, null);
    setImage(img);
//setImage(new GreenfootImage("" + ((60000 - elapsedTime) / 1000), 24, Color.black, new Color(0, 0, 0, 0)));
    }
}


