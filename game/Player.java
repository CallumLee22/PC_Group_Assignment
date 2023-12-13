import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class for the character that the player controls
 * 
 * Callum Lee 
 * 12/12/2023
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
    
    // Player health
    public int health;
    
    public Player(int characterNum)
    {
        // Get the chosen character and set that as the image
        this.characterNum = characterNum;
        this.setImage(characterNum + " - forward facing.png");
        this.health = 100;
    }
    
    public void act()
    {
        move();
        itemPickUp();
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
    
    private void itemPickUp()
    {
        HealthPickUp pickUp = (HealthPickUp) getOneIntersectingObject(HealthPickUp.class);
        if (pickUp != null)
        {
            if (health + 20 > 100)
            {
                health = 100;
            }
            else
            {
                health += 20;
            }
            
            World currentWorld = getWorld();
            currentWorld.removeObject(pickUp);
        }
        
    }
}
