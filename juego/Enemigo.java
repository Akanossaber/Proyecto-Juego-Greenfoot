import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Actor
{
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()//aqui no tiene que hacer nada, solo darle las instrucciones a sus actores que este caso seran los enemigos
    {
        // Add your action code here.
    }
    public void moveEnemigo()//aqui es para que se muevan para abajo
    {
        setLocation(getX(),getY()+3);
        
        
    }
    public void matar()
    {
        if(getY()==699)//esto es para que desaparezcan cuando llegue al final del mapa se borren y no se acumulen
        {
            getWorld().removeObject(this);
        }
    }
}
