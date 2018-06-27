import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personaje here.
 */
public class Personaje extends Actor
{
    /**
     * Act - do whatever the Personaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mueve();
    }    
    
    public void mueve()
    {
       
       int num;
       num = Greenfoot.getRandomNumber(30);
       switch(num)
       {
           case 0://hacia arriba
                  setLocation( getX(), getY() - Greenfoot.getRandomNumber(50));
                  break;
                  
           case 1://hacia abajo
                  setLocation( getX(), getY() + Greenfoot.getRandomNumber(50));
                  break; 
           
       }
       
       //move(-5);
        /*if( isAtEdge() )//Verifica si toco el borde
        {
            turn(20);
        } */
        //setLocation( getX() + Greenfoot.getRandomNumber(5), getY() + Greenfoot.getRandomNumber(5));   
    }
    
    
}




