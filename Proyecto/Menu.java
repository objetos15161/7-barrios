import greenfoot.*;

/**
 * Write a description of class Menu here.
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
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
    
    private Objetos flechas=new Objetos();
    private Objetos enter=new Objetos();
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
               setBackground("SLP.jpg");
               
               showText("Para Mover al personaje ", 6,3);
               showText("se utilizan las flechas ", 6,4);
               showText("del teclado ", 6,5);
               flechas.creaObjetos(11);               
               addObject(flechas, 16, 5);
               
               showText("Para seleccionar los letrros ", 6,7);
               showText("se pulsa la tecla ENTER ", 6,8);
               showText("cerca de alguno ", 6,9);               
               enter.creaObjetos(10);               
               addObject(enter, 16, 10);
               
               showText("El Objetivo del Juego es contestar las ", 13,19);
               showText("preguntas que se hagan en cada  que se ", 13,20);
               showText("tendra escenario, para cada pregunta ", 13,21);
               showText("habra una pista que buscar ", 13,22);                           
                              
               atras = new Boton_Atras();
               this.addObject(atras, 19, 1);              
            }            
            if(Greenfoot.isKeyDown("escape") )
               {
                 Greenfoot.setWorld(new Menu());        
               }
        }

    }
}
