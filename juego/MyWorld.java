import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int contador=0;//declaro el contador para los enemigos
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        prepare();//aqui es para preparar el mundo 
    }
    public void act()//este es para que la cantidad de enemigos generados no sea tan rapida, ya que si no generaria enemigos de forma mas acelerada
    {
        contador++;
        if(contador>45)
        {    
            addEnemigo1();
            contador=0;
        }
    }
    public void addEnemigo1()//aqui se encarga de generar enemigos de manera aleatoria
    {
        addObject(new Enemigo1(), Greenfoot.getRandomNumber(600),0);
    }
    private void prepare()//esto es para que yo no tenga que poner a la Remu cada vez que lo testeo, si no que la coloca en la posicion que le di.
    {
        Remu player= new Remu();
        addObject(player,252,510);
        player.setLocation(270,491);
    }
}
