import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BarraDeVida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarraDeVida extends Jugador
{
    int vidas = 4;
    int barraAncho = 60;
    int barraAlto = 10;
    int vidaPerdida = (int)barraAncho / vidas;
    
    public BarraDeVida()
    {
        actualizaBarra();
    }
    
    /**
     * Act - do whatever the BarraDeVida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        actualizaBarra();
    }    
    
    public void actualizaBarra()
    {
        setImage( new GreenfootImage(barraAncho + 2, barraAlto + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, barraAncho + 1, barraAlto + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, vidas * vidaPerdida, barraAlto);
    }
    
    /**
     * Metodo que disminuye en una unidad las vidas del personaje. Si llega a cero
     * entonces el juego se detiene.
     */
    public void disminuyeVida()
    {
        vidas--;
        if(vidas==0)
            Greenfoot.stop();
    }
    
    /**
     * Metodo que aumenta en una unidad las vidas del jugador
     */
    public void aumentaVida()
    {
        vidas++;
    }
    
}
