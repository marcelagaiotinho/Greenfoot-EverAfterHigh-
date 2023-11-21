import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Amareloganhou here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amareloganhou extends World
{

    /**
     * Constructor for objects of class Amareloganhou.
     * 
     */
    public Amareloganhou()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
    }
public void act(){
    if(Greenfoot.isKeyDown("enter")){
      setBackground(new GreenfootImage("Dragons3.png"));  
       
    }
    if(Greenfoot.isKeyDown("enter")){
      setBackground(new GreenfootImage("Dragons(1).png"));  
      
       
    }
}
}