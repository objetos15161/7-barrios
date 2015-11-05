import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Barrio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrio extends World
{
    public Hombre hombre;
    public Mujer mujer;
    public Male male;
    public Female female;  
    public Perro perro;
    public Gato gato;
   
    private Counter vidas;
    private Counter lvl;
    
    
    /**     
     */    
    public Barrio()
    {            
        super(580, 444, 1); 
        lvl = new Counter("Nivel: ");
        lvl.setValue(0);
        Inicio();
    }
    
    public void Inicio()
    {       
           super.setBackground("Clouds.png");     
           seleccionPersonaje();  
    }
    
    public void seleccionPersonaje()
    {     
            hombre = new Hombre();
            addObject(hombre, (super.getWidth()/3), (super.getHeight()/2));           
            
            mujer = new Mujer();
            addObject(mujer, (super.getWidth()/3)+super.getWidth()/3, (super.getHeight()/2));
            
            if(Greenfoot.getMouseInfo()!=null)
            {
                if(Greenfoot.getMouseInfo().getActor()==hombre )
                {               
                    this.creaNivel(lvl.getValue()); 
                    lvl.add(1);
                }
            
                if(Greenfoot.getMouseInfo().getActor()==mujer )
                {
                    this.creaNivel(lvl.getValue()); 
                    lvl.add(1);
                }
            }            
    }
    
    public void creaNivel(int n)
    {
        switch(n)
        {
            case 1:        
            super.setBackground("GameOver.png");
            perro = new Perro();
            addObject(perro, Greenfoot.getRandomNumber(getWidth()) ,Greenfoot.getRandomNumber(getHeight()));
            gato = new Gato();
            addObject(gato, Greenfoot.getRandomNumber(getWidth()) ,Greenfoot.getRandomNumber(getHeight()));
            break;
        }        
    }    
}
