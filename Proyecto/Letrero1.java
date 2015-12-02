import greenfoot.*;
import javax.swing.JOptionPane;
/**
 * Escribe una descrición de la clase Letrero1 aquí.
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany)
 * @versión (Un número de versión o una fecha)
 */
public class Letrero1 extends Nivel
{
    /**
     * Act - hace lo que Letrero1 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        setImage("Exterior/Letrero1.png");
        if(isTouching(Male.class) && Greenfoot.isKeyDown("enter") )//Pregunta tlaxcala
        {
            String inputValue = JOptionPane.showInputDialog("El 28 de noviembre de 1906 en la calle Comonfort se encuentra la casa donde murio\n a) Manuel Jose Othon b) Fransisco Gonzales Bocanegra c) Emiliano Zapata ");
             if(inputValue.equals("a")|| inputValue.equals("A"))
            {
                String input = JOptionPane.showInputDialog("¡Correcto!\n Presiona aceptar para continuar");
            }
            else
            {
                String input = JOptionPane.showInputDialog("Incorrecto intenta de nuevo\n Presiona aceptar para continuar");
            }
        }  
    }    
}
