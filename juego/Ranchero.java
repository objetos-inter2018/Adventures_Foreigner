import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ranchero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ranchero extends Enemigo
{
    /**
     * Act - do whatever the Ranchero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mueve();
        disparaBala();
        muerto();
        // Add your action code here.
    }    
    
    public void disparaBala()
    {
        BalaRanchero bala = new BalaRanchero();
        int num = Greenfoot.getRandomNumber(100);
        if(num==0)
        {
            World world = getWorld();
            world.addObject(bala, 0, 0);
            bala.setLocation(getX(),getY());
            bala.setRotation(getRotation());
            /*if(isAtEdge())
                bala();*/
        }
    }
    
    public void muerto()
    {
        Actor BalaJugador;
        BalaJugador = getOneObjectAtOffset(0,0,BalaJugador.class);
        if(/*isTouching(BalaJugador.class)*/ BalaJugador != null)
        {
            World world;
            world = getWorld();
            world.removeObject(BalaJugador);
            world.removeObject(this);
            //MyWorld mundo = (MyWorld)world;
        }
    }
}
