import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tequila here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tequila extends Vago
{
    /**
     * Act - do whatever the Tequila wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-5);
        if(isAtEdge())
        {
            World world;
            world = getWorld();
            world.removeObject(this);
        }
    }    
}