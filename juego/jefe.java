import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jefe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jefe extends Enemigo
{
    /**
     * Act - do whatever the jefe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int golpes=50;
    public jefe()
    {
        setRotation(180);
    }
    public void act()
    {
        perderl();// Add your action code here.
    }
    public void perderl()//esto es para que tenga como que unas barras de vida, cuando lleguen a 0 se mata el jefe y listo. La vida comienza en 50
    {
        Actor disparo= getOneIntersectingObject(disparo.class);
        if (disparo !=null)
        {
    
             getWorld().removeObject(disparo);
             golpes--;
             
             
        }
        if (golpes ==0)
        {
            getWorld().removeObject(this);
        }
                    }
                
}
