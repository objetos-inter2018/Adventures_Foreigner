import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Personaje
{
    boolean herido;
    public int puntos=0;
    public int vidas = 4;
    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        movimientos();
        //mover();
        puntaje();
        recuperaVida();
        pierdeVida();
        
    }    
    
    /**
     * Este metodo hace que el jugador se mueva hacia la derecha o izquierda segun la tecla que presione
     */
    public void mover()
    {
       if( Greenfoot.isKeyDown("left") )
        {
           move(-5);


            //turn(-5);
        }
       if( Greenfoot.isKeyDown("right") )
       {
           move(5);

           //turn(5);  
       }
       if( Greenfoot.isKeyDown("up") )
          {
           setLocation( getX() , getY() - 5 );

               
          }
       if( Greenfoot.isKeyDown("down") )
       {
           setLocation( getX(), getY() + 5 );

       }
            
    }
    
    /**
     * 
     */
    public void movimientos()
    {
        if(!isTouching(Pupitre.class)) 
            mover();
        else
        {
            move(-1);
        }
    }
    
    /**
     * Método que verifica cuando el jugador obtiene puntos.
     * @Return puntos. Los puntos obtenidos en total.
     */
    public void puntaje()
    {
        Actor Atun;
        Atun=getOneObjectAtOffset(0,0,Atun.class);
        if(Atun != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Atun);
            MyWorld mundo = (MyWorld)world;
            Counter puntos = mundo.getCounter();
            puntos.masPuntos();
        }
        
        Actor BuenaCalificacion;
        BuenaCalificacion=getOneObjectAtOffset(0,0,BuenaCalificacion.class);
        if(BuenaCalificacion != null)
        {
            World world;
            world = getWorld();
            world.removeObject(BuenaCalificacion);
            MyWorld mundo = (MyWorld)world;
            Counter puntos = mundo.getCounter();
            puntos.masPuntos();
        }
        
        
        
    }
    
    
    /**
     * Método que incrementa la vida del jugador en una unidad y actualiza la barra de vida
     */
    public void recuperaVida()
    {
        Actor Refresco;
        Refresco = getOneObjectAtOffset(0,0,Refresco.class);
        if(Refresco != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Refresco);
            
            MyWorld mundo = (MyWorld)world;
            BarraDeVida vida = mundo.getVida();
            vida.aumentaVida();
        }
    }
    
    
    /**
     * Método que se encarga de disminuir una vida y actualizar la barra 
     */
    public void pierdeVida()
    {
        Actor Bravucon;
        Bravucon = getOneObjectAtOffset(0,0,Bravucon.class);
        if( Bravucon != null)
        {
            setLocation(getX()-60, getY()-60);
            World world;
            world = getWorld();
            
            
            MyWorld mundo = (MyWorld)world;
            BarraDeVida vida = mundo.getVida();
            vida.disminuyeVida();
        }
        
        Actor Profesor;
        Profesor = getOneObjectAtOffset(0,0,Profesor.class);
        if( Profesor != null)
        {
            setLocation(getX()-60, getY()-60);
            World world;
            world = getWorld();

            MyWorld mundo = (MyWorld)world;
            BarraDeVida vida = mundo.getVida();
            vida.disminuyeVida();
            
        }
        
        
    }
}