import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Jugador
{
    int puntos =0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage( new GreenfootImage("Score: " + puntos ,24,Color.RED,Color.WHITE));
    }    
    
    public void masPuntos()
    {
        puntos++;
    }
    
    
    public int puntos()
    {
        return puntos;
    }
}
