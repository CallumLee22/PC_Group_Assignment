import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        super(750, 500, 1);
        for (int x = 1; x <= 750; x++)
        {
            for (int y = 1; y<=500; y++)
            {
                addObject(new DayGrass(), x, y);
    }
}
}
}
