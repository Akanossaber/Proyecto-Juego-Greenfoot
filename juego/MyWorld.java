import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int contador=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        prepare();
    }
    public void act()
    {
        contador++;
        if(contador>59)
        {    
            addEnemigo1();
            contador=0;
        }
    }
    public void addEnemigo1()
    {
        addObject(new Enemigo1(), Greenfoot.getRandomNumber(600),0);
    }
    private void prepare()
    {
        Remu player= new Remu();
        addObject(player,252,510);
        player.setLocation(270,491);
    }
}
