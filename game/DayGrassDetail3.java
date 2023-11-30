import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DayGrassDetail3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayGrassDetail3 extends Actor
{
    /**
     * Act - do whatever the DayGrassDetail3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (isTouching(DayGround.class) || isTouching(DayWater.class) || isTouching(DayGrassDetail2.class))
        {
            setLocation(Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(500));
        }
    }
}
