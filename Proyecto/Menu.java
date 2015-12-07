import greenfoot.*;
import java.awt.Color;

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
    private Color color=Color.BLACK;
    
    
    
    private Boton_Jugar boton_jugar;
    private Boton_Atras atras;
    private Creditos creditos;
    private Boton_Instrucciones boton_ayuda;
    
    
    private Objetos flechas=new Objetos();
    private Objetos enter=new Objetos();
    /**
     * Constructor for objects of class Menu.
     * Se crea el Menu del juego.
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(ROWS,COLS,CELL_WIDTH);
        crearBotones();
        act();
    }
    public void crearBotones()//Metodo que crea los botones necesarios para el menu y los añade
    {
       boton_jugar = new Boton_Jugar();
       creditos =new Creditos();
       boton_ayuda = new Boton_Instrucciones();
       atras = new Boton_Atras();
              
       this.addObject(boton_jugar, ROWS/2, 5);
       this.addObject(creditos, ROWS/2, COLS/2+COLS/2-5);
       this.addObject(boton_ayuda, ROWS/2, COLS/2);   
    }
    
    
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)//instruccion que checa la informacion del mouse
        {
            if(Greenfoot.mousePressed(boton_jugar))//Checa si se sio click en el boton jugar
            {
              Greenfoot.setWorld(new Cuarto());
            }
            
            else 
            {
            if(Greenfoot.mousePressed(creditos))//Checa si se dio click en el boton creditos
            {
               removeObject(boton_jugar);
               removeObject(creditos);
               removeObject(boton_ayuda);
                              
               showText("Creadores del juego: ", 12,4);
               showText("Cesar Alfonso Catro Perez ", 12,7);
               showText("Maldonado Diaz Fabian Giovany ", 12,10);
               showText("Pagina para resolver las preguntas: ", 8,14);
               showText("www.agendasanluis.com", 12,16);
               showText("/siete-barrios-san-luis-potosi ", 12,18);
               
               this.addObject(atras, 19, 1);  
            }
            else 
            if(Greenfoot.mousePressed(boton_ayuda))//Checa si se dio click en el boton ayuda
            {
               removeObject(boton_jugar);
               removeObject(creditos);
               removeObject(boton_ayuda);              
               
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
               showText("preguntas que se hagan en cada escenario ", 13,20);
                                         
                              
               
               this.addObject(atras, 19, 1);              
            }            
          }
        }
    }
}
