import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo1 extends Enemigo
{
    /**
     * Act - do whatever the Enemigo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemigo1()
    {
        setRotation(90);// aqui estoy cambiandole la rotacion, por que si no sale para el lado y no se ve bien
    }
    public void act()//aqui le doy las instrucciones de lo que puede hacer al momento de actuar o que se ejecute el programa
    {
        moveEnemigo();
        matar();
    }
    
}
