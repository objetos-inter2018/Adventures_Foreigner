import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    BarraDeVida barra = new BarraDeVida();
    
    int puntos=0;
    int mundo=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        checaNivel();
        
        
        //puntosJugador();
        
    }
    
    
    public Counter getCounter()
    {
        return counter;
    }
    
    public BarraDeVida getVida()
    {
        return barra;
    }
    
    /**
     * Funcion que inicializa la posicion de los personajes y los objetos 
     * en el primer escenario.
     */
    public void escuela()
    {
        addObject(counter, 55, 18);  //Contador
        addObject(barra, 40, 50);   //Barra de vida
        
        Jugador jug = new Jugador();
        Profesor prof = new Profesor();
        Atun atun = new Atun();
        Atun atun2 = new Atun();
        Bravucon bravucon =  new Bravucon();
        Pupitre pupitre = new Pupitre();
        BuenaCalificacion bueno = new BuenaCalificacion();
        BuenaCalificacion bueno2 = new BuenaCalificacion();
        Refresco refresco = new Refresco();
        
        addObject( jug, 40,330);    //Foraneo
        addObject( prof, 555, Greenfoot.getRandomNumber(400) ); //Profesor
        addObject( bravucon, 230, Greenfoot.getRandomNumber(400) ); //Bravucon
        addObject( atun, 166,20);   //Atun
        addObject( atun2, 90,325);  //Atun
        addObject( bueno, 300,240); //BuenaCalificacion
        addObject( bueno2, 500,357);    //BuenaCalificacion
        addObject( pupitre, 380, Greenfoot.getRandomNumber(400));    //Pupitre
        addObject( refresco, 450, Greenfoot.getRandomNumber(400));   //Refresco
    }
    
    public void calle()
    {
        setBackground("calle.jpg");
        
        addObject(counter, 55, 18);  //Contador
        addObject(barra, 40, 50);   //Barra de vida
        
        Jugador jug = new Jugador();
        Refresco refresco = new Refresco();
        Refresco refresco2 = new Refresco();
        Alcantarilla alcan = new Alcantarilla();
        
        addObject( jug, 40,330);    //Foraneo
        addObject( refresco, 475, Greenfoot.getRandomNumber(400));   //Refresco
        addObject( refresco2, 104, Greenfoot.getRandomNumber(400));   //Refresco
        addObject( alcan, 200,370);
    }
    
    public void checaNivel()
    {
        escuela();
        int p = counter.puntos();
        if(p > 3)
        {
            calle();
            Greenfoot.stop();
        }
        
    }
    
}
