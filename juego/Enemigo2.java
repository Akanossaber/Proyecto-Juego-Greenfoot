 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo2 extends Enemigo
{
    /**
     * Act - do whatever the Enemigo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()// lo mismo que con enemigo 1, lo que tiene que hacer cuando se ejecute el juego
    {
        moveEnemigo();
        matar();
    }
}
