import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    public Button() {
        //sets the image as the launch button
        setImage("launch-button.png");
    }
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        //checks if button is pressed
        if(Greenfoot.mouseClicked(this)){
            //creates a new rocket
            Rocket rocket = new Rocket();
            //adds the rocket to the world
            getWorld().addObject(rocket, 30, 350);
            //starts the rocket time and launch
            rocket.time();
        }
    }    
}
