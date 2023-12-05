import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DayTextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayTextBox extends Actor
{
    /**
     * Act - do whatever the DayTextBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private String purpose;
    
    public DayTextBox(String purpose)
    {
        this.purpose = purpose;
        
        if (purpose == "title")
        {
            GreenfootImage image = this.getImage();
            image.scale(image.getWidth() / 5, image.getHeight() / 6); 
            this.setImage(image);
        }
        else if (purpose == "character")
        {
            GreenfootImage boxImage = this.getImage();
            boxImage.scale(boxImage.getWidth() / 23, boxImage.getHeight() / 7);
            this.setImage(boxImage);
        }
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
