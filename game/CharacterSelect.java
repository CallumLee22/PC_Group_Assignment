import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class CharacterSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterSelect extends World
{

    /**
     * Constructor for objects of class CharacterSelect.
     * 
     */
    public CharacterSelect()
    {    
        // Create a new world with 750x500 cells with a cell size of 1x1 pixels.
        super(750, 500, 1);
        
        // Create green grass base as a background for the character selection
        for (int x = 0; x <= 750; x += 15)
        {
            for (int y = 0; y <= 500; y += 15)
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
        
        // Create array list to store buttons to select character
        ArrayList<DayTextBox> boxes = new ArrayList<DayTextBox>();
        for (int i = 0; i <=3; i++)
        {
            DayTextBox charBox = new DayTextBox("character");
            GreenfootImage char1 = images.get(i);
            char1.scale(char1.getWidth() * 5, char1.getHeight() * 5);
            charBox.getImage().drawImage(char1, 30, 20);
            boxes.add(charBox);
        }

        DayTextBox char1 = boxes.get(0);
        DayTextBox char2 = boxes.get(1);
        DayTextBox char3 = boxes.get(2);
        DayTextBox char4 = boxes.get(3);

        // Add character options to the screen
        addObject(char1, 250, 250);
        addObject(char2, 500, 250);
        addObject(char3, 250, 400);
        addObject(char4, 500, 400);
    }
    
    public void act()
    {
        List<DayTextBox> objects= this.getObjects(DayTextBox.class);
        
        if (Greenfoot.mouseClicked(objects.get(1)))
        {
            Greenfoot.setWorld(new Level1(2));
        }
        else if (Greenfoot.mouseClicked(objects.get(2)))
        {
            Greenfoot.setWorld(new Level1(4));
        }
        else if (Greenfoot.mouseClicked(objects.get(3)))
        {
            Greenfoot.setWorld(new Level1(5));
        }
        else if (Greenfoot.mouseClicked(objects.get(4)))
        {
            Greenfoot.setWorld(new Level1(6));
        }
    }
}
