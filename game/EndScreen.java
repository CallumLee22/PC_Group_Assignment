import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


public class EndScreen extends World
{
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    
    public EndScreen()
    {    
        // Create a new world with 750x500 cells with a cell size of 1x1 pixels.
        super(750, 500, 1);
        
        // Create grass background
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
        
        // Get title text box
        DayTextBox textBox = new DayTextBox("title");
        textBox.getImage().drawImage(new GreenfootImage("You Survived", 70, Color.WHITE, null), 160, 40);
        addObject(textBox, 375, 85);
        
        // Restart button
        DayTextBox restartButton = new DayTextBox("character");
        restartButton.getImage().drawImage(new GreenfootImage("Restart", 40, Color.WHITE, null), 15, 45);
        addObject(restartButton, 375, 400);
    }
    
    public void act()
    {
        List<DayTextBox> objects= this.getObjects(DayTextBox.class);
        if (Greenfoot.mouseClicked(objects.get(1)))
        {
            Greenfoot.setWorld(new TitleScreen());
        }
    }
}
