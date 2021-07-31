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
        desaparecer();
        
        //matar();
      // Add yo code here.
    }
    public void trayectoria()//este es para que se ponga el rombo en la posicion del usuario
    {
       setLocation(getX(),getY()-5); 
    }//como ya no quise matar al enemigo, solo comente esta parte
    // public void matar()
    // {
       
  
        // Actor Enemigo= getOneIntersectingObject(Enemigo.class);// aqui es basicamente para que al momento de que el rombo tope con el dibujo del enemigo, el enemigo desaparezca
        // if (Enemigo !=null)
        // {
            // getWorld().removeObject(Enemigo);
            // getWorld().removeObject(this);
        // }
        // else if (getY()==0)
        // {
            // getWorld().removeObject(this);
        // }
    // }
    public void desaparecer()
    {
        if(getY()==1)//esto es para que desaparezcan cuando llegue al final del mapa se borren y no se acumulen
        {
            getWorld().removeObject(this);
        }
    }
}
