import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int targetX = 0;
    public static int score = 0;
    public static int rocketX;
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
    public double launch(double time, double angle, double velocity)
    {
        //calculates x-position based on velocity, angle, and time
        double xPosition = (velocity * Math.cos(angle) * time);
        return xPosition;
    }
    
    static int totalScore = 0;
    static int counter = 0;
    
    /**
     * Puts the rocket on the screen in starting location with correct size
     */
    public void prepareLaunch () {
        Target target = new Target();
        int rand = 150+Greenfoot.getRandomNumber(400);
        targetX = rand;
        showText("Target Distance: " + rand, 290, 30);
        addObject(target,rand, 350);
        
        Button launchButton = new Button();
        addObject(launchButton, 80, 30);
    }
    public static void addToScore() {
        int difference = Math.abs(targetX - rocketX);
        score += difference;
        System.out.println(score);
        totalScore = totalScore + score;
        counter ++;
        if (counter == 4){
            totalScore = 0;
        }
    }
        
    public void updateScore() {
        showText("Score: " + score, 500, 30);
    }
}
