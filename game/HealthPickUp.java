import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Items that a player can pick up to restore health
 * 
 * @author Callum Lee
 * @version 13/12/2023
 */
public class HealthPickUp extends Actor
{
    /**
     * Act - do whatever the HealthPickUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public void checkValidSpawn()
    {
        // Only spawn health pick ups in places that the player can access
        while(
        isAtEdge() || isTouching(DayWater.class) || isTouching(DayHouse1.class) || isTouching(DayChurch.class) || isTouching(DayHouse2.class) || 
        isTouching(DayPit.class)|| isTouching(NightWater.class) || isTouching(NightHouse1.class) || isTouching(NightChurch.class) || 
        isTouching(NightHouse2.class) || isTouching(NightPit.class) || isTouching(Heart.class)
        )
        {
            int x = Greenfoot.getRandomNumber(750);
            int y = Greenfoot.getRandomNumber(500);
            
            setLocation(x, y);
        }
    }
}
