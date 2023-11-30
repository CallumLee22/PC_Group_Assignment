import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    
    public Level2()
    {    
        // Create a new world with 750x500 cells with a cell size of 1x1 pixels.
        super(750, 500, 1);
        
        // Create grass base for world to be built upon
        for (int x = 1; x <= 750; x = x + 15)
        {
            for (int y = 1; y <= 500; y = y + 15)
            {
                int ranNum = Greenfoot.getRandomNumber(100);
                if (ranNum % 10 == 0)
                {
                    addObject(new NightGrassDetail3(), x, y);
                }
                else if(ranNum % 15 == 0)
                {
                    addObject(new NightGrassDetail5(), x, y);
                }
                else
                {
                    addObject(new NightGrass(), x, y);
                }
            }
        }
        
        // Make river
        for (int y = 500; y >= 290; y -= 15)
        {
            addObject(new NightWater(), 300, y);
        }
        for (int x = 330; x <= 480; x += 15)
        {
            addObject(new NightWater(), x, 290);
        }
        for (int y = 260; y >= 0; y -= 15)
        {
            addObject(new NightWater(), 480, y);
        }
        
        // Make pathway
        for (int y = 350; y <= 410; y += 15)
        {
            getRandomGround(50, y);
        }
        for (int x = 65; x <= 185; x += 15)
        {
            getRandomGround(x, 410);
        }
        for (int y = 395; y >= 200; y -= 15)
        {
            getRandomGround(185, y);            
        }
        for (int x = 200; x <= 305; x += 15)
        {
            getRandomGround(x, 200);
        }
        for (int y = 185; y >= 125; y -= 15)
        {
            getRandomGround(305, y);            
        }
        for (int x = 320; x <= 440; x += 15)
        {
            getRandomGround(x, 200);
        }
        for (int x = 530; x <= 590; x += 15)
        {
            getRandomGround(x, 200);
        }
        for (int y = 215; y <= 335; y += 15)
        {
            getRandomGround(590, y);
        }
        for (int x = 575; x >= 425; x -= 15)
        {
            getRandomGround(x, 335);
        }
        for (int y = 350; y <= 455; y += 15)
        {
            getRandomGround(425, y);
        }
        getRandomGround(425, 467);
        for (int x = 440; x <= 575; x += 15)
        {
            getRandomGround(x, 467);
        }
        getRandomGround(575, 455);
        for (int y = 185; y >= 65; y -= 15)
        {
            getRandomGround(590, y);
        }
        for (int x = 605; x <= 750; x += 15)
        {
            getRandomGround(x, 65);
        }
        
        // Spawn fences
        addObject(new NightFence1(0), 6, 300);
        for (int x = 95; x <= 275; x += 15)
        {
            if ( x != 185)
            {
                addObject(new NightFence1(0), x, 300);   
            }
        }
        for (int x = 660; x <= 735; x += 15)
        {
            addObject(new NightFence1(0), x, 400);
        }
        for (int x = 540; x >= 495; x -= 15)
        {
            addObject(new NightFence1(0), x, 400);
        }
        for (int y = 405; y <= 495; y += 15)
        {
            if (y != 465)
            {
                addObject(new NightFence1(270), 480, y);
            }
        }
        
        // Spawn POIs
        addObject(new NightHouse1(), 50, 300);
        addObject(new NightChurch(), 305, 78);
        addObject(new NightHouse2(), 600, 400);
        addObject(new NightBridge(), 480, 192);
        addObject(new NightPit(), 650, 100);
        
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
    
    private void getRandomGround(int x, int y)
    {
        int randNum = Greenfoot.getRandomNumber(100);
        
        if (randNum % 3 == 0)
        {
            addObject(new NightGround(), x, y);
        }
        else if (randNum % 12 == 0)
        {
            addObject(new NightGroundDetail2(), x, y);
        }
        else if (randNum % 15 == 0)
        {
            addObject(new NightGroundDetail3(), x, y);
        }
        else if (randNum % 10 == 0)
        {
            addObject(new NightGroundDetail4(), x, y);
        }
        else if (randNum % 20 == 0)
        {
            addObject(new NightGroundDetail5(), x, y);
        }
        else
        {
            if (randNum % 2 == 0)
            {
                addObject(new NightGroundDetail1(), x, y);   
            }
            else
            {
                addObject(new NightGroundDetail3(), x, y);
            }
        }
    }
}
