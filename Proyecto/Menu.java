import greenfoot.*;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    static private final int ROWS = 24;
    static private final int COLS = 24;
    static private int CELL_WIDTH=20;    
    
    private Boton_Jugar boton_jugar;
    private Boton_Atras atras;
    private Boton_Records record_boton;
    private Boton_Instrucciones boton_ayuda;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS,COLS,CELL_WIDTH);
        crearBotones();
        act();
    }
    public void crearBotones()
    {
       boton_jugar = new Boton_Jugar();
       record_boton =new Boton_Records();
       boton_ayuda = new Boton_Instrucciones();
              
       this.addObject(boton_jugar, ROWS/2, 5);
       this.addObject(record_boton, ROWS/2, COLS/2+COLS/2-5);
       this.addObject(boton_ayuda, ROWS/2, COLS/2);   
    }
    
    
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)
        {
          
            if(Greenfoot.mousePressed(boton_jugar))
            {
              Greenfoot.setWorld(new Cuarto());
            }
            
            /*else if(Greenfoot.mousePressed(record_boton))
            {
              Greenfoot.setWorld(new WarWorld());
            }*/
            else if(Greenfoot.mousePressed(boton_ayuda))
            {
               removeObject(boton_jugar);
               removeObject(record_boton);
               removeObject(boton_ayuda);
               setBackground("Clouds.png");
               showText("Estas son las instrucciones", 13,10);
               atras = new Boton_Atras();
               this.addObject(atras, 13, 17);              
            }            
            if(Greenfoot.isKeyDown("escape") )
               {
                 Greenfoot.setWorld(new Menu());        
               }
        }

    }
}
