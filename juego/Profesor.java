import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesor extends Enemigo
{
    //Examen examen = new Examen();
    /**
     * Act - do whatever the Profesor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        mueve();
        //tocaJugador();
        //bala();
        disparaExamen();
    }    
    
    /*public void bala()
    {
        Actor jugador = getOneIntersectingObject(Jugador.class);
        if(jugador != null)
        {
            World world = getWorld();
            world.removeObject(this);
        }
        if(isAtEdge())
        {
             World world = getWorld();
            world.removeObject(this);
        }
    }*/
    
    public void disparaExamen()
    {
        Examen examen = new Examen();
        int num = Greenfoot.getRandomNumber(100);
        if(num==0)
        {
            World world = getWorld();
            world.addObject(examen, 0, 0);
            examen.setLocation(getX(),getY());
            examen.setRotation(getRotation());
            /*if(isAtEdge())
                bala();*/
        }
    }
}
