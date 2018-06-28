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
        
        movimientosEscuela();
        //mover();
        puntaje();
        recuperaVida();
        pierdeVida();
        
        disparaBala();
        
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
    public void movimientosEscuela()
    {
        if(!isTouching(Pupitre.class)) 
            mover();   
        else
            move(-1);
        
            
    }
    
    /**
     * 
     */
    public void movimientosCalle()
    {
        if(!isTouching(Alcantarilla.class))
            mover();
        else
            move(-1); 
    }
    
    
    /**
     * 
     */
    public void movimientosrancho()
    {
        if(!isTouching(Cactus.class))
            mover();
        else
            move(-1);
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
        
        Actor Maruchan;
        Maruchan=getOneObjectAtOffset(0,0,Maruchan.class);
        if(Maruchan != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Maruchan);
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
        
        Actor Vago;
        Vago = getOneObjectAtOffset(0,0,Vago.class);
        if( Vago != null)
        {
            setLocation(getX()-60, getY()-60);
            World world;
            world = getWorld();

            MyWorld mundo = (MyWorld)world;
            BarraDeVida vida = mundo.getVida();
            vida.disminuyeVida();
            
        }
        
        Actor Pandillero;
        Pandillero = getOneObjectAtOffset(0,0,Pandillero.class);
        if( Pandillero != null)
        {
            setLocation(getX()-60, getY()-60);
            World world;
            world = getWorld();

            MyWorld mundo = (MyWorld)world;
            BarraDeVida vida = mundo.getVida();
            vida.disminuyeVida();
            
        }
        
        Actor BalaRanchero;
        BalaRanchero = getOneObjectAtOffset(0,0,BalaRanchero.class);
        if( BalaRanchero != null/*isTouching(BalaRanchero.class)*/)
        {
            setLocation(getX()-60, getY()-60);
            World world;
            world = getWorld();

            MyWorld mundo = (MyWorld)world;
            BarraDeVida vida = mundo.getVida();
            vida.disminuyeVida();
        }
    }
    
    /**
     * Método que hace que el jugador dispare la bala al presionar la tecla de espacio.
     */
    public void disparaBala()
    {
        BalaJugador bala = new BalaJugador();
        if(Greenfoot.isKeyDown("space"))
        {
            World world = getWorld();
            world.addObject(bala, 0, 0);
            bala.setLocation(getX(),getY());
            bala.setRotation(getRotation());
            
            
            /*if(isAtEdge())
                bala();*/
        }
    }
}