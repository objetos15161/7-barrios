import greenfoot.*;

/**
 * Escribe una descrición de la clase Casa aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Casa extends Escenario
{
    /**
     * Act - hace lo que Casa quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        // Agrega tus códigos de acción aquí.
    }
    public void creaCasa(int num)
    {
        if(num==1)
        {
          setImage("Residencia/Casa1.png");
        }
        if(num==2)
        {
          setImage("Residencia/Casa2.png");
        }
        if(num==3)
        {
           setImage("Residencia/Casa3.png");
        }
        if(num==4)
        {
           setImage("Residencia/Casa4.png");
        }
        if(num==5)
        {
           setImage("Residencia/Casa5.png");
        }
        if(num==6)
        {
           setImage("Residencia/Casa6.png");
        }
    }
}
