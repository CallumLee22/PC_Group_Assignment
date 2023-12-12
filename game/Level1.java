import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 1 is in a village where the player must defeat all of the enemies
 * 
 * @author Callum Lee 
 * @version 12/12/2023
 */
public class Level1 extends World
{
    /**
     * Constructor for objects of class Level1.
     * 
     */
    
    private int characterNum;
    
    // Itsantiate player
    private Player player;
    
    // Make different numbered hearts so that an individual heart can have image changed when damage is taken by the player
    private Heart heart1 = new Heart();
    private Heart heart2 = new Heart();
    private Heart heart3 = new Heart();
    private Heart heart4 = new Heart();
    private Heart heart5 = new Heart();
    
    public Level1(int characterNum)
    {
        // Create a new world with 750x500 cells with a cell size of 1x1 pixels.
        super(750, 500, 1);
        
        // Get character chosen
        this.characterNum = characterNum;
        this.player = new Player(characterNum);
        
        // Pit "invisible barrier"
        addObject(new DayWater(), 650, 100);
        
        // Create grass base for world to be built upon
        for (int x = 0; x <= 750; x = x + 15)
        {
            for (int y = 0; y <= 500; y = y + 15)
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
        for (int y = 500; y >= 290; y -= 30)
        {
            addObject(new DayWater(), 300, y);
        }
        for (int x = 330; x <= 450; x += 30)
        {
            addObject(new DayWater(), x, 290);
        }
        for (int y = 290; y >= -10; y -= 30)
        {
            addObject(new DayWater(), 480, y);
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
        for (int x = 605; x < 740; x += 15)
        {
            getRandomGround(x, 65);
        }
        
        // Spawn fences
        addObject(new DayFence1(0), 6, 300);
        for (int x = 95; x <= 275; x += 15)
        {
            if ( x != 185 && x != 170 && x != 200)
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
            if (y != 465 && y != 480 && y != 450)
            {
                addObject(new DayFence1(270), 480, y);
            }
        }

        //Church "invisible barriers"
        addObject(new DayWater(), 305, 78);
        addObject(new DayWater(), 305, 90);
        addObject(new DayWater(), 270, 78);
        addObject(new DayWater(), 340, 78);
        addObject(new DayWater(), 305, 58);
        addObject(new DayWater(), 300, 65);
        addObject(new DayWater(), 310, 65);
        
        // Blue house "invisible barriers"
        addObject(new DayWater(), 50, 277);
        addObject(new DayWater(), 50, 307);
        addObject(new DayWater(), 50, 285);
        addObject(new DayWater(), 35, 300);
        addObject(new DayWater(), 65, 300);
        
        // Yellow house "invisible barriers"
        addObject(new DayWater(), 600, 400);
        addObject(new DayWater(), 570, 400);
        addObject(new DayWater(), 630, 400);
        addObject(new DayWater(), 570, 410);
        addObject(new DayWater(), 585, 410);
        addObject(new DayWater(), 570, 385);
        addObject(new DayWater(), 590, 389);
        
        // Spawn POIs
        addObject(new DayHouse1(), 50, 300);
        addObject(new DayChurch(), 305, 78);
        addObject(new DayHouse2(), 600, 400);
        addObject(new DayBridge(), 480, 192);
        addObject(new DayPit(), 650, 100);
        
        // Spawn player
        addObject(player, 50, 350);
        
        // Scale heart images
        GreenfootImage heart1Image = heart1.getImage();
        heart1Image.scale(heart1Image.getWidth() * 2, heart1Image.getHeight() * 2);
        heart1.setImage(heart1Image);
        
        GreenfootImage heart2Image = heart2.getImage();
        heart2Image.scale(heart2Image.getWidth() * 2, heart2Image.getHeight() * 2);
        heart2.setImage(heart2Image);
        
        GreenfootImage heart3Image = heart3.getImage();
        heart3Image.scale(heart3Image.getWidth() * 2, heart3Image.getHeight() * 2);
        heart3.setImage(heart3Image);
        
        GreenfootImage heart4Image = heart4.getImage();
        heart4Image.scale(heart4Image.getWidth() * 2, heart4Image.getHeight() * 2);
        heart4.setImage(heart4Image);
        
        GreenfootImage heart5Image = heart5.getImage();
        heart5Image.scale(heart5Image.getWidth() * 2, heart5Image.getHeight() * 2);
        heart5.setImage(heart5Image);
        
        addObject(heart1, 20, 20);
        addObject(heart2, 50, 20);
        addObject(heart3, 80, 20);
        addObject(heart4, 110, 20);
        addObject(heart5, 140, 20);
    }
    
    private void getRandomGround(int x, int y)
    {
        // Get random ground textures to make world more varied
        int randNum = Greenfoot.getRandomNumber(100);
        
        if (randNum % 3 == 0)
        {
            addObject(new DayGround(), x, y);
        }
        else if (randNum % 12 == 0)
        {
            addObject(new DayGroundDetail2(), x, y);
        }
        else if (randNum % 15 == 0)
        {
            addObject(new DayGroundDetail3(), x, y);
        }
        else if (randNum % 10 == 0)
        {
            addObject(new DayGroundDetail4(), x, y);
        }
        else if (randNum % 20 == 0)
        {
            addObject(new DayGroundDetail5(), x, y);
        }
        else
        {
            if (randNum % 2 == 0)
            {
                addObject(new DayGroundDetail1(), x, y);   
            }
            else
            {
                addObject(new DayGroundDetail3(), x, y);
            }
        }
    }
    
    public void act()
    {
        switch (player.health)
        {
            case 90:
                heart5.setImage("half_heart.png");
                
            case 80:
                heart5.setImage("empty_heart.png");
                    
            case 70:
                heart4.setImage("half_heart.png");
                    
            case 60:
                heart4.setImage("empty_heart.png");
                    
            case 50:
                heart3.setImage("half_heart.png");
                    
            case 40:
                heart3.setImage("empty_heart.png");
                
            case 30:
                heart2.setImage("half_heart.png");
                    
            case 20:
                heart2.setImage("empty_heart.png");
                
            case 10 :
                heart1.setImage("half_heart.png");
                
            case 0:
                heart1.setImage("empty_heart.png");
                
            default:
                break;
        }
    }
}
