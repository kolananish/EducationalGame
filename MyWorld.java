import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepareLaunch();
    }
    /**
     * Puts the rocket on the screen in starting location with correct size
     */
    public void prepareLaunch () {
        Rocket rocket = new Rocket();
        addObject(rocket, 30, 350);
    }
}
