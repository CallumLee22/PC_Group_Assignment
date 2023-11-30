import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    /**
     * Act - do whatever the Heart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    // Constructor to resize image before program has run
    public Heart()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() * 2, image.getHeight() * 2);
        setImage(image);
    }
    
    public void act()
    {
        
    }
}
