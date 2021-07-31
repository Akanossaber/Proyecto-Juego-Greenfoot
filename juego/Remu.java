import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Remu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Remu extends Actor
{
    int vida;
    boolean tiro = true;
    /**
     * Act - do whatever the Remu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()// al momento de que esten como que ejecutandose esto es lo que va a ser el actor, en este caso la Remu
    {
        moveAround();
        Disparar();
        
    }
    public void moveAround()// para que se mueva de lado a lado.
    {
        
        if(Greenfoot.isKeyDown("right"))//para que se mueva en el eje Y positivo cuando presiono la flecha derecha
        {
            setLocation(getX()+7,getY());
        }
        if(Greenfoot.isKeyDown("left"))//lo mismo que arriba pero para la izquierda
        {
            setLocation(getX()-7,getY());
        }
        
    }
    public void Disparar()//aqui es para que dispare
    {
        if(Greenfoot.isKeyDown("x")&& tiro==true)//cuando presione la tecla X va a salir el rombo
        {
            getWorld().addObject(new disparo(),getX(),getY()-75 );
            tiro= false;// y el disparo va a salir a una distancia de 75 respecto a mi actor
        }
        else if (!Greenfoot.isKeyDown("x"))// esto es para que no se tenga que apachar la barra para que dispare si no que se levante tambien 
        {
            tiro=true;
            
        }
    
    }
    
            }
