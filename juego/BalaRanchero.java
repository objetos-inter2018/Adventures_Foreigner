import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalaRanchero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalaRanchero extends Ranchero
{
    /**
     * Act - do whatever the BalaRanchero wants to do. This method is called whenever
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
