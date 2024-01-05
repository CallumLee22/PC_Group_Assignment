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
    
    private int characterNum;
        
    private Player player;
    
    
    private Heart heart1 = new Heart();
    private Heart heart2 = new Heart();
    private Heart heart3 = new Heart();
    private Heart heart4 = new Heart();
    private Heart heart5 = new Heart();
    
    public Level3(int characterNum)
    {    
        super(750, 500, 1);
        
        this.characterNum = characterNum;
        this.player = new Player(characterNum);
        
        //Creepy Church Invisible Barrier
        addObject(new DayWater(), 720, 200);
        addObject(new DayWater(), 720, 220);
        addObject(new DayWater(), 720, 250);
        addObject(new DayWater(), 720, 280);
        addObject(new DayWater(), 720, 300);
        addObject(new DayWater(), 690, 200);
        addObject(new DayWater(), 690, 220);
        addObject(new DayWater(), 690, 250);
        addObject(new DayWater(), 690, 280);
        addObject(new DayWater(), 690, 300);
        addObject(new DayWater(), 660, 200);
        addObject(new DayWater(), 660, 220);
        addObject(new DayWater(), 660, 280);
        addObject(new DayWater(), 660, 300);
        
        //Create ground
        for (int x = 0; x <= 750; x = x + 15)
        {
            for (int y = 0; y<=500; y = y + 15)
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
        
        for (int x = 50; x <= 600; x = x + 50)
        {
            for (int y = 0; y<=500; y = y + 50)
            {
                int ranNum = Greenfoot.getRandomNumber(100);
                if (ranNum % 4 == 0)
                {
                    addObject(new DayWater(), x, y);
                    addObject(new DayTree1(), x, y);
                }
                else if(ranNum % 7 == 0)
                {
                    addObject(new DayWater(), x, y);
                    addObject(new DayTree2(), x, y);
                }
                else
                {
                }
            }
        }
        

        
        //Creepy Church Spawning
        DayChurch church = new DayChurch();
        addObject(church, 690, 250);
        church.turn(90);
        
        //Player spawning
        addObject(player, 50, 350);
        
        //Heart images
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
    
        public void act()
    {
        checkHealth();
        
        //Game ending
        if (player.getX() == 660 && player.getY() == 250)
        {
            Greenfoot.setWorld(new EndScreen());
        }
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
            
            heart4.setImage("whole_heart.png");
            GreenfootImage heart4Image = heart4.getImage();
            heart4Image.scale(heart4Image.getWidth() * 2, heart4Image.getHeight() * 2);
            heart4.setImage(heart4Image);
            
            heart3.setImage("whole_heart.png");
            GreenfootImage heart3Image = heart3.getImage();
            heart3Image.scale(heart3Image.getWidth() * 2, heart3Image.getHeight() * 2);
            heart3.setImage(heart3Image);
            
            heart2.setImage("whole_heart.png");
            GreenfootImage heart2Image = heart2.getImage();
            heart2Image.scale(heart2Image.getWidth() * 2, heart2Image.getHeight() * 2);
            heart2.setImage(heart2Image);
            
            heart1.setImage("whole_heart.png");
            GreenfootImage heart1Image = heart1.getImage();
            heart1Image.scale(heart1Image.getWidth() * 2, heart1Image.getHeight() * 2);
            heart1.setImage(heart1Image);
        }
        else if (player.health == 80)
        {
            heart5.setImage("empty_heart.png");
            GreenfootImage heart5Image = heart5.getImage();
            heart5Image.scale(heart5Image.getWidth() * 2, heart5Image.getHeight() * 2);
            heart5.setImage(heart5Image);
            
            heart4.setImage("whole_heart.png");
            GreenfootImage heart4Image = heart4.getImage();
            heart4Image.scale(heart4Image.getWidth() * 2, heart4Image.getHeight() * 2);
            heart4.setImage(heart4Image);
            
            heart3.setImage("whole_heart.png");
            GreenfootImage heart3Image = heart3.getImage();
            heart3Image.scale(heart3Image.getWidth() * 2, heart3Image.getHeight() * 2);
            heart3.setImage(heart3Image);
            
            heart2.setImage("whole_heart.png");
            GreenfootImage heart2Image = heart2.getImage();
            heart2Image.scale(heart2Image.getWidth() * 2, heart2Image.getHeight() * 2);
            heart2.setImage(heart2Image);
            
            heart1.setImage("whole_heart.png");
            GreenfootImage heart1Image = heart1.getImage();
            heart1Image.scale(heart1Image.getWidth() * 2, heart1Image.getHeight() * 2);
            heart1.setImage(heart1Image);
        }
        else if (player.health == 70)
        {
            heart4.setImage("half_heart.png");
            GreenfootImage heart4Image = heart4.getImage();
            heart4Image.scale(heart4Image.getWidth() * 2, heart4Image.getHeight() * 2);
            heart4.setImage(heart4Image);
            
            heart3.setImage("whole_heart.png");
            GreenfootImage heart3Image = heart3.getImage();
            heart3Image.scale(heart3Image.getWidth() * 2, heart3Image.getHeight() * 2);
            heart3.setImage(heart3Image);
            
            heart2.setImage("whole_heart.png");
            GreenfootImage heart2Image = heart2.getImage();
            heart2Image.scale(heart2Image.getWidth() * 2, heart2Image.getHeight() * 2);
            heart2.setImage(heart2Image);
            
            heart1.setImage("whole_heart.png");
            GreenfootImage heart1Image = heart1.getImage();
            heart1Image.scale(heart1Image.getWidth() * 2, heart1Image.getHeight() * 2);
            heart1.setImage(heart1Image);
        }
        else if (player.health == 60)
        {
            heart4.setImage("empty_heart.png");
            GreenfootImage heart4Image = heart4.getImage();
            heart4Image.scale(heart4Image.getWidth() * 2, heart4Image.getHeight() * 2);
            heart4.setImage(heart4Image);
            
            heart3.setImage("whole_heart.png");
            GreenfootImage heart3Image = heart3.getImage();
            heart3Image.scale(heart3Image.getWidth() * 2, heart3Image.getHeight() * 2);
            heart3.setImage(heart3Image);
            
            heart2.setImage("whole_heart.png");
            GreenfootImage heart2Image = heart2.getImage();
            heart2Image.scale(heart2Image.getWidth() * 2, heart2Image.getHeight() * 2);
            heart2.setImage(heart2Image);
            
            heart1.setImage("whole_heart.png");
            GreenfootImage heart1Image = heart1.getImage();
            heart1Image.scale(heart1Image.getWidth() * 2, heart1Image.getHeight() * 2);
            heart1.setImage(heart1Image);
        }
        else if (player.health == 50)
        {
            heart3.setImage("half_heart.png");
            GreenfootImage heart3Image = heart3.getImage();
            heart3Image.scale(heart3Image.getWidth() * 2, heart3Image.getHeight() * 2);
            heart3.setImage(heart3Image);
            
            heart2.setImage("whole_heart.png");
            GreenfootImage heart2Image = heart2.getImage();
            heart2Image.scale(heart2Image.getWidth() * 2, heart2Image.getHeight() * 2);
            heart2.setImage(heart2Image);
            
            heart1.setImage("whole_heart.png");
            GreenfootImage heart1Image = heart1.getImage();
            heart1Image.scale(heart1Image.getWidth() * 2, heart1Image.getHeight() * 2);
            heart1.setImage(heart1Image);
        }
        else if (player.health == 40)
        {
            heart3.setImage("empty_heart.png");
            GreenfootImage heart3Image = heart3.getImage();
            heart3Image.scale(heart3Image.getWidth() * 2, heart3Image.getHeight() * 2);
            heart3.setImage(heart3Image);
            
            heart2.setImage("whole_heart.png");
            GreenfootImage heart2Image = heart2.getImage();
            heart2Image.scale(heart2Image.getWidth() * 2, heart2Image.getHeight() * 2);
            heart2.setImage(heart2Image);
            
            heart1.setImage("whole_heart.png");
            GreenfootImage heart1Image = heart1.getImage();
            heart1Image.scale(heart1Image.getWidth() * 2, heart1Image.getHeight() * 2);
            heart1.setImage(heart1Image);
        }
        else if (player.health == 30)
        {
            heart2.setImage("half_heart.png");
            GreenfootImage heart2Image = heart2.getImage();
            heart2Image.scale(heart2Image.getWidth() * 2, heart2Image.getHeight() * 2);
            heart2.setImage(heart2Image);
            
            heart1.setImage("whole_heart.png");
            GreenfootImage heart1Image = heart1.getImage();
            heart1Image.scale(heart1Image.getWidth() * 2, heart1Image.getHeight() * 2);
            heart1.setImage(heart1Image);
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
        // Spawn health pick ups in world
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
