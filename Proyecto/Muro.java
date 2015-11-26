import greenfoot.*;

/**
 * Escribe una descrición de la clase Muro aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Muro extends Habitacion
{
   static private final int ROWS = 20;
    static private final int COLS = 15;
    private Habitacion piso=new Piso();
    /**
     * Act - hace lo que Muro quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        setImage("House/Pared.png");
  
    }    
}
