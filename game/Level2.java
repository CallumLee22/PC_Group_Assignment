import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 2 is a night version of level 1
 * 
 * @author Callum Lee 
 * @version 12/12/2023
 */
public class Level2 extends World
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
    
    public Level2(int characterNum)
    {    
        // Create a new world with 750x500 cells with a cell size of 1x1 pixels.
        super(750, 500, 1);
        
        // Get chosen character
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
        for (int y = 500; y >= 290; y -= 30)
        {
            addObject(new NightWater(), 300, y);
        }
        for (int x = 330; x <= 450; x += 30)
        {
            addObject(new NightWater(), x, 290);
        }
        for (int y = 290; y >= -10; y -= 30)
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
            if ( x != 185 && x != 170 && x != 200)
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
            if (y != 465 && y != 480 && y != 450)
            {
                addObject(new NightFence1(270), 480, y);
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
        addObject(new NightHouse1(), 50, 300);
        addObject(new NightChurch(), 305, 78);
        addObject(new NightHouse2(), 600, 400);
        addObject(new NightBridge(), 480, 192);
        addObject(new NightPit(), 650, 100);
        
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
        
        spawnHealthPickUps();
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
    
    public void act()
    {
        checkHealth();
    }
    
    private void checkHealth()
    {
        // Change heart images to reflect the player's health
        if (player.health == 90)
        {
            heart5.setImage("half_heart.png");
            GreenfootImage heart5Image = heart5.getImage();
            heart5Image.scale(heart5Image.getWidth() * 2, heart5Image.getHeight() * 2);
            heart5.setImage(heart5Image);
        }
        else if (player.health == 80)
        {
            heart5.setImage("empty_heart.png");
            GreenfootImage heart5Image = heart5.getImage();
            heart5Image.scale(heart5Image.getWidth() * 2, heart5Image.getHeight() * 2);
            heart5.setImage(heart5Image);
        }
        else if (player.health == 70)
        {
            heart4.setImage("half_heart.png");
            GreenfootImage heart4Image = heart4.getImage();
            heart4Image.scale(heart4Image.getWidth() * 2, heart4Image.getHeight() * 2);
            heart4.setImage(heart4Image);
        }
        else if (player.health == 60)
        {
            heart4.setImage("empty_heart.png");
            GreenfootImage heart4Image = heart4.getImage();
            heart4Image.scale(heart4Image.getWidth() * 2, heart4Image.getHeight() * 2);
            heart4.setImage(heart4Image);
        }
        else if (player.health == 50)
        {
            heart3.setImage("half_heart.png");
            GreenfootImage heart3Image = heart3.getImage();
            heart3Image.scale(heart3Image.getWidth() * 2, heart3Image.getHeight() * 2);
            heart3.setImage(heart3Image);
        }
        else if (player.health == 40)
        {
            heart3.setImage("empty_heart.png");
            GreenfootImage heart3Image = heart3.getImage();
            heart3Image.scale(heart3Image.getWidth() * 2, heart3Image.getHeight() * 2);
            heart3.setImage(heart3Image);
        }
        else if (player.health == 30)
        {
            heart2.setImage("half_heart.png");
            GreenfootImage heart2Image = heart2.getImage();
            heart2Image.scale(heart2Image.getWidth() * 2, heart2Image.getHeight() * 2);
            heart2.setImage(heart2Image);
        }
        else if (player.health == 20)
        {
            heart2.setImage("empty_heart.png");
            GreenfootImage heart2Image = heart2.getImage();
            heart2Image.scale(heart2Image.getWidth() * 2, heart2Image.getHeight() * 2);
            heart2.setImage(heart2Image);
        }
        else if (player.health == 10)
        {
            heart1.setImage("half_heart.png");
            GreenfootImage heart1Image = heart1.getImage();
            heart1Image.scale(heart1Image.getWidth() * 2, heart1Image.getHeight() * 2);
            heart1.setImage(heart1Image);
        }
        else if (player.health == 0)
        {
            Greenfoot.setWorld(new DeathScreen());
        }
    }
    
    private void spawnHealthPickUps()
    {
        for (int i = 1; i <= 2; i++)
        {
            int x = Greenfoot.getRandomNumber(750);
            int y = Greenfoot.getRandomNumber(500);
            HealthPickUp pickUp= new HealthPickUp();
            addObject(pickUp, x, y);
            pickUp.checkValidSpawn();
        }
    }
}
