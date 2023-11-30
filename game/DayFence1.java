import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DayFence1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayFence1 extends Actor
{
    /**
     * Act - do whatever the DayFence1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int rotate;
    public DayFence1(int rotate)
    {
        this.rotate = rotate;
        
        turn(rotate);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
