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
        
            if (Greenfoot.isKeyDown("down") && y > speed)
        {
            y += speed;
        }
        
        if (Greenfoot.isKeyDown("up") && y > speed)
        {
            y -= speed;
        }
        
        if (Greenfoot.isKeyDown("right") && x > speed)
        {
            x += speed;
        }
        
        if (Greenfoot.isKeyDown("left") && x > speed)
        {
            x -= speed;
        }
        setLocation(x, y);
    }
}
