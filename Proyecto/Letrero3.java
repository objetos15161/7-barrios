import greenfoot.*;
import javax.swing.JOptionPane;
/**
 * Escribe una descrición de la clase Letrero3 aquí.
 * 
 * @cesar4206 (Castro Pérez César Alfonso) 
 * @legio8 (Maldonado Diaz Fabian Giovany) 
 * @versión (Un número de versión o una fecha)
 */
public class Letrero3 extends Nivel
{
    /**
     * Act - hace lo que Letrero3 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        setImage("Exterior/Letrero3.png");
         if(isTouching(Male.class) && Greenfoot.isKeyDown("enter") )//Pregunta san sebastian
        {
            String inputValue = JOptionPane.showInputDialog("¿En que año se fundo el barrio de Tlaxcala?\n a) 1542 b) 1670 c) 1592");  
            if(inputValue.equals("c") || inputValue.equals("C"))
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
