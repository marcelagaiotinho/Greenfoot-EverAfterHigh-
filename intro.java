import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    public class intro extends World
{
    public int temp = 10;
    public int temp1 = 10;
    public int temp2 = 10;
    public int temp3 = 10;
    public int temp4 = 10;
    /**
     * Constructor for objects of class intro.
     *
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 500, 1);
        prepare();
    }

    public void act(){
        temp--;
        if(Greenfoot.isKeyDown("enter") && (temp < 1)){
            setBackground(new GreenfootImage("Dragons.png"));
            temp1--;
        }
        if (Greenfoot.isKeyDown("enter") && (temp1< 1)){
            Mundo world = new Mundo ();
            Greenfoot.setWorld(world);
        }
    }
   
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}
