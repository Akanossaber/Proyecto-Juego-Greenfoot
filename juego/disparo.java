import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class disparo extends Actor
{
    /**
     * Act - do whatever the disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        trayectoria();
        
        matar();
      // Add yo code here.
    }
    public void trayectoria()
    {
       setLocation(getX(),getY()-5); 
    }
    public void matar()
    {
       
  
        Actor Enemigo= getOneIntersectingObject(Enemigo.class);
        if (Enemigo !=null)
        {
            getWorld().removeObject(Enemigo);
            getWorld().removeObject(this);
        }
        else if (getY()==0)
        {
            getWorld().removeObject(this);
        }
    }
}
