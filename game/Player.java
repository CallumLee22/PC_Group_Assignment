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
    
    public Player(int characterNum)
    {
        // Get the chosen character and set that as the image
        this.characterNum = characterNum;
        this.setImage(characterNum + " - forward facing.png");
        
    }
    
    public void act()
    {
        move();
    }
    
    private void move()
    {
        // Get current position of player
        int x = getX();
        int y = getY();
        
        // Move the player from key press
        if (Greenfoot.isKeyDown("down"))
        {
            this.setImage(characterNum + " - forward facing.png");
            y += speed;
            setLocation(x, y);
            if (hitObstacles())
            {
                y -= speed;
                setLocation(x, y);  
            }
        }
        
        if (Greenfoot.isKeyDown("up"))
        {
            this.setImage(characterNum + " - rear facing_still.png");
            y -= speed;
            setLocation(x, y);
            if (hitObstacles())
            {
                y += speed;
                setLocation(x, y);
            }
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            this.setImage(characterNum + " - right facing.png");
            x += speed;
            setLocation(x, y);
            if (hitObstacles())
            {
                x -= speed;
                setLocation(x, y);
            }
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            this.setImage(characterNum + " - left facing.png");
            x -= speed;
            setLocation(x, y);
            if (hitObstacles())
            {
                x += speed;
                setLocation(x, y);
            }
        }
    }
    
    private boolean hitObstacles()
    {
        // Check is player hits an object that blocks movement
        // Allow player to walk over the bridges
        if (isTouching(DayBridge.class) || isTouching(NightBridge.class))
        {
            return false;
        }
        else if (isTouching(DayWater.class) || isTouching(NightWater.class) || isTouching(DayFence1.class) || isTouching(NightFence1.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
