import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vago here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vago extends Enemigo
{
    /**
     * Act - do whatever the Vago wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mueve();
        disparaTequila();
    }    
    
    /**
     *
     */
    public void disparaTequila()
    {
        Tequila tequila = new Tequila();
        int num = Greenfoot.getRandomNumber(100);
        if(num==0)
        {
            World world = getWorld();
            world.addObject(tequila, 0, 0);
            tequila.setLocation(getX(),getY());
            tequila.setRotation(getRotation());
            
        }
    }
}
