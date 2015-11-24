import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Barrio here.
 * 
 * @autor (Castro Pérez César) 
 * @version (11-10-15)
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
        Greenfoot.setWorld(new Menu());
              
        lvl = new Counter("Nivel: ");
        lvl.setValue(0);
        super.setBackground("Clouds.png"); 
                   
        /*hombre = new Hombre();
        addObject(hombre, (getWidth()/3), (getHeight()/2));
        mujer = new Mujer();
        addObject(mujer, (super.getWidth()/3)+super.getWidth()/3, (super.getHeight()/2));
      */
     
   }
    
    public void Inicio()
    {       
           super.setBackground("Clouds.png");     
           seleccionPersonaje();  
           if(Greenfoot.isKeyDown("escape") )
               {
                 Greenfoot.setWorld(new Menu());        
               }
    }
    
    public void seleccionPersonaje()
    {     
        hombre = new Hombre();
        addObject(hombre, (super.getWidth()/3), (super.getHeight()/2));           
           
        mujer = new Mujer();
        addObject(mujer, (super.getWidth()/3)+super.getWidth()/3, (super.getHeight()/2));
            
        if(Greenfoot.getMouseInfo()!=null)
        {
           if(Greenfoot.mousePressed(hombre))
           {
             //lvl.add(1);
             //this.creaNivel(lvl.getValue()); 
             Greenfoot.setWorld(new San_Sebastian()); 
           }
           if(Greenfoot.mousePressed(mujer))
           {
              //this.creaNivel(lvl.getValue()); 
              //lvl.add(1);
              Greenfoot.setWorld(new San_Sebastian()); 
           }
        }     
    }
    public Mujer dimeMujer()
    {
        return mujer;
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
