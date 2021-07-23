import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Remu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Remu extends Actor
{
    /**
     * Act - do whatever the Remu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Remu()
    {
        setRotation(0);
    }
    public void act()
    {
        moveAround();
        Disparar();
    }
    public void moveAround()
    {
        
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+7,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-7,getY());
        }
        
    }
    public void Disparar()
    {
        if(Greenfoot.isKeyDown("x"))
        {
            getWorld().addObject(new disparo(),getX(),getY()-75);
        }
    }
}
