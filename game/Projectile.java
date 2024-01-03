import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Projectile used to damage enemies
 * 
 * @author Callum Lee
 * @version 3/1/2024
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int direction;
    
    public Projectile(int speed) 
    {
        direction = speed;
    }
    
    public void act()
    {
        move(direction);
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
    
    public void move(int distance) 
    {
        // Gets X and Y positions and changes location
        int x = getX();
        int y = getY();
        x += distance;
        setLocation(x, y);
    }
}
