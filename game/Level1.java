import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author Callum Lee 
 * @version 24/11/2023
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    
    public Level1()
    {    
        // Create a new world with 750x500 cells with a cell size of 1x1 pixels.
        super(750, 500, 1);
        
        // Create green grass baseb for world to be built upon
        for (int x = 1; x <= 750; x++)
        {
            for (int y = 1; y <= 500; y++)
            {
                addObject(new DayGrass(), x, y);
            }
        }
        
        // Add random grass details
        for (int i = 0; i < 15; i++)
        {
            addObject(new DayGrassDetail1(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(500));
        }
        
        for (int i = 0; i < 15; i++)
        {
            DayGrassDetail2 tile = new DayGrassDetail2();
            addObject(tile, Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(500));
        }
        
        addObject(new DayHouse1(), 50, 300);
        addObject(new DayChurch(), 300, 78);
        addObject(new DayHouse2(), 589, 400);
        
        // Make different numbered hearts so that an individual heart can have image changed when damage is taken by the player
        Heart heart1 = new Heart();
        Heart heart2 = new Heart();
        Heart heart3 = new Heart();
        Heart heart4 = new Heart();
        Heart heart5 = new Heart();
        
        addObject(heart1, 20, 20);
        addObject(heart2, 50, 20);
        addObject(heart3, 80, 20);
        addObject(heart4, 110, 20);
        addObject(heart5, 140, 20);
        
        
    }
}
