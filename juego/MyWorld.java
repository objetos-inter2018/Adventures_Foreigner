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
    
    int nivel=1;
    int puntos=0;
    int mundo=0;
    
    Jugador jug = new Jugador();
    Profesor prof = new Profesor();
    Atun atun = new Atun();
    Atun atun2 = new Atun();
    Bravucon bravucon =  new Bravucon();
        Pupitre pupitre = new Pupitre();
        BuenaCalificacion bueno = new BuenaCalificacion();
        BuenaCalificacion bueno2 = new BuenaCalificacion();
        Refresco refresco = new Refresco();
        Portal portal = new Portal();
        
        
    //Refresco refresco = new Refresco();
    Refresco refresco2 = new Refresco();
        Alcantarilla alcan = new Alcantarilla();
        Alcantarilla alcan1 = new Alcantarilla();
        Vago vago = new Vago();
        Pandillero pandi = new Pandillero();
        Pandillero pandi1 = new Pandillero();
        Maruchan maru1 = new Maruchan();
        Maruchan maru2 = new Maruchan();
        Maruchan maru3 = new Maruchan();
        Maruchan maru4 = new Maruchan();
        Maruchan maru5 = new Maruchan(); 
        
    Ranchero ran1 = new Ranchero();
        Ranchero ran2 = new Ranchero();
        Ranchero ran3 = new Ranchero();
        Ranchero ran4 = new Ranchero();
        
        Cactus cac = new Cactus();
        Cactus cac1 = new Cactus();
        Cactus cac2 = new Cactus();
        Cactus cac3 = new Cactus();    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        escuela();
        
        
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
        addObject( jug, 40,330);    //Foraneo
        addObject( prof, 555, Greenfoot.getRandomNumber(400) ); //Profesor
        addObject( bravucon, 230, Greenfoot.getRandomNumber(400) ); //Bravucon
        addObject( atun, 166,20);   //Atun
        addObject( atun2, 90,325);  //Atun
        addObject( bueno, 300,240); //BuenaCalificacion
        addObject( bueno2, 500,357);    //BuenaCalificacion
        addObject( pupitre, 380, Greenfoot.getRandomNumber(400));    //Pupitre
        addObject( refresco, 450, Greenfoot.getRandomNumber(400));   //Refresco
        
        addObject(portal,580,385);
    }
    
    public void calle()
    {
        removeObject(prof);
        removeObject(bravucon);
        removeObject(atun);
        removeObject(atun2);
        removeObject(bueno);
        removeObject(bueno2);
        removeObject(pupitre);
        removeObject(refresco);
        removeObject(jug);
        removeObject(portal);
        
        setBackground("calle.jpg");
        
        addObject(counter, 55, 18);  //Contador
        addObject(barra, 40, 50);   //Barra de vida

        
        addObject( jug, 40,330);    //Foraneo
        addObject( refresco, 475, Greenfoot.getRandomNumber(400));   //Refresco
        addObject( refresco2, 104, Greenfoot.getRandomNumber(400));   //Refresco
        addObject( alcan, 200,370);
        addObject( alcan1, 430,340);
        addObject(vago, 555,Greenfoot.getRandomNumber(400));
        addObject(pandi, 140,Greenfoot.getRandomNumber(400));
        addObject(pandi1,357,Greenfoot.getRandomNumber(400));
        
        addObject(maru1,Greenfoot.getRandomNumber(550),Greenfoot.getRandomNumber(300));
        addObject(maru2,Greenfoot.getRandomNumber(550),Greenfoot.getRandomNumber(300));
        addObject(maru3,Greenfoot.getRandomNumber(550),Greenfoot.getRandomNumber(300));
        addObject(maru4,Greenfoot.getRandomNumber(550),Greenfoot.getRandomNumber(300));
        addObject(maru5,Greenfoot.getRandomNumber(550),Greenfoot.getRandomNumber(300));
        
        addObject(portal,580,385);
    }
    
    public void rancho()
    {
        removeObject(jug);
        removeObject(refresco);
        removeObject(refresco2);
        removeObject(alcan);
        removeObject(alcan1);
        removeObject(vago);
        removeObject(pandi);
        removeObject(pandi1);
        removeObject(maru1);
        removeObject(maru2);
        removeObject(maru3);
        removeObject(maru4);
        removeObject(maru5);
        removeObject(portal);
        
        setBackground("atardecer.jpg");
        
        addObject(counter, 55, 18);  //Contador
        addObject(barra, 40, 50);   //Barra de vida
        

        addObject( jug, 40,330);
        addObject( ran1, 550,Greenfoot.getRandomNumber(400));
        addObject( ran2, 475,Greenfoot.getRandomNumber(400));
        addObject( ran3, 550,Greenfoot.getRandomNumber(400));
        addObject( ran4, 475,Greenfoot.getRandomNumber(400));
        addObject(cac, 140,370);
        addObject(cac1, 339,200);
        addObject(cac2, 200,110);
        addObject(cac3, 275,285);
        addObject(portal,580,385);
        
    }

    
}
