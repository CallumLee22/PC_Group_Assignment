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
        for (int x = 1; x <= 750; x = x + 15)
        {
            for (int y = 1; y <= 500; y = y + 15)
            {
                int ranNum = Greenfoot.getRandomNumber(100);
                if (ranNum % 10 == 0)
                {
                    addObject(new DayGrassDetail3(), x, y);
                }
                else if(ranNum % 15 == 0)
                {
                    addObject(new DayGrassDetail5(), x, y);
                }
                else
                {
                    addObject(new DayGrass(), x, y);
                }
            }
        }
        
        // Make river
        for (int y = 500; y >= 290; y -= 15)
        {
            addObject(new DayWater(), 300, y);
        }
        for (int x = 330; x <= 480; x += 15)
        {
            addObject(new DayWater(), x, 290);
        }
        for (int y = 260; y >= 0; y -= 15)
        {
            addObject(new DayWater(), 480, y);
        }
        
        // Make pathway
        for (int y = 350; y <= 410; y += 15)
        {
            addObject(new DayGround(), 50, y);
        }
        for (int x = 65; x <= 185; x += 15)
        {
            addObject(new DayGround(), x, 410);
        }
        for (int y = 395; y >= 200; y -= 15)
        {
            addObject(new DayGround(), 185, y);            
        }
        for (int x = 200; x <= 305; x += 15)
        {
            addObject(new DayGround(), x, 200);
        }
        for (int y = 185; y >= 125; y -= 15)
        {
            addObject(new DayGround(), 305, y);            
        }
        for (int x = 320; x <= 440; x += 15)
        {
            addObject(new DayGround(), x, 200);
        }
        for (int x = 530; x <= 590; x += 15)
        {
            addObject(new DayGround(), x, 200);
        }
        for (int y = 215; y <= 335; y += 15)
        {
            addObject(new DayGround(), 590, y);
        }
        for (int x = 575; x >= 425; x -= 15)
        {
            addObject(new DayGround(), x, 335);
        }
        for (int y = 350; y <= 455; y += 15)
        {
            addObject(new DayGround(), 425, y);
        }
        addObject(new DayGround(), 425, 467);
        for (int x = 440; x <= 575; x += 15)
        {
            addObject(new DayGround(), x, 467);
        }
        addObject(new DayGround(), 575, 455);
        
        // Spawn fences
        addObject(new DayFence1(0), 6, 300);
        for (int x = 95; x <= 275; x += 15)
        {
            if ( x != 185)
            {
                addObject(new DayFence1(0), x, 300);   
            }
        }
        for (int x = 660; x <= 735; x += 15)
        {
            addObject(new DayFence1(0), x, 400);
        }
        for (int x = 540; x >= 495; x -= 15)
        {
            addObject(new DayFence1(0), x, 400);
        }
        for (int y = 405; y <= 495; y += 15)
        {
            if (y != 465)
            {
                addObject(new DayFence1(270), 480, y);
            }
        }
        
        // Spawn POIs
        addObject(new DayHouse1(), 50, 300);
        addObject(new DayChurch(), 305, 78);
        addObject(new DayHouse2(), 600, 400);
        addObject(new DayBridge(), 480, 192);
        addObject(new DayPit(), 650, 100);
        
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
