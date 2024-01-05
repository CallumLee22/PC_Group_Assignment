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
    
    private String direction;
    private int speed;
    
    // Get image to manipulate later
    public GreenfootImage image = getImage();
    
    public Projectile(int speed, String direction)
    {
        if (speed == 3 && direction == "right")
        {
            this.setImage("arrow.png");
            image = this.getImage();
            image.scale(15, 15);
        }
        else if (speed == -3 && direction == "left")
        {
            this.setImage("arrow.png");
            image = this.getImage();
            image.mirrorHorizontally();
            image.scale(15, 15);
        }
        else if (speed == -3 && direction == "up")
        {
            this.setImage("arrow.png");
            image = this.getImage();
            image.rotate(270);
            image.scale(15, 15);
        }
        else if (speed == 3 && direction == "down")
        {
            this.setImage("arrow.png");
            image = this.getImage();
            image.rotate(90);
            image.scale(15, 15);
        }
        this.speed = speed;
        this.direction = direction;
    }
    
    public void act()
    {
        move(speed, direction);
        damage();
        if (
        isAtEdge() || isTouching(DayFence1.class) || 
        isTouching(DayChurch.class) || isTouching(DayHouse1.class) ||
        isTouching(DayHouse2.class) || isTouching(DayFence1.class) ||
        isTouching(DayChurch.class) || isTouching(DayHouse1.class) ||
        isTouching(DayHouse2.class) || isTouching(Enemy.class)
        )
        {
            getWorld().removeObject(this);
        }
    }
    
    public void move(int speed, String direction) 
    {
        // Gets X and Y positions and changes location
        int x = getX();
        int y = getY();
        if (direction == "left" || direction == "right")
        {
            x += speed;
        }
        else if (direction == "up" || direction == "down")
        {
            y += speed;
        }
        setLocation(x, y);
    }
    
    private void damage()
    {
        Enemy enemy = (Enemy) getOneIntersectingObject(Enemy.class);
        if(enemy != null) {
            enemy.health -= 100;
        }
    }
}
