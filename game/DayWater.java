import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DayWater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayWater extends Actor
{
    /**
     * Act - do whatever the DayWater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public DayWater()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() * 2, image.getHeight() * 2);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
