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
        for (int i = 0; i < 30; i++)
        {
            addObject(new DayGrassDetail3(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(500));
        }
        
        for (int i = 0; i < 30; i++)
        {
            DayGrassDetail2 tile = new DayGrassDetail2();
            addObject(tile, Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(500));
        }
        
        // Make river
        addObject(new DayWater(), 300, 500);
        addObject(new DayWater(), 300, 470);
        addObject(new DayWater(), 300, 440);
        addObject(new DayWater(), 300, 410);
        addObject(new DayWater(), 300, 380);
        addObject(new DayWater(), 300, 350);
        addObject(new DayWater(), 300, 320);
        addObject(new DayWater(), 300, 290);
        addObject(new DayWater(), 330, 290);
        addObject(new DayWater(), 360, 290);
        addObject(new DayWater(), 390, 290);
        addObject(new DayWater(), 420, 290);
        addObject(new DayWater(), 450, 290);
        addObject(new DayWater(), 480, 290);
        addObject(new DayWater(), 480, 260);
        addObject(new DayWater(), 480, 230);
        addObject(new DayWater(), 480, 200);
        addObject(new DayWater(), 480, 170);
        addObject(new DayWater(), 480, 140);
        addObject(new DayWater(), 480, 110);
        addObject(new DayWater(), 480, 80);
        addObject(new DayWater(), 480, 50);
        addObject(new DayWater(), 480, 20);
        addObject(new DayWater(), 480, 0);
        addObject(new DayBridge(), 480, 185);
        
        // Make pathway
        addObject(new DayGround(), 50, 350);
        addObject(new DayGroundDetail1(), 50, 365);
        addObject(new DayGround(), 50, 380);
        addObject(new DayGround(), 50, 395);
        addObject(new DayGroundDetail1(), 50, 410);
        addObject(new DayGround(), 65, 410);
        addObject(new DayGroundDetail3(), 80, 410);
        addObject(new DayGround(), 95, 410);
        addObject(new DayGroundDetail1(), 110, 410);
        addObject(new DayGround(), 125, 410);
        addObject(new DayGroundDetail3(), 140, 410);
        addObject(new DayGround(), 155, 410);
        addObject(new DayGroundDetail1(), 170, 410);
        addObject(new DayGroundDetail2(), 185, 410);
        addObject(new DayGroundDetail1(), 185, 395);
        addObject(new DayGroundDetail1(), 185, 380);
        addObject(new DayGround(), 185, 365);
        addObject(new DayGroundDetail2(), 185, 350);
        addObject(new DayGround(), 185, 335);
        addObject(new DayGroundDetail1(), 185, 320);
        addObject(new DayGround(), 185, 305);
        addObject(new DayGround(), 185, 290);
        
        // Spawn buildings
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
