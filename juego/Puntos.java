import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Puntos extends Actor
{
    int a;// esto es para agregar el valor que usare mas abajo
    int score=0;//para establecer el contador en 0
    public Puntos()//para poder dibujar el contador en la parte de arriba
    {
        setImage(new GreenfootImage("Puntos: "+score,25, Color.GREEN, Color.BLUE));
    }
    /**
     * Act - do whatever the Puntos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()//esto es para que cuando se ejecute muestre el contador y realize la accion de subir el socre y perder
    {
        subir();
        perder();
        setImage(new GreenfootImage("Puntos: "+score,25, Color.GREEN, Color.BLUE));// Add your action code here.
 
    }
    public void subir()//aqui sube el score nada mas por existir 
    {
        if (score>=0)
        {
            a=5;
            score=score+a;
        }
     }
     public void perder()//si cuando llega a 8000 no ha matado al jefe, peirde
     {
         if (score==8000)
         {
             getWorld().addObject(new Perder(),300,300);
         }
     }
   }
