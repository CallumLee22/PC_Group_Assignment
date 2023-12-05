import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
    private StartButton startButton = new StartButton();
    private DayTextBox textBox = new DayTextBox("title");
    
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
        textBox.getImage().drawImage(new GreenfootImage("Zombie Villager", 64, Color.WHITE, null), 100, 40);
        addObject(textBox, 375, 150);
        
        // Add start button
        addObject(startButton, 375, 400);
    }
    
    public void act()
    {
        // Show character select screen of start button is pressed
        if (Greenfoot.mouseClicked(startButton))
        {
            characterSelect();
        }
    }
    
    public void characterSelect()
    {
        // Remove title screen objects
        removeObject(startButton);
        removeObject(textBox);
        
        textBox.getImage().clear();
        textBox = new DayTextBox("title");
        textBox.getImage().drawImage(new GreenfootImage("Select Your Character", 64, Color.WHITE, null), 30, 40);
        addObject(textBox, 375, 85);
        
        // Create array list to store all images for character select
        ArrayList<GreenfootImage> images = new ArrayList<GreenfootImage>();
        for (int i = 2; i <= 6; i++)
        {
            if (i != 3)
            {
                images.add(new GreenfootImage(i + " - forward facing.png"));
            }
        }
        
        ArrayList<DayTextBox> boxes = new ArrayList<DayTextBox>();
        for (int i = 0; i <=3; i++)
        {
            DayTextBox charBox = new DayTextBox("character");
            GreenfootImage char1 = images.get(i);
            char1.scale(char1.getWidth() * 5, char1.getHeight() * 5);
            charBox.getImage().drawImage(char1, 25, 20);
            boxes.add(charBox);
        }
        
        addObject(boxes.get(0), 250, 250);
        addObject(boxes.get(1), 500, 250);
        addObject(boxes.get(2), 250, 400);
        addObject(boxes.get(3), 500, 400);
    }
}
