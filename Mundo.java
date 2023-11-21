import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @ Marcela Gaioto 
 * @version 0.1 Alpha 
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("ambient-piano-and-strings-10711.mp3");
    
    public void started ()
    {
    bgMusic.playLoop();
    }
    
    public void stopped()
    {
    bgMusic.pause();
    }
    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super (700 , 500 , 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        Braebyrn braebyrn = new Braebyrn();
        addObject(braebyrn,501,367);
        Herowing herowing = new Herowing();
        addObject(herowing,264,378);
        Counter counter = new Counter();
        addObject(counter,223,68);
        Counter2 counter2 = new Counter2();
        addObject(counter2,497,72);
        herowing.setLocation(164,432);
        braebyrn.setLocation(503,423);
        herowing.setLocation(217,398);
        braebyrn.setLocation(488,405);
        braebyrn.setLocation(454,403);
    }
}
