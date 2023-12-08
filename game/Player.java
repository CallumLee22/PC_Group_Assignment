import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int characterNum;
    
    // Set speed
    private int speed = 2;
    
    // Keep track of position
    public int xPos;
    public int yPos;
    
    public Player(int characterNum)
    {
        this.characterNum = characterNum;
        
        this.setImage(characterNum + " - forward facing.png");
        
    }
    
    public void act()
    {
        move();
    }
    
    private void move()
    {
        int x = getX();
        int y = getY();
        
        if (Greenfoot.isKeyDown("down"))
        {
            y += speed;
            setLocation(x, y);
            if (!isTouching(DayBridge.class))
            {
                if (hitObstacles())
                {
                    y -= speed;
                    setLocation(x, y);  
                }
            }
        }
        
        if (Greenfoot.isKeyDown("up"))
        {
            y -= speed;
            setLocation(x, y);
            if (!isTouching(DayBridge.class))
            {
                if (hitObstacles())
                {
                    y += speed;
                    setLocation(x, y);
                }
            }
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            x += speed;
            setLocation(x, y);
            if (!isTouching(DayBridge.class))
            {
                if (hitObstacles())
                {
                    x -= speed;
                    setLocation(x , y);
                }
            }
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            x -= speed;
            setLocation(x, y);
            if (!isTouching(DayBridge.class))
            {
                if (hitObstacles())
                {
                    x += speed;
                    setLocation(x, y);
                }
            }
        }
    }
    
    private boolean hitObstacles()
    {
        if (isTouching(DayWater.class) || isTouching(NightWater.class) || isTouching(DayFence1.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
