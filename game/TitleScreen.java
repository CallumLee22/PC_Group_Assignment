import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 750x500 cells with a cell size of 1x1 pixels.
        super(750, 500, 1);
        
        // Create green grass base as a background for the title screen
        for (int x = 1; x <= 750; x = x + 15)
        {
            for (int y = 1; y <= 500; y = y + 15)
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
        
        // Make text box for title
        DayTextBox textBox = new DayTextBox();
        GreenfootImage image = textBox.getImage();
        image.scale(image.getWidth() / 5, image.getHeight() / 6); 
        textBox.setImage(image);
        textBox.getImage().drawImage(new GreenfootImage("Zombie Villager", 64, Color.WHITE, null), 100, 40);
        addObject(textBox, 375, 150);
        
        // Add start button
        StartButton startButton = new StartButton();
        addObject(startButton, 375, 400);
    }
}
